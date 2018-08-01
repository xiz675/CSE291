package xw.Plan;

import xw.util.Pair;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Set;

public class JoinTableEntry {
    public String joinExpression;
    public Set<String> names;
    public int size;
    public int order;
    public int cost;


    public JoinTableEntry(String joinExpression, int size, int order, int cost, Set<String> names) {
        assert order > 0;

        this.joinExpression = joinExpression;
        this.size = size;
        this.order = order;
        this.names = names;
        this.cost = cost;
    }

    public Boolean isAtomic() {
        return this.order == 1;
    }


}
