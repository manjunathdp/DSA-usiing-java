package datastructures.doublyLinkedList;
// doubly Linked list
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public boolean isEmpty(){
        return head == null;
    }

    public void getHead() {
        if(isEmpty()) {
            System.out.println("Empty Doubly Linked List");
        }
        else {
            System.out.println("Head: " + head);
        }
    }

    public void getTail() {
        if(isEmpty()) {
            System.out.println("Empty Doubly Linked List");
        }
        else {
            System.out.println("Tail: " + tail);
        }
    }
}
