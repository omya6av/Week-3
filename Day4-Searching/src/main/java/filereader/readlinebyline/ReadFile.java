package filereader.readlinebyline;

import java.io.BufferedReader;
import java.io.FileReader;


public class ReadFile {
    public static void readFile() {
        String filePath = "file.txt";

        // Read the file line by line
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String line;
            // Read each line from the file
            while ((line = br.readLine()) != null) {
                // Print each line to the console
                System.out.println(line);
            }
        } catch (Exception e) {
            // Handle exceptions if file reading fails
            e.printStackTrace();
        }
    }
}
