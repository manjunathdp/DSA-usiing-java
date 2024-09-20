package datastructures.doublyLinkedList;


public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        System.out.println("Initial List:");
        getInfo(dll);

        System.out.println("Applying Append Method:");
        dll.append(10);
        dll.append(20);
        getInfo(dll);

        System.out.println("Applying Prepend Method:");
        dll.prepend(30);
        dll.prepend(40);
        dll.prepend(50);
        getInfo(dll);

        System.out.println("Applying Remove Last Method:");
        dll.removeLast();
        dll.removeLast();
        getInfo(dll);

        System.out.println("Applying Remove First Method:");
        dll.removeFirst();
        dll.removeLast();
        getInfo(dll);

        System.out.println("Applying getNode(index: ) Method:");
        dll.printList();
        System.out.println("The value At index 0: " + dll.getNode(0).value);

    }

    public static void getInfo(DoublyLinkedList l1) {
        l1.printList();
        l1.getHead();
        l1.getTail();
        l1.getLength();
    }
}
