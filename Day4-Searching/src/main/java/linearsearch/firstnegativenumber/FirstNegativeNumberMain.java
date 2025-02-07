package linearsearch.firstnegativenumber;

public class FirstNegativeNumberMain {
    public static void main(String[] args) {
        int arr [] = {1, 5, 0, -6, -5};
        int result = FirstNegativeNumber.firstNegativeNumber(arr);
        System.out.println("The index of the negative number is " + result);
    }
}
