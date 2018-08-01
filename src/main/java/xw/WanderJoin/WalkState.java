package xw.WanderJoin;

import xw.util.Table;
import xw.util.Value;

import java.util.ArrayList;
import java.util.Map;

public class WalkState {
    private String fromTableName;
    private String toTableName;
    private String fromAttribute;
    private String toAttribute;
    private int currentTableID;
    private boolean isFinished;
    private double prob;
    private boolean isSuccess;
    private ArrayList<Table> tableList;

    public WalkState(String fromTableName, String toTableName,
                     String fromAttribute, String toAttribute, ArrayList<Table> tableList) {
        this.fromTableName = fromTableName;
        this.fromAttribute = fromAttribute;
        this.toTableName = toTableName;
        this.toAttribute = toAttribute;
        this.currentTableID = currentTableID;
        this.isSuccess = true;
        this.tableList = tableList;

        this.currentTableID = (int) (Math.random() * findTableByName(fromTableName, tableList).size());

        this.prob = 1.0 / findTableByName(fromTableName, tableList).size();
    }

    public void walk(String nextNextTableName, String nextNextAttribute) {
        Table tempFromTable = findTableByName(fromTableName, tableList);
        Table tempToTable = findTableByName(toTableName, tableList);

//        if (!tempFromTable.indexMap.containsKey(fromAttribute))
//            tempFromTable.buildIndexOfAttribute(fromTableName);
        if (!tempToTable.indexMap.containsKey(toAttribute))
            tempToTable.buildIndexOfAttribute(toAttribute);

        Value fromValue = tempFromTable.getOne(fromAttribute, currentTableID);
        ArrayList<Integer> toJoinedList = new ArrayList<Integer>();


        for (int toID : tempToTable.indexMap.get(toAttribute).get(fromValue)) {
            toJoinedList.add(toID);
        }

        if (toJoinedList.size() == 0)
            this.isSuccess = false;
        else {
            this.currentTableID = toJoinedList.get((int) (Math.random() * toJoinedList.size()));
            this.prob *= (1.0 / toJoinedList.size());
        }

        if (nextNextTableName.equals("!") && nextNextAttribute.equals("!")) {
            return;
        }


        fromTableName = toTableName;
        toTableName = nextNextTableName;
        fromAttribute = toAttribute;
        toAttribute = nextNextAttribute;


    }


    private Table findTableByName(String tableName, ArrayList<Table> tableList) throws RuntimeException {
        for (Table table : tableList) {
            if (tableName.equals(table.getTableName()))
                return table;
        }
        String output = String.format("table: %s not found!", tableName);
        throw new RuntimeException(output);
    }



}
