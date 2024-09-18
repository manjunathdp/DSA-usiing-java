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

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void printList() {
        if (isEmpty()){
            System.out.println("Empty Doubly Linked List");
        }
        else {
            Node temp = head;
            while (!isEmpty()) {
                System.out.print(temp.value + " => " );
                temp=temp.nextNode;
            }
            System.out.print("null");
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        }
        else {
            newNode.previousNode=tail;
        }
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(isEmpty()) {
            tail = newNode;
        }
        else {
            newNode.nextNode = head;
        }
        head = newNode;
    }

}
