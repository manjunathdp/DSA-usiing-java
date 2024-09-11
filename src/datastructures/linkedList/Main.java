package datastructures.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(10);
        l1.append(20);
        l1.append(30);
        l1.prepend(5);
        l1.prepend(0);
        l1.getHead();
        l1.getTail();
        l1.getLength();
        l1.printList();
        System.out.println("Removing Last Element");
        l1.removeLast();
        l1.printList();
        l1.getLength();
        System.out.println("Removing First Element");
        l1.removeFirst();
        l1.printList();
        l1.getLength();
        l1.removeFirst();
        l1.printList();
        l1.removeFirst();
        l1.printList();
        l1.removeFirst();
        l1.printList();
        l1.removeFirst();
        l1.printList();
        l1.removeLast();
        l1.printList();
    }
}
