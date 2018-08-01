package xw.Plan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JoinPlanTable {

    // map <order, listOfPlan>
    public Map<Integer, ArrayList<JoinTableEntry>> joinTable;
    private int planTableSize;


    public JoinPlanTable() {
        joinTable = new HashMap<Integer, ArrayList<JoinTableEntry>>();
        planTableSize = 0;
    }


    public void putOnePlan(JoinTableEntry joinTableEntry) {
        if (joinTable.containsKey(joinTableEntry.order)) {
            joinTable.get(joinTableEntry.order).add(joinTableEntry);
        }
        else {
            ArrayList<JoinTableEntry> temp = new ArrayList<JoinTableEntry>();
            temp.add(joinTableEntry);
            joinTable.put(joinTableEntry.order, temp);
        }
        planTableSize += 1;
    }

    public int getPlanTableSize() {
        return planTableSize;
    }


}
