package stackandqueue.slidingwindowmaximun;

public class Main {
    public static void main(String[] args) {
        SlidingWindow swm = new SlidingWindow();

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = swm.slidingWindowMax(nums, k);

        // Print the maximum of each sliding window
        System.out.println("Sliding Window Maximums: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}