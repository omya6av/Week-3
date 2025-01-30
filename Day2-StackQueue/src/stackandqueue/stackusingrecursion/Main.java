package stackandqueue.stackusingrecursion;
import java.util.Stack;

public class Main {

    // Main function to test the sorting of a stack
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        SortStack sorter = new SortStack();

        // Adding elements to the stack
        stack.push(30);
        stack.push(10);
        stack.push(90);
        stack.push(20);
        stack.push(40);

        System.out.println("Original Stack: " + stack);

        // Sorting the stack
        sorter.sort(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
