package linearsearch.firstnegativenumber;

public class FirstNegativeNumber {
    public static int firstNegativeNumber(int arr[]){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }
}
