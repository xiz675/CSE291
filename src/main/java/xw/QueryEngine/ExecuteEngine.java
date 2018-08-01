package xw.QueryEngine;

import xw.Algorithm.Join;
import xw.DBConnection.DBConnection;
import xw.Parser.*;
import xw.Plan.Plan;
import xw.WanderJoin.JoinGraph;
import xw.util.ConsoleTable;
import xw.util.Pair;
import xw.util.ParseResults;
import xw.util.Table;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


import java.sql.SQLException;
import java.util.*;

public class ExecuteEngine {

    Set<String> nodeNames;
    Set<String> edgeNames;
    ArrayList<String> returnNames;
    ParseResults parseResults;
    DBConnection connection;

    public ExecuteEngine(ParseResults parseResults) {
        // connect to db
        this.connection = new DBConnection();
        this.connection.connect();

        this.parseResults = parseResults;
        this.nodeNames = new HashSet<String>();
        this.edgeNames = new HashSet<String>();
        this.returnNames = new ArrayList<String>();

        // find all vertex/edge names in query
        for (Relation relation : parseResults.relationList) {
            nodeNames.add(relation.fromVertexAlias);
            nodeNames.add(relation.toVertexAlias);
            edgeNames.add(relation.edgeAlias);
        }

        // list of return names
        for (Return ret : parseResults.returnList) {
            returnNames.add(ret.edgeOrVertexAlias + "." + ret.property);
        }
    }


    public void executeQuery() throws SQLException {
        // show parse results
        System.out.println("Parsing results: ");
        System.out.println("|- relations list:");
        for (Relation relation : parseResults.relationList) {
            System.out.format("   |- (Node %s) - [Edge %s] -> (Node %s) \n",
                    relation.fromVertexAlias, relation.edgeAlias, relation.toVertexAlias);
        }
        System.out.println("|- constraints list:");
        for (Constrain constrain : parseResults.constrainList) {
            System.out.format("   |- Variable %s.%s == %s \n",
                    constrain.edgeOrVertexAlias, constrain.property, constrain.rightConstant);
        }
        System.out.println("|- return list:");
        for (Return ret : parseResults.returnList) {
            System.out.format("   |- Variable %s.%s \n",
                    ret.edgeOrVertexAlias, ret.property);
        }

        // get initial table list through selections
        ArrayList<Table> tableList = getInitialTableList();

        // generate join plan
        Plan plan = new Plan(tableList, parseResults.relationList);
        String optimalJoinPlan = plan.getOptimalJoinPlan();
        plan.showPlanTable();

        // execute the optimal plan
        Table resultTable = executePlan(optimalJoinPlan, tableList, plan.getJoinConditionList());
        Pair<String[], String[][]> pair = resultTable.toStringRowsByOrder(returnNames);
        System.out.println("query result is:");
        System.out.println(new ConsoleTable(pair.one, pair.two));
        System.out.format("query result contains %d lines \n", resultTable.getTableSize());
    }

    public Table executePlan(String optimalJoinPlan, ArrayList<Table> tableList, Set<Pair<String, String>> joinConditionList) {
        // execute the optimal join plan
        System.out.format("optimal join plan is: %s \n", optimalJoinPlan);
        String expr = optimalJoinPlan.replace("JOIN", "-");
        Table resultTable;
        Stack<Character> ops = new Stack<Character>();
        Stack<Table> vals = new Stack<Table>();

//        System.out.println("stack pop sequence: ");

        for (int i = 0; i < expr.length(); ++i) {
            if (expr.charAt(i) == '(' || expr.charAt(i) == ' ')
                continue;
            else if (expr.charAt(i) == '-')
                ops.push('-');
            else if (expr.charAt(i) == ')') {
                //TODO: process join
                ops.pop();
                Table A = vals.pop();
                Table B = vals.pop();
//                System.out.format("%s JOIN %s \n", A.getTableName(), B.getTableName());

                Pair<String, String> condition;
                Pair<String, String> joinCondition = findJoinConditionByTable(A, B, joinConditionList);
                Pair<String, String> joinConditionReverse = new Pair<String, String>(joinCondition.two, joinCondition.one);
                if (joinCondition.one.split("\\.")[0].equals(A.getTableName()) &&
                        joinCondition.two.split("\\.")[0].equals(B.getTableName()))
                    condition = joinCondition;
                else
                    condition = joinConditionReverse;
//                vals.push(Join.runJoin(A, B, condition, "nested"));

                try {
                    vals.push(Join.runJoin(A, B, joinCondition, "nested"));
                } catch (Exception e) {
                    vals.push(Join.runJoin(A, B, joinConditionReverse, "nested"));
                }
            } else {
                // push values to stack
                vals.push(findTableByName(String.valueOf(expr.charAt(i)), tableList));
            }

        }

        return vals.pop();
    }


    private Table findTableByName(String tableName, ArrayList<Table> tableList) throws RuntimeException {
        for (Table table : tableList) {
            if (tableName.equals(table.getTableName()))
                return table;
        }
        String output = String.format("table: %s not found!", tableName);
        throw new RuntimeException(output);
    }

    private Pair<String, String> findJoinConditionByTable(Table tableA, Table tableB,
                                                          Set<Pair<String, String>> joinConditionList) throws RuntimeException {
        for (String attributeA : tableA.getAttributes())
            for (String attributeB : tableB.getAttributes()) {
                for (Pair<String, String> pair : joinConditionList) {

                    boolean test1 = pair.one.equals(attributeA);
                    boolean test2 = pair.two.equals(attributeB);
                    boolean test3 = pair.one.equals(attributeB);
                    boolean test4 = pair.two.equals(attributeA);
                    if ((test1 && test2) || (test3 && test4))
                        return pair;
                }
            }

        String output = String.format("join condition of table: %s and table: %s not found!",
                tableA.getTableName(), tableB.getTableName());
        throw new RuntimeException(output);
    }


    private Pair<String, ArrayList<Constrain>> constrainsOfVariable(String edgeOrVertexAlias) throws RuntimeException {
        ArrayList<Constrain> constrains = new ArrayList<Constrain>();

        for (Constrain constrain : parseResults.constrainList) {
            if (edgeOrVertexAlias.equals(constrain.edgeOrVertexAlias)) {
                constrains.add(constrain);
            }
        }

        String type;

        if (nodeNames.contains(edgeOrVertexAlias))
            type = "node";
        else if (edgeNames.contains(edgeOrVertexAlias))
            type = "type";
        else
            throw new RuntimeException("name does not exist!");

        return new Pair<String, ArrayList<Constrain>>(type, constrains);
    }

    public Table getOneTable(String edgeOrVertexAlias) throws SQLException, RuntimeException {
        Pair<String, ArrayList<Constrain>> pair = constrainsOfVariable(edgeOrVertexAlias);
        String sql = SQLGenerator.generateOneSQL(pair);
        return this.connection.getTableFromSQL(sql, edgeOrVertexAlias);
    }

    private ArrayList<Table> getInitialTableList() throws SQLException {
        ArrayList<Table> inputTables = new ArrayList<Table>();

        for (String nodeName : nodeNames) {
            inputTables.add(getOneTable(nodeName));
        }

        for (String edgeName : edgeNames) {
            inputTables.add(getOneTable(edgeName));
        }
        return inputTables;
    }

    private void printFinalResult(Table finalTable) {
        Pair<String[], String[][]> pair = finalTable.toStringRowsByOrder(returnNames);
        ConsoleTable consoleTable = new ConsoleTable(pair.one, pair.two);
        System.out.println(consoleTable);
    }

    public void close() {
        this.connection.close();
    }


}