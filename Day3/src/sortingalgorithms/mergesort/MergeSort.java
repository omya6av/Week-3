package sortingalgorithms.mergesort;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(double[] prices, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;

        mergeSort(prices, start, mid);
        mergeSort(prices, mid + 1, end);

        mergeSortedList(prices, start, mid, end);
    }

    public static void mergeSortedList(double[] prices, int start, int mid, int end) {

        double[] temp = new double[end - start + 1];
        int leftIndex = start;
        int rightIndex = mid + 1;
        int tempIndex = 0;

        while (leftIndex <= mid && rightIndex <= end) {

            if (prices[leftIndex] > prices[rightIndex]) {
                temp[tempIndex++] = prices[rightIndex++];
            } else {
                temp[tempIndex++] = prices[leftIndex++];
            }

        }

        while (leftIndex <= mid) {
            temp[tempIndex++] = prices[leftIndex++];
        }

        while (rightIndex <= end) {
            temp[tempIndex++] = prices[rightIndex++];
        }


//         in-build method to copy the array from another array
        System.arraycopy(temp, 0, prices, start, temp.length);
    }
}
