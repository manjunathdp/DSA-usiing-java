package datastructures.stack.usingLinkedList;

public class Node {
    private int value;
    private Node bottomNode;

    public Node(int value) {
        this.value = value;
        bottomNode = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getBottomNode() {
        return bottomNode;
    }

    public void setBottomNode(Node bottomNode) {
        this.bottomNode = bottomNode;
    }
}
