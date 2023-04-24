import java.util.ArrayList;

public class Fleury {
    ArrayList<Node> graph = new ArrayList<Node>();

    public Node findStartVert(ArrayList<Node> graph) {
        for (Node n: graph) {
            int deg = n.getAdjacencyList().size();
            if (deg % 2 == 1) {
                return n;
            }
        }
        return null;
    }

    public int dfs(Node prev, Node start, ArrayList<Node> visited){
        int count = 1;
        if (!(visited.contains(start))) {
            visited.add(start);
        }
        for (Node n: graph) {
            if (!(prev == n)) {
                if (!(visited.contains(n))) {
                    if (n.getAdjacencyList().contains(start)) {
                        count = count + dfs(start, n, visited);
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
}
