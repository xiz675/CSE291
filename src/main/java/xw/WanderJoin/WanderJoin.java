package xw.WanderJoin;

import xw.Plan.JoinTableEntry;
import xw.util.Pair;
import xw.util.Table;
import xw.util.Value;

import java.util.*;

public class WanderJoin {

    // for estimate table size after a sequence of join operations

    public static int estimate(JoinTableEntry entryA, JoinTableEntry entryB, JoinGraph joinGraph,
                               ArrayList<Table> tableList) {
        // TODO: to consider more complex cases, for example star join...
        // TODO: add walk plan optimization

        // estimate the size of two merged tables

        Set<String> namesAB = new HashSet<String>();
        namesAB.addAll(entryA.names);
        namesAB.addAll(entryB.names);

        String[] path = joinGraph.getAPathByNamesOnGraph(namesAB);
        ArrayList<Pair<String, String>> attributePairPath = joinGraph.getAttributePathOnGraph(path);

        int MAX_WALK_NUM = 100;
        int count = 0;
        for (int i=0; i<MAX_WALK_NUM; ++i) {
            Pair<Integer, Double> walkResultPair = oneWalkOnGraph(attributePairPath, joinGraph, tableList);
            if (walkResultPair.one == 0) continue;
            else
                count += (int) (1.0 / walkResultPair.two);
        }

        return count/10;
    }



    private static Pair<Integer, Double> oneWalkOnGraph(ArrayList<Pair<String, String>> attributePairPath,
                                                        JoinGraph joinGraph, ArrayList<Table> tableList) {
        // init
        int count = 1;

        String nameOfFirstTable = attributePairPath.get(0).one.split("\\.")[0];
        Table firstTable = findTableByName(nameOfFirstTable, tableList);
        int currentVisitID = (int) (Math.random() * firstTable.getTableSize());
        double probability = 1.0 / firstTable.getTableSize();

        for (Pair<String, String> joinConditionPair : attributePairPath) {
            String nameOfTableA = joinConditionPair.one.split("\\.")[0];
            String attrOfTableA = joinConditionPair.one;
            String nameOfTableB = joinConditionPair.two.split("\\.")[0];
            String attrOfTableB = joinConditionPair.two;

            Table tableA = findTableByName(nameOfTableA, tableList);
            Table tableB = findTableByName(nameOfTableB, tableList);

            if (!tableB.indexMap.containsKey(attrOfTableB))
                tableB.buildIndexOfAttribute(attrOfTableB);

            Value valueOfCurrentVisitID = tableA.getOne(attrOfTableA, currentVisitID);

            ArrayList<Integer> matchedIDInNextTable = tableB.indexMap.get(attrOfTableB).get(valueOfCurrentVisitID.toString());
            if (matchedIDInNextTable == null) {
                // walk failed!
                count = 0;
                break;
            }

            currentVisitID = matchedIDInNextTable.get((int) (Math.random() * matchedIDInNextTable.size()));
            probability *= 1.0 / matchedIDInNextTable.size();
        }

        return new Pair<>(count, probability);
    }

    private static Table findTableByName(String tableName, ArrayList<Table> tableList) throws RuntimeException {
        for (Table table : tableList) {
            if (tableName.equals(table.getTableName()))
                return table;
        }
        String output = String.format("table: %s not found!", tableName);
        throw new RuntimeException(output);
    }

}
