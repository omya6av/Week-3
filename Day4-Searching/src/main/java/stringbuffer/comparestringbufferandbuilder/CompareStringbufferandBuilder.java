package stringbuffer.comparestringbufferandbuilder;

public class CompareStringbufferandBuilder {
    public static void comparestrings(){
        int iterations = 1000000;

    // Measure performance for StringBuffer
    long startTime = System.nanoTime();
    StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i<iterations;i++) {
        stringBuffer.append("hello");
    }

    long endTime = System.nanoTime();
    long stringBufferTime = endTime - startTime;
        System.out.println("Time taken by StringBuffer: "+stringBufferTime +" nanoseconds");

    // Measure performance for StringBuilder
    startTime =System.nanoTime();
    StringBuilder stringBuilder = new StringBuilder();
        for(
    int i = 0;
    i<iterations;i++)

    {
        stringBuilder.append("hello");
    }

    endTime =System.nanoTime();
    long stringBuilderTime = endTime - startTime;
        System.out.println("Time taken by StringBuilder: "+stringBuilderTime +" nanoseconds");
}
}

