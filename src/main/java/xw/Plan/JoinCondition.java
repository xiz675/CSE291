package xw.Plan;

import xw.util.Pair;
import xw.util.Table;

public class JoinCondition {
    public Table tableA;
    public Table tableB;
    public Pair<String, String> joinConditionPair;

    public JoinCondition(Table tableA, Table tableB, Pair<String, String> joinConditionPair) {
        this.tableA = tableA;
        this.tableB = tableB;
        this.joinConditionPair = joinConditionPair;
    }

}
