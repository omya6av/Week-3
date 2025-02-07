package stringbuilder.removeduplicates;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character is not already in the HashSet, add it to StringBuilder
            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }

        // Return the StringBuilder as a string
        return sb.toString();
    }
}
