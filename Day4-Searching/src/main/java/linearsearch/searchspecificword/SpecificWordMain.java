package linearsearch.searchspecificword;

public class SpecificWordMain {
    public static void main(String[] args) {
        String arr [] = { "Hello world", "hello java", "how are you"};
        String target = "java";
        String result = SearchSpecificWord.findsentence(arr,target);
        System.out.println(result);
    }
}
