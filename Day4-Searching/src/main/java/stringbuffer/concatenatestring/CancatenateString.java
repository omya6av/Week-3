package stringbuffer.concatenatestring;

public class CancatenateString {
    public static String concatenateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();

        // Iterate through each string in the array
        for (String str : arr) {
            sb.append(str);
        }

        // Return the concatenated string
        return sb.toString();
    }
}
