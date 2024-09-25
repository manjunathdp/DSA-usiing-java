package datastructures.tree.binarySearchTree;

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        Node temp = root;
        while (true) {
            if (temp.value == newNode.value) {
                System.out.println("Duplicate Values can't be inserted into Binary Search Tree");
                return;
            }
            if (newNode.value > temp.value) {
                if (temp.right == null) {
                    temp.right = newNode;
                    return;
                } else {
                    temp = temp.right;
                }
            } else {
                if (temp.left==null) {
                    temp.left=newNode;
                    return;
                } else {
                    temp=temp.left;
                }
            }
        }
    }
}
