package trees;



public class BinarySearchTree <T>extends BinaryTree{
    public Node<Integer> root;
    public void add(int value) {
        Node<T> newNode = new Node(value);
        Node node;
        if (this.getRoot() == null) {
            this.setRoot(newNode);
        } else {
            node = this.getRoot();


        }
    }
    public boolean contains(Integer value) {

        if (root == null) return false;
        if (value.equals(root.value)) return true;

        Node<Integer> node = root;
        while (node.left != null || node.right != null) {
            if (value < node.value && node.left != null) {
                node = node.left;
            } else if (value > node.value && node.right != null) {
                node = node.right;
            } else return false;
            if (value.equals(node.value)) return true;
        }
        return false;
    }



        }

