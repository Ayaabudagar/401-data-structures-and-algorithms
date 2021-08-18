package trees2;

public class BinarySearchTree <T> extends BinaryTree<T> {
    public BinarySearchTree(){

    }

    public BinarySearchTree(T value){
        this.root= new Node<>(value);
    }


    public void add(T value){
        Node<T> newNode = new Node<>(value);
        Node<T> temp = root;
        if (root == null){
            root = newNode;
        }else {
            while (true) {
                if (temp.leftChild!=null && (int) newNode.value < (int) temp.value)  {
                    temp = temp.leftChild;
                }else if(temp.rightChild!=null && (int) newNode.value > (int) temp.value){
                    temp = temp.rightChild;
                }else{
                    break;
                }
            }
            if ((int)temp.value >= (int)newNode.value){
                newNode.leftChild = temp.leftChild;
                temp.leftChild= newNode;
            }else {
                newNode.rightChild = temp.rightChild;
                temp.rightChild = newNode;
            }
        }
    }

    public boolean contains(T value, Node<T> rootNode){
        Node<T> current = rootNode;
        if (rootNode != null){
            if ((int)value == (int)current.value){
                return true;
            }else if((int)value < (int)current.value){
                current=current.leftChild;
                return contains(value,current);
            }else{
                current=current.rightChild;
                return contains(value,current);
            }}
        return false;
    }
}
