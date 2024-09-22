package datastructures.stack.usingArray;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.printStack();
        System.out.println();
        s.pop();
        System.out.println("Stack after Push:");
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.printStack();
        System.out.println();
        System.out.println("Popped Element: " + s.pop());
        System.out.println("Stack: ");
        s.printStack();
        System.out.println("Top element:" + s.getTop());
        System.out.println("Height of the stack: " + s.getHeight());
    }
}
