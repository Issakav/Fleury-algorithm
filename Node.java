import java.util.ArrayList;

public class Node {
    ArrayList<Node> adjacencyList;
    String name;

    public Node(String name){
        this.name = name;
    }

    public ArrayList<Node> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(ArrayList<Node> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public void addAdjacent(Node adjacentNode){
        adjacencyList.add(adjacentNode);
    }
}
