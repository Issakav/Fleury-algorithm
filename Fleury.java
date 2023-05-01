import java.util.ArrayList;

import javax.swing.text.html.FormView;

public class Fleury {



    ArrayList<Node> graph = new ArrayList<Node>();

    ArrayList<Boolean> visited = new ArrayList<Boolean>(6);

    public void initializeVisited(){
        for (int i = 0; i < 6; i++) {
            visited.add(false);
        }
    }


    public void addToGraph(Node node){
        graph.add(node);
    }

    public Node findStartVert(ArrayList<Node> graph) {
        for (Node n: graph) {
            int deg = n.getAdjacencyList().size();
            if (deg % 2 == 1) {
                return n;
            }
        }
        return null; 
    }

    public int dfs(Node prev, Node start){
        int count = 1;
        if (!(visited.get(graph.indexOf(start)))) {
            visited.set(graph.indexOf(start),true);
        }
        for (Node n: graph) {
            if (!(prev == n)) {
                if (!(visited.get(graph.indexOf(n)))) {
                    if (n.getAdjacencyList().contains(start)) {
                        count = count + dfs(start, n);
                    }
                }
            }
        }
        return count;
    }

    public boolean isBridge(Node start, Node end){
        int degree = 0;
        for (Node adjacentNode : end.adjacencyList) {
            degree++;
        }
        if (degree > 1){
            return false;
        }
        return true;
    }


    public void fleuryAlgorithm(Node startNode, int edges, int vertices){


        int numEdges = edges;
        int numVertices = vertices;

        for (Node node : startNode.getAdjacencyList()) {
            
            visited.set(graph.indexOf(startNode), false);

            if (isBridge(startNode, node)){
                numVertices--;
            }

            int count = dfs(startNode, node);

            if (Math.abs(numVertices - count) <= 2){
                
                System.out.println(startNode.name + " -> " + node.name);

                if (isBridge(startNode, node)){
                    numVertices--;
                }

                node.adjacencyList.remove(startNode);
                startNode.adjacencyList.remove(node);
                numEdges--;
                fleuryAlgorithm(node, numEdges, numVertices);
            }
        }

    }
}
