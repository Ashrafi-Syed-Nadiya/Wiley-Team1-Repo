public class MainExampleStack {

    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>(5);
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        System.out.println("Peek: " + integerStack.peek());
        System.out.println("Pop: " + integerStack.pop());

        Stack<String> stringStack = new Stack<>(3);
        stringStack.push("Hello");
        stringStack.push("World");

        System.out.println("Peek: " + stringStack.peek());
        System.out.println("Pop: " + stringStack.pop()); 
    }
}
