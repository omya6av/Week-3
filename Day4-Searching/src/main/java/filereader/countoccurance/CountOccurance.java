package filereader.countoccurance;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountOccurance {
    public static void countOccurance() {
        String filePath = "sample";
        // Specify the word to count occurrences of
        String targetWord = "kuldeep";

        // Counter to track word occurrences
        int wordCount = 0;

        // Read the file line by line and count the occurrences of the word
        try  {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            // Read each line from the file
            while ((line = bufferedReader.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        wordCount++;
                    }
                }
            }

            // Print the final word count
            System.out.println("The word \"" + targetWord + "\" appears " + wordCount + " times in the file.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
