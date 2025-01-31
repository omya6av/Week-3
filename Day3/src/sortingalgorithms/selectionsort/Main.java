package sortingalgorithms.selectionsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] examScores = {85, 92, 78, 65, 33, 88, 75};

        System.out.println("Unsorted Exam Scores: " + Arrays.toString(examScores));

        SelectionSort.selectionSort(examScores);  // Sorting the scores

        System.out.println("Sorted Exam Scores: " + Arrays.toString(examScores));
    }
}
