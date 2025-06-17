package datastructures;

public class CountFixedBoundSubarrays {

    public static long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        int minPos = -1;
        int maxPos = -1;
        int leftBound = -1;
        long count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                leftBound = i;
            }
            if (nums[i] == minK) {
                minPos = i;
            }
            if (nums[i] == maxK) {
                maxPos = i;
            }
            int validStart = Math.min(minPos, maxPos);
            if (validStart > leftBound) {
                count += validStart - leftBound;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 7, 5};
        int minK = 1;
        int maxK = 5;
        long result = countSubarrays(nums, minK, maxK);
        System.out.println("Count of valid subarrays: " + result);
    }
}

