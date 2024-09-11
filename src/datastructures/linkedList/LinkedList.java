package datastructures.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public void getHead() {
        if (isEmpty()) {
            System.out.println("Empty Linked List");
            return;
        }
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        if (isEmpty()) {
            System.out.println("Empty Linked List");
            return;
        }
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("Empty Linked List");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " => ");
            temp = temp.nextNode;
        }
        System.out.println("null");
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
        }
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }
        length++;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Empty Linked List");
            return;
        }
        if (head == tail) {

            head = null;
            tail = null;
            length--;
            return;
        }
        Node temp = head;
        Node pre = head;
        while (temp.nextNode != null) {
            pre = temp;
            temp = temp.nextNode;
        }
        pre.nextNode = null;
        tail = pre;
        length--;

    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Empty Linked List");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            length--;
            return;
        }
        head = head.nextNode;
        length--;

    }

    public Node get(int index) {
        if (index > length || index < 0) {
            if (isEmpty()) {
                System.out.println("Empty Linked List");
            } else {
                System.out.println("Invalid Index");
            }
            return null;
        }

        if (isEmpty()) {
            System.out.println("Empty Linked List");
            return null;
        } else {
            int tempIndex = 0;
            Node temp = head;
            while (temp != null) {
                if (tempIndex == index) {
                    return temp;
                }
                temp = temp.nextNode;
                tempIndex++;

            }
        }
        return null;
    }

    public void insertAt(int index, int value) {
        if (index > length || index < 0) {
            if (isEmpty()) {
                System.out.println("Empty Linked List");
            } else {
                System.out.println("Invalid Index");
            }
            return;
        } else if (index == length - 1) {
            append(value);
            length++;
            return;
        } else if (index == 0) {
            prepend(value);
            length++;
            return;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.nextNode = temp.nextNode;
        temp.nextNode = newNode;
        length++;
    }

    public void set(int index, int value) {
        if (index > length || index < 0) {
            if (isEmpty()) {
                System.out.println("Empty Linked List");
            } else {
                System.out.println("Invalid Index");
            }
            return;
        }
        Node temp = get(index);
        temp.value = value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void reverse() {
        //swapping head and tail with the help of temp
        Node temp = head;
        head = tail;
        tail = temp;
        //flipping the nodes
        Node after = temp.nextNode;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.nextNode;
            temp.nextNode = before;
            before = temp;
            temp = after;
        }
    }
}
