package datastructures.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
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
        while (temp!=null) {
            System.out.print(temp.value + " => ");
            temp=temp.nextNode;
        }
        System.out.print("null");
    }
    public void append(int value) {
        Node newNode = new Node(value);
        if(head==null && tail==null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.nextNode=newNode;
            tail = newNode;
        }


        length++;
    }
}
