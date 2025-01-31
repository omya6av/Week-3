package sortingalgorithms.bubblesort;

public class BubbleSort {

    public static void bubbleSort(int[] marks) {
        for (int turn = 0; turn < marks.length; turn++) {
            for (int j = 0; j < marks.length - 1 - turn; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
    }
}
