package datastructures.stack.usingArray;

public class Stack {
    private final int MAX = 100;
    private int height;
    private int top = -1;
    int[] stack = new int[MAX];

    public void push(int value) {
        top++;
        stack[top] = value;
        height++;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int temp = stack[top];
            top--;
            height--;
            return temp;
        }
    }

    public void printStack() {
        if (top==-1){
            System.out.println("Stack is Empty");
            return;
        }
        int temp = top;
        while (temp!=-1) {
            System.out.println(stack[temp]);
            temp--;
        }
    }

    public int getHeight(){
        return height;
    }

    public int getTop() {
        return stack[top];
    }
}
