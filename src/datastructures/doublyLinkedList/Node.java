package datastructures.doublyLinkedList;
//Node class
public class Node {
    Node previousNode;
    int value;
    Node nextNode;
// Constructor
    public Node(int value) {
        this.value = value;
        previousNode = null;
        nextNode = null;
    }
}
