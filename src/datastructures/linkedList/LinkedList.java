package datastructures.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    public void getHead() {
        if (isEmpty()){
            System.out.println("Empty Linked List");
            return;
        }
        System.out.println("Head: " + head.value);
    }
    public void getTail() {
        if (isEmpty()){
            System.out.println("Empty Linked List");
            return;
        }
        System.out.println("Tail: " + tail.value);
    }
    public void getLength() {
        System.out.println("Length: " + length);
    }
    public void printList() {
        if (head==null) {
            System.out.println("Empty List");
            return;
        }
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
        length++;
    }
    public void /* Node */ removeLast() {
        if(head==null && tail==null) {
            System.out.println("List is Empty");
            return;
            //return null;
        }
        if (head==tail) {
            //Node lastNode=head;
            head = null;
            tail = null;
            length--;
            return;
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
        length--;
        //return lastNode;
    }
    public void /* Node */ removeFirst() {
        if(head==null) {
            System.out.println("List is Empty");
            //return null;
            return;
        }
        if (head==tail) {
            //Node firstNode=head;
            head = null;
            tail = null;
            length--;
            //return firstNode;
            return;
        }
        // Node firstNode=head;
        head=head.nextNode;
        length--;
        //return firstNode;

    }

    public Node get(int index) {
        if (index>length || index < 0) {
            System.out.println("Invalid Index");
            return null;
        }

        if (head!=null) {
            int tempIndex=0;
            Node temp=head;
            while (temp!=null){
                if (tempIndex==index) {
                    return temp;
                }
                temp=temp.nextNode;
                tempIndex++;

            }
        }
        System.out.println("List is empty");
        return null;
    }

    public void insertAt(int index, int value) {
        if (index>length || index<0) {
            System.out.println("Invalid index");
            return;
        } else if (index==length-1){
            append(value);
            length++;
            return;
            }
        else if (index==0) {
            prepend(value);
            length++;
            return;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.nextNode=temp.nextNode;
        temp.nextNode=newNode;
        length++;
    }
public void set(int index, int value) {
    if (index > length || index < 0) {
        System.out.println("Invalid index");
        return;
        }
    Node temp = get(index);
    temp.value = value;
}

public boolean isEmpty() {
    return head == null;
}
}
