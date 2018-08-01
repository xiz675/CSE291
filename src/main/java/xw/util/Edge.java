package xw.util;

import java.util.ArrayList;
import java.util.List;

public class Edge implements BasicGraphType{
    public int edgeID;
    public int fromID;
    public int toID;
    public List<String> labelList;

    public Edge(int edgeID, int fromID, int toID, ArrayList<String> labelList){
        this.edgeID = edgeID;
        this.fromID = fromID;
        this.toID = toID;
        this.labelList = labelList;
    }


    @Override
    public int getID() {
        return this.edgeID;
    }

    @Override
    public List<String> getLabelList() {
        return labelList;
    }


}
