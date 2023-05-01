import java.util.ArrayList;

public class FleuryTest {
    Node one = new Node("one");
    Node two = new Node("two");
    Node three = new Node("three");
    Node four = new Node("four");
    Node five = new Node("five");
    Node six = new Node("six");

    public static Node graphCreation(Node one, Node two, Node three, Node four, Node five, Node six) {
        one.addAdjacent(two);
        one.addAdjacent(three);
        two.addAdjacent(one);
        two.addAdjacent(three);
        two.addAdjacent(four);
        two.addAdjacent(five);
        three.addAdjacent(one);
        three.addAdjacent(two);
        three.addAdjacent(four);
        three.addAdjacent(five);
        four.addAdjacent(two);
        four.addAdjacent(three);
        four.addAdjacent(five);
        four.addAdjacent(six);
        five.addAdjacent(two);
        five.addAdjacent(three);
        five.addAdjacent(four);
        five.addAdjacent(six);
        six.addAdjacent(four);
        six.addAdjacent(five);
        return one;
    }

    public static void main(String[] args) {
        Node startNode = graphCreation(new Node("one"), new Node("two"), new Node("three"), new Node("four"), new Node("five"), new Node("six"));
        Fleury fleury = new Fleury();
        fleury.fleuryAlgorithm(startNode, 10, 6);
    }
}
