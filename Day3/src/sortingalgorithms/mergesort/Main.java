package sortingalgorithms.mergesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] prices = {205.1, 349.99, 100, 25.45, 49.20};

        // print original
        System.out.println("unsorted prices : " + Arrays.toString(prices));

        MergeSort.mergeSort(prices, 0, prices.length - 1);

        // print sorted Prices
        System.out.println("Sorted prices : " + Arrays.toString(prices));

    }
}
