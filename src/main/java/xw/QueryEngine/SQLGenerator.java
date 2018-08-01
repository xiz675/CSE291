package xw.QueryEngine;

import xw.Parser.Constrain;
import xw.util.Pair;

import java.util.ArrayList;

public class SQLGenerator {
    // generate mysql query through constraints from parser

    public static String generateOneSQL(Pair<String, ArrayList<Constrain>> pair) throws RuntimeException {
        // SQL: select [one] from [two] where [three];
        String formatString = "select %s from %s where %s;";
        if (pair.two.size() == 0)
            // no constraints
            formatString = "select %s from %s";
        String one = "*";
        String two;
        if (pair.one.equals("node"))
            two = "entities";
        else
            two = "connections";
        String three = "";
        for (int i=0; i<pair.two.size(); ++i) {
            if (pair.two.get(i).property.equals("label"))
                pair.two.get(i).property = "node_type";
            if (i == pair.two.size()-1)
                three += (pair.two.get(i).property + " = " + "\'" + pair.two.get(i).rightConstant + "\'");
            else
                three += (pair.two.get(i).property + " = " + "\'" + pair.two.get(i).rightConstant + "\'" + " AND ");
        }

        return String.format(formatString, one, two, three);
    }

}
