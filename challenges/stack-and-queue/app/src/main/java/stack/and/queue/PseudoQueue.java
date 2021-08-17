package stack.and.queue;

public class PseudoQueue <T> {
    Stack<T> stackOne = new Stack<T>();
    Stack<T> stackTow = new Stack<T>();
    public void enqueue(T value) {
        stackOne.push(value);
    }
    public T dequeue(){
        T value = null;

            if(! stackOne.isEmpty()){
                while (!stackTow.isEmpty()){
                    stackOne.push(stackTow.pop());
                }
                value = stackOne.top.value;
                stackOne.pop();
                while (!stackOne.isEmpty()){
                    stackTow.push(stackOne.pop());
                }
        }
            return value;
}

    }