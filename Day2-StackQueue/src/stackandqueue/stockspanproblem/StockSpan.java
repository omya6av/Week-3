package stackandqueue.stockspanproblem;
import java.util.Stack;
class StockSpan {

    // Function to calculate the span for each stock price
    public int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];

        // Stack to store indices of the prices
        Stack<Integer> stack = new Stack<>();

        // Calculate span for each stock price
        for (int i = 0; i < n; i++) {
            // Pop the stack while the price at the top of the stack is less than or equal to the current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If the stack is empty, all previous prices are smaller, so span is i+1
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                // Otherwise, span is the difference between current index and the index at the top of the stack
                span[i] = i - stack.peek();
            }

            // Push the current index onto the stack
            stack.push(i);
        }

        return span;
    }
}
