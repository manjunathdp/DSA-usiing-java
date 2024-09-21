package datastructures.stack.usingLinkedList;

public class Node {
    private int value;
    private Node belowNode ;

    public Node(int value) {
        setValue(value);
        setBelowNode(null);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getBelowNode() {
        return belowNode;
    }

    public void setBelowNode(Node belowNode) {
        this.belowNode = belowNode;
    }
}
