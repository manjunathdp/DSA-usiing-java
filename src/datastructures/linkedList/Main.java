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
        l1.append(10);
        l1.append(20);
        l1.append(30);
        System.out.println("Getting node through index");
        //Node n = l1.get(1);
        System.out.println(l1.get(1).value);
        System.out.println("Inserting Node through index");
        l1.insertAt(1, 25);
        l1.printList();
    }
}
