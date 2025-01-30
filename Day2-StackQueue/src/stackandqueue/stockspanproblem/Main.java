package stackandqueue.stockspanproblem;

public class Main {

    // Main function to test the stock span calculation
    public static void main(String[] args) {
        int[] stockPrices = {100, 80, 60, 70, 60, 75, 85};

        StockSpan stockSpan = new StockSpan();

        int[] span = stockSpan.calculateSpan(stockPrices);

        // Print the span for each day
        System.out.println("Stock Span: ");
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}