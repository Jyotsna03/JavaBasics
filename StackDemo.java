import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Java");
        stack.push("C++");
        stack.push("Python");

        // Pop elements from the stack
        String element1 = stack.pop();
        String element2 = stack.pop();

        // Peek at the top element
        String element3 = stack.peek();

        System.out.println("Popped elements: " + element1 + ", " + element2);
        System.out.println("Top element: " + element3);
    }
}

