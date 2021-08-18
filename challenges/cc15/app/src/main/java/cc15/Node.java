package cc15;

public class Node <T>{
    public T value;
    public Node leftChild;
    public Node rightChild;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
