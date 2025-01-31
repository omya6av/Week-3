package sortingalgorithms.insertionsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] employeeId = {98,63,54,82,20};
       // "Unsorted Employee Id."
        System.out.println("Unsorted Employee Id : " + Arrays.toString(employeeId));
        // sort the id's
        InsertionSort.insertionSort(employeeId);


        // "Sorted Employee Id."
        System.out.println("Sorted Employee Id : " + Arrays.toString(employeeId));

    }
}
