package xw.WanderJoin;

import com.google.common.graph.*;
import xw.util.Pair;


import java.util.*;


public class JoinGraph {

    // node in graph: table name
    // edge in graph: join condition

    private MutableValueGraph<String, Map<String, String>> myJoinGraph;
    private String[] globalPath;


    public JoinGraph(Set<Pair<String, String>> joinConditionList) {
        // init the graph
        this.myJoinGraph = ValueGraphBuilder.undirected().build();

        // build join graph based on join conditions
        for (Pair<String, String> joinCondition : joinConditionList) {
            String vertexAlias = joinCondition.one.split("\\.")[0];
            String edgeAlias = joinCondition.two.split("\\.")[0];
            String joinAttributeOnVertex = joinCondition.one;
            String joinAttributeOnEdge = joinCondition.two;

            Map<String, String> edgeValue = new HashMap<String, String>();
            edgeValue.put(vertexAlias, joinAttributeOnVertex);
            edgeValue.put(edgeAlias, joinAttributeOnEdge);

            this.myJoinGraph.putEdgeValue(vertexAlias, edgeAlias, edgeValue);
        }

        findGlobalPath();
    }

    public Set<String> getNodesInGraph() {
        return myJoinGraph.nodes();
    }

    public int getNumberOfNodes() {
        return myJoinGraph.nodes().size();
    }


    private void findGlobalPath() {
        String start = "";
        for (String node : myJoinGraph.nodes()) {
            if (myJoinGraph.adjacentNodes(node).size() == 1) {
                start = node;
                break;
            }
        }
        Set<String> visited = new HashSet<>();
        this.globalPath = new String[myJoinGraph.nodes().size()];
        int i = 0;
        while (true) {
            visited.add(start);
            this.globalPath[i] = start;
            i += 1;
            for (String temp : myJoinGraph.adjacentNodes(start)) {
                if (visited.contains(temp))
                    continue;
                else {
                    start = temp;
                    break;
                }
            }

            if (i == myJoinGraph.nodes().size())
                break;
        }
    }

    public String[] getAPathByNamesOnGraph(Set<String> names) throws RuntimeException {
        String[] path = new String[names.size()];
        int i = 0;
        for (String pp : globalPath) {
            if (names.contains(pp)) {
                path[i] = pp;
                i += 1;
            }
        }

        return path;

    }


//    public String[] getAPathByNamesOnGraph(Set<String> names) throws RuntimeException {
//        // TODO: add walk plan optimization in the future ....
//
//        String[] path = new String[names.size()];
//
//        for (String name : names) {
//            // init search
//            Set<String> visited = new HashSet<String>();
//            Stack<String> stack = new Stack<String>();
//            stack.push(name);
//
//            int i = 0;
//
//            while (stack.size() > 0) {
//                String currentVisit = stack.pop();
//                visited.add(currentVisit);
//                for (String temp : myJoinGraph.adjacentNodes(currentVisit)) {
//                    if (!visited.contains(temp) && names.contains(temp))
//                        stack.push(temp);
//                }
//                path[i] = currentVisit;
//                i += 1;
//            }
//
//            if (i == names.size())
//                // successfully find a path
//                return path;
//        }
//        throw new RuntimeException("failed to find a valid path!");
//    }


    public ArrayList<Pair<String, String>> getAttributePathOnGraph(String[] path) throws RuntimeException {
        ArrayList<Pair<String, String>> attributePath = new ArrayList<>();
        for (int i=0; i<path.length-1; ++i) {
            Map<String, String> edgeMap = myJoinGraph.edgeValueOrDefault(path[i], path[i + 1], null);
            if (edgeMap == null){
                System.out.println(this.myJoinGraph);
                throw new RuntimeException("path is not valid!");
            }

            String fromAttribute = edgeMap.get(path[i]);
            String toAttribute = edgeMap.get(path[i+1]);
            attributePath.add(new Pair<String, String>(fromAttribute, toAttribute));
        }
        return attributePath;
    }


}
