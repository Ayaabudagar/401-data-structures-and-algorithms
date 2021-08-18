package trees2;

import java.util.ArrayList;

public class BinaryTree <T>{
    Node<T> root;
    ArrayList<T> preOrderList = new ArrayList<>();
    ArrayList<T> inOrderList = new ArrayList<>();
    ArrayList<T> postOrderList = new ArrayList<>();

    public BinaryTree() {

    }

    public BinaryTree(T value) {
        this.root = new Node<>(value);
    }
    public ArrayList<T> preOrder(Node<T> root){
        if(root != null){
            this.preOrderList.add(root.value);
            if (root.leftChild != null){
                preOrder(root.leftChild);
            }
            if (root.rightChild != null) {
                preOrder(root.rightChild);
            }}
        return this.preOrderList;
    }

    public ArrayList<T> inOrder(Node<T> root){
        if(root != null){
            if (root.leftChild != null){
                inOrder(root.leftChild);
            }
            this.inOrderList.add(root.value);
            if (root.rightChild != null) {
                inOrder(root.rightChild);
            }
        }
        return this.inOrderList;
    }

    public ArrayList<T> postOrder(Node<T> root){
        if(root != null){
            if (root.leftChild != null){
                postOrder(root.leftChild);
            }
            if (root.rightChild != null) {
                postOrder(root.rightChild);
            }
            this.postOrderList.add(root.value);
        }
        return this.postOrderList;
    }

    public Integer maximum(){
        Integer max = 0;
        ArrayList<T> list = preOrder(this.root);
        for (T t : list) {
            if (max < (Integer) t) {
                max = (Integer) t;
            }
        }
        return max;
    }
}
