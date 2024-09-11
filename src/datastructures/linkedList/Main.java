package datastructures.linkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        System.out.println("Initial Linked List");
        l1.append(10);
        l1.append(20);
        l1.append(30);
        getInfo(l1);
        System.out.println("Adding Elements using append() :");
        l1.append(40);
        getInfo(l1);
        System.out.println("Adding Elements using prepend() :");
        l1.prepend(50);
        getInfo(l1);
        System.out.println("Removing Last Element");
        l1.removeLast();
        getInfo(l1);
        System.out.println("Removing First Element");
        l1.removeFirst();
        getInfo(l1);
        System.out.println("Getting node through index");
        System.out.println("Element at index 1: " + l1.get(1).value);
        System.out.println("Inserting Node through index (1): ");
        l1.insertAt(1, 25);
        getInfo(l1);
        System.out.println("Modifying value of index 1: ");
        l1.set(1, 100);
        getInfo(l1);
        System.out.println("Reversing the Linked List: ");
        l1.reverse();
        getInfo(l1);
    }

    public static void getInfo(LinkedList l1) {
        l1.printList();
        l1.getHead();
        l1.getTail();
        l1.getLength();
    }
}
