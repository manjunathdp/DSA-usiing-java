package datastructures.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.tail = newNode;
        this.head = newNode;
        this.length = 1;
    }
    public void getHead() {
        System.out.println("Head: " + head.value);
    }
    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }
    public void getLength() {
        System.out.println("Length: " + length);
    }
    public void printList() {
        Node temp = head;
        while (temp.nextNode!=null) {
            System.out.println(temp.value);
            temp=temp.nextNode;
        }
    }
}
