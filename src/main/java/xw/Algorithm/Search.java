package xw.Algorithm;

import com.google.common.graph.MutableGraph;

import java.util.*;
//import java.util.Set;

public class Search {
    private MutableGraph<Integer> graph;
    private int sourceNode;
    private int destinationNode;
    private String searchStyle;

    public Search(MutableGraph<Integer> graph, int sourceNode, int destinationNode, String searchStyle){
        this.graph = graph;
        this.sourceNode = sourceNode;
        this.destinationNode = destinationNode;
        if (! (searchStyle.equals("bfs") || searchStyle.equals("dfs")))
            // if wrong input, ust BFS as default setting
            this.searchStyle = "bfs";
        else
            this.searchStyle = searchStyle;
    }

    public boolean executeSearch(){
        boolean result;
        switch (searchStyle) {
            case "bfs":
                result = BFS();
                break;
            case "dfs":
                result = DFS();
                break;
            default:
                result = BFS();
        }
        return result;
    }

    private boolean BFS(){
        // BFS search
        // TODO: record path from source to destination
        if (!(graph.nodes().contains(sourceNode) || graph.nodes().contains(destinationNode)))
            // source or desitination not in graph, directly return an empty list
            return false;
        else{
            Queue<Integer> queue = new LinkedList<Integer>();
            Set<Integer> visited = new HashSet<Integer>();

            queue.offer(sourceNode);

            while (!queue.isEmpty()){
                int currentVisited = queue.poll();
                if (currentVisited == destinationNode)
                    return true;
                visited.add(currentVisited);
                for (int nextVisited : graph.successors(currentVisited))
                    if (!visited.contains(nextVisited))
                        queue.offer(nextVisited);
            }

            // not found
            return false;
        }
    }


    private boolean DFS(){
        // DFS search
        // TODO: code for DFS
        return true;
    }



}
