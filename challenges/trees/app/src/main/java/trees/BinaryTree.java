package trees;

import java.util.ArrayList;

public class BinaryTree <T> {




    private ArrayList<T> inOrderList;
    private ArrayList<T> preOrderList;
    private ArrayList<T> postOrderList;
    private Node <T> root;


    public ArrayList<T> preOrder(Node<T> root){
        if(root != null){

            preOrderList.add(root.value);
            if (root.left != null){
                preOrder(root.left);
            }
            if (root.right != null) {
                preOrder(root.right);
            }}
        return preOrderList;
    }
    public ArrayList<T> inOrder(Node<T> root){
        if(root != null){
            if (root.left != null){
                inOrder(root.left);
            }
            inOrderList.add(root.value);
            if (root.right != null) {
                inOrder(root.right);
            }
        }
        return inOrderList;
    }
    public ArrayList<T> postOrder(Node<T> root){
        if(root != null){
            if (root.left != null){
                postOrder(root.left);
            }
            if (root.right != null) {
                postOrder(root.right);
            }
          
        }
        return postOrderList;
    }
    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
}
