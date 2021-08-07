public class LinkedList {

    private class Node{
        private Integer value;
        private Node next;

        public Node (int value){
            this.value =  value;
        }
    }


    private Node first;
    private Node last;

    public Integer getFirst(){
        return first.value;
    }

    public void addLast(int data){
        var node = new Node (data);

        if(first==null){
            first=last=node;
        }else{
            last.next=node;
            last=node;
        }
    }

    void printk(int k) {
        int length = 0;
        Node current = first;

        if (k < 0) {
            System.out.println("Not Applicable");
        } else {
            for (int i = 0; current != last; i++) {
                current = current.next;
                length++;
            }
            current = first;

            //to get kth node from the end we can also say that we want (length-k+1) node from the beginning
            int i = 1;
            if (k <=length) {
                while (i < length - k + 1) {
                    current = current.next;
                    i++;
                }
                System.out.println(current.value);
            } else {
                System.out.println("Not Applicable");
            }

        }
    }

    public void addFirst(int data){
        var node = new Node(data);
        if(first==null){
            first=last=node;
        }else{
            node.next=first;
            first=node;
        }
    }

    public int indexOf(int data){
        int index=0;
        var current = first;

        while (current!=null){
            if (current.value==data){
                return index;
            }
            current=current.next;
            index++;
        }
        return -1;
    }

    public void insertBefore(int item ,int data){

        var node = new Node (data);
        var current=first;
        while (current.next!= null){

            if (current.next.value==item){
                node.next = current.next;
                current.next=node;
                return;
            }

            current=current.next;

        }

    }

    public void insertAfter(int item ,int data){

        var node = new Node (data);
        var current=first;
        while (current.next!= null){

            if (current.value==item){
                node.next = current.next;
                current.next=node;
                return;
            }

            current=current.next;

        }

    }

    public boolean includes (int data){
        return indexOf(data)!=-1;
    }

    public String toString(){
        String newData="";

        var current = first;

        while (current!=null){
            newData+= "{ "+current.value+" } -> ";
            current=current.next;
        }
        newData+="NULL";
        return  newData;
    }
}