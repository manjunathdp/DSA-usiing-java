package datastructures.queue.usingLinkedList;

public class Node {
    private int value;
    private Node previousNode;

    public Node(int value) {
        this.value = value;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public int getValue() {
        return value;
    }

    public Node getPreviousNode() {
        return previousNode;
    }
}
