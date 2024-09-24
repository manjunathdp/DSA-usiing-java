package datastructures.queue.usingArray;


public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();

        System.out.println("Initial Queue: ");
        q.printQueue();
        System.out.println("Performing enqueue operation: ");
        q.enqueue(10);
        q.printQueue();
        q.enqueue(20);
        q.printQueue();
        q.enqueue(30);
        q.printQueue();
        System.out.println("Performing dequeue operation: ");
        q.dequeue();
        q.printQueue();
        q.dequeue();
        q.printQueue();
    }
}
