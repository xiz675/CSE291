package xw.util;

import com.google.common.graph.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.sql.*;

public class GraphLoader {
    public MutableGraph<Integer> graph;
    private int numOfNodes;
    private int numOfEdges;

    public void init(){
        System.out.println("init graph ...");
        this.graph = GraphBuilder.directed().build();
        this.numOfNodes = 0;
        this.numOfEdges = 0;
    }

    public void loadGraphFromFile(String filePath){
        init();
        System.out.println("load graph data from file: " + filePath);
        try {
            File file = new File(filePath);
            if (file.isFile() && file.exists()){
                InputStreamReader read = new InputStreamReader(new FileInputStream(file));
                BufferedReader bufferedReader = new BufferedReader(read);

                String textLine = null;
                int i = 0;
                while ((textLine = bufferedReader.readLine()) != null){
                    if (i % 1000 == 0)
                        System.out.println(textLine);
                    i += 1;
                    String[] rawDataLine = textLine.split(" ");
                    int edgeID = Integer.parseInt(rawDataLine[0]);
                    int fromNodeID = Integer.parseInt(rawDataLine[1]);
                    int toNodeID = Integer.parseInt(rawDataLine[2]);
                    this.graph.putEdge(fromNodeID, toNodeID);
                }
                this.numOfNodes = graph.nodes().size();
                this.numOfEdges = graph.edges().size();
                System.out.println("graph loading ... done!");
                System.out.format("number of nodes: %d\n", this.numOfNodes);
                System.out.format("number of edges: %d\n", this.numOfEdges);
            }
            else
                System.out.println("no such file!");
        }
        catch (Exception e){
            System.out.println("error in reading file!");
            e.printStackTrace();
        }
    }


    public void loadGraphFromDB() {
        // TODO:should add SQL support for loading graph from relational database
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB";
        String USER = "root";
        String PASS = "123456";

        Connection conn = null;
        Statement stmt = null;


    }

    public void main(){
        String filePath = "/home/kyliu/Desktop/temp/cal.cedge";
        loadGraphFromFile(filePath);
    }


}
