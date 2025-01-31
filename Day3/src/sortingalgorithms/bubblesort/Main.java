package sortingalgorithms.bubblesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int []marks = {85, 54, 33, 95, 70};

        System.out.println("Unsorted marks of student : " + Arrays.toString(marks));

        BubbleSort.bubbleSort(marks);

        System.out.println("Sorted marks of student : " + Arrays.toString(marks));
    }
}
