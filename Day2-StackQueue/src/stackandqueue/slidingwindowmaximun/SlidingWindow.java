package stackandqueue.slidingwindowmaximun;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {

        // Function to find the maximum element in each sliding window of size k
        public int[] slidingWindowMax(int[] nums, int k) {
            if (nums == null || nums.length == 0 || k == 0) {
                return new int[0];
            }

            int n = nums.length;
            int[] result = new int[n - k + 1];
            Deque<Integer> deque = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                // Remove elements outside the current window
                if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                    deque.pollFirst();
                }

                // Remove elements smaller than the current element from the deque
                while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                    deque.pollLast();
                }

                // Add the current element index to the deque
                deque.offerLast(i);

                // If we've processed at least k elements, add the maximum to the result
                if (i >= k - 1) {
                    result[i - k + 1] = nums[deque.peekFirst()];
                }
            }

            return result;
        }
    }
