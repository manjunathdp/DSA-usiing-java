package datastructures.doublyLinkedList;

// doubly Linked list
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;


    public boolean isEmpty() {
        return head == null;
    }

    public void getHead() {
        if (isEmpty()) {
            System.out.println("Empty Doubly Linked List");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (isEmpty()) {
            System.out.println("Empty Doubly Linked List");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("Empty Doubly Linked List");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " => ");
                temp = temp.nextNode;
            }
            System.out.println("null");
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.previousNode = tail;
            tail.nextNode = newNode;
        }
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            newNode.nextNode = head;
            head.previousNode = newNode;
        }
        head = newNode;
        length++;
    }

    public void removeLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.previousNode;
                tail.nextNode = null;
            }
            length--;
        } else {
            System.out.println("Empty Doubly Linked List");
        }

    }

    public void removeFirst() {
        if (!isEmpty()) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.nextNode;
                head.previousNode = null;
            }
            length--;
        } else {
            System.out.println("Empty Doubly Linked List");
        }

    }

    public Node getNode(int index) {
        if (index < 0 || index >= length) {
            System.out.println("invalid index");
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.nextNode;
        }
        return temp;

    }

    public void insertAt(int index, int value) {
        if (index < 0 || index > length) {
            System.out.println("invalid index");
            return ;
        }
        if (index==0){
            prepend(value);
            return;
        }
        if (index==length) {
            append(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp=getNode(index);
        newNode.nextNode=temp;
        newNode.previousNode=temp.previousNode;
        if (temp.previousNode != null) {
            temp.previousNode.nextNode = newNode;
        }
        temp.previousNode=newNode;
        length++;

    }

}
