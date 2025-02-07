package stringbuilder.reversestring;
import java.util.Scanner;

public class ReverseStringMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = ReverseString.reverseString(str);
        System.out.println("Reversed String: " + reversed);

        sc.close();
    }
}
