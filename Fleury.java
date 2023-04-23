public class Fleury {
    

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
