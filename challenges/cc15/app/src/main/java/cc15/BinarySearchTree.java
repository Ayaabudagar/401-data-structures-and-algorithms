package cc15;


public class BinarySearchTree extends BinaryTree {

    public Node<Integer> root;

    public void add(Integer value) {
        if (root.value == null) {
            root = new Node<>(value);
        } else {
            Node<Integer> current = root;
            Node<Integer> newNode = new Node<>(value);
            while (!value.equals(current.value) && (current.rightChild != newNode || current.leftChild != newNode)) {
                if (value < current.value) {
                    if (current.leftChild == null) current.leftChild = newNode;
                    else current = current.leftChild;
                } else {
                    if (current.rightChild == null) current.rightChild = newNode;
                    else current = current.rightChild;
                }
            }
        }
    }

    public boolean contains(Integer value) {
        if (root == null) return false;
        if (value.equals(root.value)) return true;

        Node<Integer> current = root;
        while (current.leftChild != null || current.rightChild != null) {
            if (value < current.value && current.leftChild != null) {
                current = current.leftChild;
            } else if (value > current.value && current.rightChild != null) {
                current = current.rightChild;
            } else return false;
            if (value.equals(current.value)) return true;
        }
        return false;
    }
}