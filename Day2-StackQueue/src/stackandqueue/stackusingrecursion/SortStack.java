package stackandqueue.stackusingrecursion;

import java.util.Stack;

class SortStack {

    // Function to sort a stack using recursion
    public void sort(Stack<Integer> stack) {
        // Base condition: if the stack is empty or has one element, it's already sorted
        if (stack.isEmpty()) {
            return;
        }

        // Pop the top element
        int temp = stack.pop();

        // Recursively sort the remaining stack
        sort(stack);

        // Insert the popped element back in the sorted order
        insertSorted(stack, temp);
    }

    // Helper function to insert an element at its correct position in the sorted stack
    private void insertSorted(Stack<Integer> stack, int element) {
        // If the stack is empty or the element is larger than the top, push the element
        if (stack.isEmpty() || element >= stack.peek()) {
            stack.push(element);
        } else {
            // Pop the top element, recursively insert the current element, and push the popped element back
            int top = stack.pop();
            insertSorted(stack, element);
            stack.push(top);
        }
    }
}