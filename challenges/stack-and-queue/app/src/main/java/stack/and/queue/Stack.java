package stack.and.queue;
public class Stack<T>{
    Node<T> top;
    public void push(T value){
        Node<T> node = new Node<>(value);
        node.next=top;
        top=node;
    }
    public String pop(){
        T info = null ;
        if(top==null){
            System.out.println("Empty");



        }else {
            info=top.value;
            top = top.next;

        }

        return info;

    }
    public T peek(){
        try {
            return top.value;
        }  catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public boolean isEmpty(){
        return top==null;
    }
    @Override
    public String toString(){
        if (top == null) return "null";
        Node<T> newValue = top;
        String output= "";
        while (newValue!=null){
            output+=newValue.value+" ";
            newValue=newValue.next;

        }
        output+= "null";
        return output;
    }
}