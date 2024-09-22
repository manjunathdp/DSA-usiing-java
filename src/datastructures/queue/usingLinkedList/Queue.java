/*
enqueue() – Insertion of elements to the queue.
dequeue() – Removal of elements from the queue.
peek() or front()- Acquires the data element available at the front node of the queue without deleting it.
rear() – This operation returns the element at the rear end without removing it.
isFull() – Validates if the queue is full.
isEmpty() – Checks if the queue is empty.
size(): This operation returns the size of the queue i.e. the total number of elements it contains.
 */

package datastructures.queue.usingLinkedList;

public class Queue {
    private Node front;
    private Node rear;
    private int length;

    public boolean isEmpty() {
        return front == null;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue Front Element: " + front.getValue());
    }

    public int size() {
        return length;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.setNextNode(newNode);
        }
        rear = newNode;
        length++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        front = front.getNextNode();
        length--;
        if (front == null) {
            rear = null;
        }
    }

    public void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNextNode();
        }
        System.out.println();
    }


}
