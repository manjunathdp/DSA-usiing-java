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
                if (temp.left == null) {
                    temp.left = newNode;
                    return;
                } else {
                    temp = temp.left;
                }
            }
        }
    }

    public void search(int key) {
        if (root == null) {
            System.out.println("Tree is Empty");
            return;
        }
        if (root.value == key) {
            System.out.println("Fount at Root");
            return;
        }
        Node temp = root;
        while (temp != null) {
            if (key > temp.value) {
                if (temp.right == null)
                    break;
                if (temp.right.value == key) {
                    System.out.println("Found at the right side of the Root");
                    return;
                }
                temp = temp.right;
            } else {
                if (temp.left == null)
                    break;
                if (temp.left.value == key) {
                    System.out.println("Found at the left side of the Root");
                    return;
                }
                temp = temp.left;
            }
        }
        System.out.println("Not Found");
    }
}
