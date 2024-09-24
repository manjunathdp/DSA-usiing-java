package datastructures.queue.usingArray;

public class Queue {
    private final int MAX = 100;
    private int front = -1;
    private int rear = -1;
    private int length = 0;
    private final int[] queue = new int[MAX];

    public boolean isFull() {
        return length == MAX;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear++;
        }
        queue[rear] = value;
        length++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            rear--;
            length--;
            for (int i = front; i <= rear; i++) {
                queue[i] = queue[i + 1];
            }
        }
    }

}
