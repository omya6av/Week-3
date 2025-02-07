package inputstreamreader.ByteStreamToCharacterStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ByteStreamToCharacterStream {
    public static void byteToCharStream() {
        try {
            FileInputStream fis = new FileInputStream("sample");
            InputStreamReader ipr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(ipr);
            String str;
            while((str = br.readLine())!=null){
                char ch[] = str.toCharArray();
                for(char c : ch){
                    System.out.print(c + " ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
