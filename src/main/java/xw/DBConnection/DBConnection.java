package xw.DBConnection;

import xw.util.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBConnection {
    private String host = "jdbc:mysql://localhost:3306/trumpDataBase?serverTimezone=UTC";
    private String uname = "root";
    private String upswd = "1996ahtc";
    private Connection connection;
    private Statement statement;

    public void connect(){
        System.out.println("connect to MySQL...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("load mysql driver success!");
        }
        catch (Exception e) {
            System.out.println("load mysql driver failed!");
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(host, uname, upswd);
            statement = connection.createStatement();
            System.out.println("connect database success!");
        }
        catch (Exception e) {
            System.out.println("connect database failed!");
            e.printStackTrace();
        }
    }

    public ResultSet executeSQL(String sql) {
        try {
            ResultSet resultSet = statement.executeQuery(sql);
            return resultSet;
        }
        catch (SQLException e) {
            System.out.format("Query: %s execution failed!", sql);
            return null;
        }
    }

    public Pair<Map<Integer, Node>, String> getNodeTableFromSQL(String sql) throws SQLException {
        Map<Integer, Node> nodeTable = new HashMap<Integer, Node>();
        ResultSet resultSet = executeSQL(sql);
        while (resultSet.next()) {
            int nodeID = resultSet.getInt("node_id");
            String nodeName = resultSet.getString("node_name");
            String nodeLabel = resultSet.getString("node_type");
            if (nodeTable.containsKey(nodeID))
                // just extend label list
                nodeTable.get(nodeID).labelList.add(nodeLabel);
            else{
                // create new Node
                ArrayList<String> newLabelList = new ArrayList<String>();
                newLabelList.add(nodeLabel);
                nodeTable.put(nodeID, new Node(nodeID, nodeName, newLabelList));
            }

        }

        resultSet.close();
        return new Pair<Map<Integer, Node>, String>(nodeTable, "node");
    }


    public Pair<Map<Integer, Edge>, String> getEdgeTableFromSQL(String sql) throws SQLException {
        Map<Integer, Edge> edgeTable = new HashMap<Integer, Edge>();
        ResultSet resultSet = executeSQL(sql);
        while (resultSet.next()) {
            int edgeID = resultSet.getInt("edge_id");
            int fromID = resultSet.getInt("from_node_id");
            int toID = resultSet.getInt("to_node_id");
            String edgeLabel = resultSet.getString("connection");
            if (edgeTable.containsKey(edgeID))
                // just extend edge label list
                edgeTable.get(edgeID).labelList.add(edgeLabel);
            else{
                // create new Edge
                ArrayList<String> newEdgeLabelList = new ArrayList<String>();
                newEdgeLabelList.add(edgeLabel);
                edgeTable.put(edgeID, new Edge(edgeID, fromID, toID, newEdgeLabelList));
            }
        }

        resultSet.close();
        return new Pair<Map<Integer, Edge>, String>(edgeTable, "edge");
    }



    public Table getTableFromSQL (String sql, String tableName) throws SQLException, RuntimeException {
        // just return table the same as the output from mysql

        ResultSet resultSet = executeSQL(sql);
        ResultSetMetaData metaData = resultSet.getMetaData();
        Table table;
        if (metaData.getColumnCount() == 3) {
            // node table
            ArrayList<String> attributeList = new ArrayList<String>();
            attributeList.add(tableName + ".node_id");
            attributeList.add(tableName + ".node_name");
            attributeList.add(tableName + ".node_type");
            table = new Table(tableName, attributeList);
            while (resultSet.next()) {
                int nodeID = resultSet.getInt("node_id");
                String nodeName = resultSet.getString("node_name");
                String nodeLabel = resultSet.getString("node_type");

                Map<String, Value> line = new HashMap<String, Value>();
                line.put(tableName + ".node_id", new Value(nodeID));
                line.put(tableName + ".node_name", new Value(nodeName));
                line.put(tableName + ".node_type", new Value(nodeLabel));

                table.putLine(line);
            }
        }
        else {
            // edge table
            ArrayList<String> attributeList = new ArrayList<String>();
            attributeList.add(tableName + ".edge_id");
            attributeList.add(tableName + ".from_node_id");
            attributeList.add(tableName + ".to_node_id");
            attributeList.add(tableName + ".connection");
            table = new Table(tableName, attributeList);

            while (resultSet.next()) {
                int edgeID = resultSet.getInt("edge_id");
                int fromID = resultSet.getInt("from_node_id");
                int toID = resultSet.getInt("to_node_id");
                String edgeLabel = resultSet.getString("connection");

                Map<String, Value> line = new HashMap<String, Value>();
                line.put(tableName + ".edge_id", new Value(edgeID));
                line.put(tableName + ".from_node_id", new Value(fromID));
                line.put(tableName + ".to_node_id", new Value(toID));
                line.put(tableName + ".connection", new Value(edgeLabel));

                table.putLine(line);
            }

        }

        return table;
    }






    public void close() {
        try {
            statement.close();
            connection.close();
        }
        catch (SQLException e) {
            System.out.println("closing the connection failed!");
            e.printStackTrace();
        }

    }



}
