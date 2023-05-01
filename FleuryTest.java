import java.util.ArrayList;

public class FleuryTest {
    static Node one = new Node("one");
    static Node two = new Node("two");
    static Node three = new Node("three");
    static Node four = new Node("four");
    static Node five = new Node("five");
    static Node six = new Node("six");

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
        Node startNode = graphCreation(one, two, three, four, five, six);
        Fleury fleury = new Fleury();
        fleury.addToGraph(one);
        fleury.addToGraph(two);
        fleury.addToGraph(three);
        fleury.addToGraph(four);
        fleury.addToGraph(five);
        fleury.addToGraph(six);
        fleury.fleuryAlgorithm(startNode, 10, 6);
    }
}
