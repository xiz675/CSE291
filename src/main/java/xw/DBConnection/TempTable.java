package xw.DBConnection;

import xw.util.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TempTable<T> {
    public String tableType;
    public ArrayList<T> tableData;

    public TempTable(String tableType){
        if (tableType.equals("node"))
            this.tableType = "node";
        else
            this.tableType = "edge";
        tableData = new ArrayList<T>();
    }

    public int getSize(){return tableData.size();}

    public void addOne(T data) {
        this.tableData.add(data);
    }

    public void printTable(){

    }



}
