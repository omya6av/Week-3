package stringbuilder.reversestring;

public class ReverseString {
    public static String reverseString(String str) {
        // Create a StringBuilder and reverse the string
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
