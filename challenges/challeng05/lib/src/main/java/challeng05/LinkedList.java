package challeng05;
public class LinkedList {

    Node head;

    public void insert(int value)  {
        Node newInsertNode = new Node(value);
        if (head != null) {
            newInsertNode.next = head;
        }
        head = newInsertNode;
    }

    public boolean includes(int value){
        Node current = head;
        while (current != null) {
            if (value == current.value)return true;
            current = current.next;
        }
        return false;
    }

    public String toString(){
        String result = "";
        Node current = head;
        while (current != null) {
            result = result + "{ "+ current.value + " } -> ";
            if (current.next == null) {
                result = result + "NULL";
                return result;
            }
            current = current.next;
        }
        return result;
    }
    public String kthFromEnd(int k){
        int count = 0;
        Node current  =this.head;
        while (current != null) {
            current = current.next;
            count++;
        }
        if (count < k){
            return "Exception";
        } else if (k <= 0){
            return "Null";
        }
        current = this.head;
        for (int i = 1; i < count - k + 1; i++)
            current = current.next;
        String result = "";
        result += current.value;
        return result;

    }

}