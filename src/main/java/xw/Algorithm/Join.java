package xw.Algorithm;


import xw.Parser.Relation;
import xw.util.Pair;
import xw.util.Table;
import xw.util.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Join {

    public static Table runJoin(Table tableA, Table tableB, Pair<String, String> joinCondition, String joinMethod) {
        Table joinResultTable;
        if (joinMethod.equals("hash"))
            joinResultTable = hashJoin(tableA, tableB, joinCondition);
        else
            joinResultTable = nestedJoin(tableA, tableB, joinCondition);
        return joinResultTable;
    }


    private static Table nestedJoin(Table tableA, Table tableB, Pair<String, String> joinCondition) {
        // simple nested join algorithm
        String newTableName = String.format("(%s JOIN %s)", tableA.getTableName(), tableB.getTableName());
        ArrayList<String> newTableAttributeList = new ArrayList<String>();

        newTableAttributeList.addAll(tableA.getAttributes());
        newTableAttributeList.addAll(tableB.getAttributes());

//        System.out.println(tableA.getTableName());
//        System.out.println(tableB.getTableName());

        Table joinResultTable = new Table(newTableName, newTableAttributeList);

        for (int i=0; i<tableA.getTableSize(); ++i)
            for (int j=0; j<tableB.getTableSize(); ++j) {
                Value one = tableA.getOne(joinCondition.one, i);
                Value two = tableB.getOne(joinCondition.two, j);
                Boolean oneIsTwo = one.equals(two);
                if (oneIsTwo){
                    // success join
                    // TODO: currently only support equal-join, next to consider inequalities

                    Map<String, Value> line = new HashMap<String, Value>();
                    for (String attribute : tableA.getAttributes()) {
                        line.put(attribute, tableA.getOne(attribute, i));
                    }
                    for (String attribute : tableB.getAttributes()) {
                        line.put(attribute, tableB.getOne(attribute, j));
                    }

                    joinResultTable.putLine(line);

                }
            }


        return joinResultTable;
    }

    private static Table hashJoin(Table tableA, Table tableB, Pair<String, String> joinCondition) {
        // TODO: hash join algorithm
        return null;
    }

}
