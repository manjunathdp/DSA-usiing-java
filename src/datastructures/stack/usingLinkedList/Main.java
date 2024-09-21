package datastructures.stack.usingLinkedList;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();

        System.out.println("Initial Stack: ");
        System.out.println("Is Stack Empty: " + s.isEmpty());
        getInfo(s);

        System.out.println("Applying Push() method: ");
        s.push(10);
        s.push(20);
        getInfo(s);

    }

    public static void getInfo(Stack s) {
        s.getTop();
        s.getLength();
        s.printStack();

    }
}
