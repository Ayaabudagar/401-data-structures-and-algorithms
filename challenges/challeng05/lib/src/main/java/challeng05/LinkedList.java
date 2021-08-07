package challeng05;



public class LinkedList {
    public Node head ;


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

    public int append(int value){
        Node newNode = new Node(value);
        Node current = this.head;

        if(head == null){
            head = newNode;
        }else {

            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

        return newNode.value;
    }
    public static LinkedList zipLists(LinkedList list1 ,LinkedList list2){
        LinkedList mergedList = new LinkedList();

        Node firstTemp = list1.head;
        Node secondTemp = list2.head;

        while(firstTemp!=null ||secondTemp != null){
            if(firstTemp == null){
                mergedList.append(secondTemp.value);
                secondTemp=secondTemp.next;
            }
            if(secondTemp == null){
                mergedList.append(firstTemp.value);
                firstTemp=firstTemp.next;
            }

            else {
                mergedList.append(firstTemp.value);
                mergedList.append(secondTemp.value);
                firstTemp=firstTemp.next;
                secondTemp=secondTemp.next;
            }

        }
        return mergedList;
    }


}