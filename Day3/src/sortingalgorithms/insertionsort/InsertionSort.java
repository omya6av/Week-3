package sortingalgorithms.insertionsort;

public class InsertionSort {

    public static void insertionSort(int[] employeeId){

        for(int i=1 ; i< employeeId.length; i++){
            int cur = employeeId[i];
            int prev = i-1;

            while(prev >= 0 && employeeId[prev] > cur){
                employeeId[prev+1] = employeeId[prev];
                prev--;
            }
            employeeId[prev+1] = cur;
        }
    }
}
