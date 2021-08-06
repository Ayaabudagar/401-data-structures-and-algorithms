package stack.and.queue;
public class Queue<T>{

    Node<T> front;
    Node<T> rear;
    public void enqueue(T value){
        Node<T> node = new Node<>(value);
        if (front == null){
            front =node;


        }else {
            rear.next=node;
    }
        rear=node;

    }
    public T dequeue (){
        T info = null ;
        if(front==null){
            System.out.println("Empty");



        }else {
            info=front.value;
            front = front.next;

        }

        return info;
    }
    public T peek(){
        try {
            return front.value;
        }  catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public boolean isEmpty(){
        return front==null;
    }
    @Override
    public String toString(){
        if (front == null) return "null";
        Node<T> newValue = front;
        String output= "";
        while (newValue!=null){
            output+=newValue.value;
            newValue=newValue.next;

        }
        output+= "null";
        return output;
    }
}