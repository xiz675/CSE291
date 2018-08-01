package xw.Plan;

import xw.Algorithm.Join;
import xw.Parser.Relation;
import xw.WanderJoin.JoinGraph;
import xw.WanderJoin.WanderJoin;
import xw.util.ConsoleTable;
import xw.util.Pair;
import xw.util.Table;

import java.lang.reflect.Array;
import java.util.*;

public class Plan {

    private JoinPlanTable joinPlanTable;
    private Set<Pair<String, String>> joinConditionList;
    private String optimalJoinPlan;
    private Set<String> allNames;
    private Map<String, Set<String>> joinGraph;
    private ArrayList<Table> tableList;
    private JoinGraph joinGraphForWanderJoin;

    public Plan(ArrayList<Table> tableList, ArrayList<Relation> relationList) {
        this.tableList = tableList;
        this.joinPlanTable = new JoinPlanTable();
        // initialize the joinPlanTable
        for (Table table : tableList) {
            Set<String> entryNames = new HashSet<String>();
            entryNames.add(table.getTableName());
            joinPlanTable.putOnePlan(new JoinTableEntry(table.getTableName(), table.getTableSize(), 1, 0, entryNames));
        }

        // find all join conditions from relationList
        // e.g., Relation: (node: a) - [edge: e1] -> (node: b)
        //       join condition: <a.node_id, e1.from_node_id>, <e1.to_node_id, b.node_id>
        this.joinConditionList = new HashSet<Pair<String, String>>();
        this.allNames = new HashSet<String>();
        this.joinGraph = new HashMap<String, Set<String>>();

        for (Relation relation : relationList) {
            joinConditionList.add(new Pair<String, String>(relation.fromVertexAlias + ".node_id",
                    relation.edgeAlias + ".from_node_id"));
            joinConditionList.add(new Pair<String, String>(relation.toVertexAlias + ".node_id",
                    relation.edgeAlias + ".to_node_id"));

            allNames.add(relation.edgeAlias);
            allNames.add(relation.toVertexAlias);
            allNames.add(relation.fromVertexAlias);

            // build join graph
            addOneToJoinGraph(relation.toVertexAlias, relation.edgeAlias);
            addOneToJoinGraph(relation.edgeAlias, relation.toVertexAlias);
            addOneToJoinGraph(relation.fromVertexAlias, relation.edgeAlias);
            addOneToJoinGraph(relation.edgeAlias, relation.fromVertexAlias);
        }

        System.out.println("build join graph ....");
        this.joinGraphForWanderJoin = new JoinGraph(joinConditionList);
    }

    private void addOneToJoinGraph(String one, String two) {
        if (joinGraph.containsKey(one))
            joinGraph.get(one).add(two);
        else{
            Set<String> temp = new HashSet<String>();
            temp.add(two);
            joinGraph.put(one, temp);
        }

    }

    public Set<Pair<String, String>> getJoinConditionList() {
        return joinConditionList;
    }

    public String getOptimalJoinPlan() {
        // dynamic programming based join plan ordering

        for (int i=2; i<=allNames.size(); ++i) {
            // order grows from 2 to MAXORDER
            for (int j=1; j<=i/2; ++j) {
                // order decomposition
                ArrayList<JoinTableEntry> entryListA = this.joinPlanTable.joinTable.get(j);
                ArrayList<JoinTableEntry> entryListB = this.joinPlanTable.joinTable.get(i-j);

                // merging phase
                for (JoinTableEntry entryA: entryListA)
                    for (JoinTableEntry entryB : entryListB){
                        if (isJoinable(entryA, entryB)){
                            JoinTableEntry mergedEntry = mergeTwoEntries(entryA, entryB);
                            joinPlanTable.putOnePlan(mergedEntry);
                        }
                    }
            }
        }

        // get optimal join plan
        int minCost = Integer.MAX_VALUE;
        for (JoinTableEntry entry : this.joinPlanTable.joinTable.get(allNames.size())){
            if (entry.cost < minCost) {
                minCost = entry.cost;
                this.optimalJoinPlan = entry.joinExpression;
            }
        }

        return this.optimalJoinPlan;
    }


    private JoinTableEntry mergeTwoEntries(JoinTableEntry entryA, JoinTableEntry entryB) throws RuntimeException {
        if (isJoinable(entryA, entryB)) {
            String mergedJoinExpression = String.format("(%s JOIN %s)",
                    entryA.joinExpression, entryB.joinExpression);
            int mergedOrder = entryA.order + entryB.order;
            int mergedCost = entryA.cost + entryB.cost + entryA.size * entryB.size;

            //TODO: CHANGE SIZE BY WANDERJOIN

            // get join conditions by name
//            int mergedSize = (int) (entryA.size * entryB.size * 0.2);

            int mergedSize = WanderJoin.estimate(entryA, entryB, joinGraphForWanderJoin, tableList);

            Set<String> mergedNames = new HashSet<String>();
            mergedNames.addAll(entryA.names);
            mergedNames.addAll(entryB.names);
            return new JoinTableEntry(mergedJoinExpression, mergedSize, mergedOrder, mergedCost, mergedNames);
        }
        else {
            String output = String.format("[%s] and [%s] cannot be joined together!",
                    entryA.joinExpression, entryA.joinExpression);
            System.out.println(output);
            throw new RuntimeException(output);
        }

    }


    private boolean isJoinable(JoinTableEntry entryA, JoinTableEntry entryB) {

        //TODO: SOME BUGS, RE-WRITE...
        //TODO: it is correct now!

        Set<String> namesOfEntryA = entryA.names;
        Set<String> namesOfEntryB = entryB.names;

        Set<String> diffAB = new HashSet<String>();
        diffAB.addAll(namesOfEntryA);
        diffAB.removeAll(namesOfEntryB);
        if (!diffAB.containsAll(namesOfEntryA))
            return false;

        Set<String> nameOfACanJoinWith = new HashSet<String>();
        for (String nameA : namesOfEntryA)
            nameOfACanJoinWith.addAll(joinGraph.get(nameA));
        nameOfACanJoinWith.removeAll(namesOfEntryA);


        // check if one of name in B also in nameOfACanJoinWith
        for (String nameB : namesOfEntryB)
            if (nameOfACanJoinWith.contains(nameB))
                return true;

        return false;

    }






    public void printJoinConditions() {
        for (Pair<String, String> joinCondition : joinConditionList)
            System.out.format("%s JOIN %s \n", joinCondition.one, joinCondition.two);
    }

    public void showPlanTable() {
        String[] headers = {"order", "join_expression", "estimated_cost"};
        String[][] rows = new String[joinPlanTable.getPlanTableSize()][4];

        int i = 0;
        for (int order : joinPlanTable.joinTable.keySet()) {
            for (JoinTableEntry joinTableEntry : joinPlanTable.joinTable.get(order)) {
                rows[i][0] = "" + joinTableEntry.order;
                rows[i][1] = String.format("[ %s ]", joinTableEntry.joinExpression);
                rows[i][2] = "" + joinTableEntry.cost;
                i += 1;
            }
        }
        System.out.println("plan table: ");
        System.out.println(new ConsoleTable(headers, rows));

    }



}
