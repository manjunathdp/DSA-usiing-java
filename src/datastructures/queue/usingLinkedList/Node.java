package datastructures.queue.usingLinkedList;

public class Node {
    private int value;
    private Node nextNode;

    public Node(int value) {
        this.value = value;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public int getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }
}
