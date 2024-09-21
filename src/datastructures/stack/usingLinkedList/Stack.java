package datastructures.stack.usingLinkedList;

public class Stack {
    private Node top;
    private int length;

    public boolean isEmpty() {
        return top == null;
    }

    public void getTop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top: " + top.getValue());
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

}
