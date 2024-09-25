package datastructures.tree.binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println(bst.getRoot());
        bst.insert(20);
        bst.insert(18);
        bst.insert(22);
        bst.insert(17);
        bst.insert(19);
        bst.insert(21);
        bst.insert(23);
        bst.search(17);
    }
}
