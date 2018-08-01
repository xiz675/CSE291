package xw.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Table {
    private String tableName;
    private int numOfAttributes;
    private int tableSize;
    private Map<String, ArrayList<Value>> tableData;
    // TODO: index for table
    public Map<String, Map<String, ArrayList<Integer>>> indexMap;

    public Table(String tableName, ArrayList<String> attributeList) {
        this.tableName = tableName;
        this.tableData = new HashMap<String, ArrayList<Value>>();
        this.numOfAttributes = attributeList.size();
        this.indexMap = new HashMap<String, Map<String, ArrayList<Integer>>>();
        this.tableSize = 0;
        for (String attribute : attributeList){
            tableData.put(attribute, new ArrayList<Value>());
        }
    }

    public int getNumOfAttributes() {
        return numOfAttributes;
    }

    public int getTableSize() {
        return tableSize;
    }

    public Set<String> getAttributes() {
        return tableData.keySet();
    }

    public int size() {
        return tableSize;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    private void putOne(String attributeName, Value attributeValue) throws RuntimeException {
        if (tableData.containsKey(attributeName)) {
            tableData.get(attributeName).add(attributeValue);
        }
        else {
            String outputString = String.format("table: %s does not contain attribute %S!", tableName, attributeName);
            System.out.println(outputString);
            throw new RuntimeException(outputString);
        }

    }

    public void putLine(Map<String, Value> lineData) {
        try {
            for (String key : lineData.keySet()) {
                putOne(key, lineData.get(key));
            }
            tableSize += 1;
        }

        catch (Exception e) {
            System.out.println("add data line failed!");
            e.printStackTrace();
        }

    }


    public Value getOne(String attributeName, int id) throws RuntimeException {
        if (tableData.containsKey(attributeName))
            return tableData.get(attributeName).get(id);
        else {
            String outputString = String.format("table: %s does not contain attribute %S!", tableName, attributeName);
            //System.out.println(outputString);
            throw new RuntimeException(outputString);
        }
    }

    public Map<String, Value> getRow(int id) {
        Map<String, Value> row = new HashMap<String, Value>();

        for (String attribute : getAttributes()){
            row.put(attribute, tableData.get(attribute).get(id));
        }

        return row;
    }

    public ArrayList<Value> getColumn(String attributeName) throws RuntimeException {
        if (tableData.containsKey(attributeName))
            return tableData.get(attributeName);
        else {
            String outputString = String.format("table: %s does not contain attribute %S!", tableName, attributeName);
            System.out.println(outputString);
            throw new RuntimeException(outputString);
        }
    }

    public Pair<String[], String[][]> toStringRows() {
        String[] headers = new String[numOfAttributes];
        getAttributes().toArray(headers);
        String[][] rows = new String[tableSize][numOfAttributes];

        for (int i=0; i<tableSize; ++i)
            for (int j=0; j<numOfAttributes; ++j) {
                rows[i][j] = getOne(headers[j], i).toString();
            }

        return new Pair<String[], String[][]>(headers, rows);
    }

    public Pair<String[], String[][]> toStringRowsByOrder(ArrayList<String> attributeList) {
        String[] headers = new String[attributeList.size()];
        String[][] rows = new String[tableSize][attributeList.size()];

        attributeList.toArray(headers);

        for (int i=0; i<tableSize; ++i){
            for (int j=0; j<headers.length; ++j) {
                rows[i][j] = getOne(headers[j], i).toString();
            }
        }

        return new Pair<String[], String[][]>(headers, rows);
    }

    public void buildIndexOfAttribute(String attributeName) throws RuntimeException {
        // build index for given attribute
        if (this.tableData.containsKey(attributeName)) {
            Map<String, ArrayList<Integer>> index = new HashMap<String, ArrayList<Integer>>();
            ArrayList<Value> values = tableData.get(attributeName);
            for (int i=0; i<values.size(); ++i) {
                if (index.containsKey(values.get(i)))
                    index.get(values.get(i)).add(i);
                else {
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(i);
                    index.put(values.get(i).toString(), temp);
                }
            }
            this.indexMap.put(attributeName, index);
        }
        else {
            String outputString = String.format("table: %s does not contain attribute %S!", tableName, attributeName);
            System.out.println(outputString);
            throw new RuntimeException(outputString);
        }

    }

//    public Value getOneFromIndex()




}
