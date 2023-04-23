import java.util.ArrayList;

public class Node {
    ArrayList<Node> adjacencyList;

    public Node(){

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
