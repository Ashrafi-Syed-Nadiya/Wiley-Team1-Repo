public class Stack<E> {

    private int maxSize;
    private E[] stackArray;
    private int top;

    public Stack(int maxSize){
        this.maxSize = maxSize;
        stackArray = (E[]) new Object[maxSize];
        top = -1;
    }

    public void push(E data){
        if(isFull()){
            throw new RuntimeException("Stack is already full");
        }
        top++;
        stackArray[top] = data;
    }

    public E pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is already empty");
        }
        E data = stackArray[top];
        top--;
        return data;
    }

    public E peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty, cannot peek");
        }
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == (maxSize - 1);
    }
}
