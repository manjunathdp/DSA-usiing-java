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
        System.out.println("null");
    }
    public void append(int value) {
        Node newNode = new Node(value);
        if(head==null) {
            head = newNode;
        }
        else {
            tail.nextNode=newNode;
        }
        tail = newNode;
        length++;
    }
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (head==null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.nextNode=head;
            head=newNode;
        }
    }
    public void /* Node */ removeLast() {
        if(head==null && tail==null) {
            System.out.println("List is Empty");
            //return null;
        }
        if (head==tail) {
            //Node lastNode=head;
            head = null;
            tail = null;
            //return lastNode;
        }
        Node temp = head;
        Node pre = head;
        while (temp.nextNode!=null){
            pre=temp;
            temp=temp.nextNode;
        }
        //Node lastNode=tail;
        pre.nextNode=null;
        tail=pre;
        //return lastNode;
    }
}
