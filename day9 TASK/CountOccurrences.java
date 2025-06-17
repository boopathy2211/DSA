package datastructures;

public class CountOccurrences {

    public static int countOccurrences(int[] nums, int target) {
        int first = findFirst(nums, target);
        if (first == -1) {
            return 0;
        }
        int last = findLast(nums, target);
        return last - first + 1;
    }

    public static int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) {
                result = mid;
            }
        }
        return result;
    }

    public static int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) {
                result = mid;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5,5,5,5,5,7,8,};
        int target = 5;
        System.out.println("Count: " + countOccurrences(nums, target)); // Output: 3
    }
}

