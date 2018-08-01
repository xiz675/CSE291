package xw.util;

import java.util.ArrayList;
import java.util.List;

public class Node implements BasicGraphType{
    public int id;
    public List<String> labelList;
    public String name;

    public Node(int id, String name, ArrayList<String> labelList){
        this.id = id;
        this.name = name;
        this.labelList = labelList;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public List<String> getLabelList() {
        return labelList;
    }
}
