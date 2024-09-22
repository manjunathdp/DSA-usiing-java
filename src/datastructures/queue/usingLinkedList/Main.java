package datastructures.queue.usingLinkedList;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.printQueue();
        q.enqueue(20);
        q.printQueue();
        q.peek();
        q.enqueue(30);
        q.printQueue();
        System.out.println("Size: " + q.size());
        q.dequeue();
        q.printQueue();
        q.peek();
        System.out.println("Size: " + q.size());
    }
}
