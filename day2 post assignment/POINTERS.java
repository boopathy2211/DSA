package datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class POINTERS {
    public static void findPair(int[] arr, int target) {
        Arrays.sort(arr); // Sort the array
        
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);
                return;
            } else if (sum < target) left++;
            else right--;
        }
        System.out.println("No pair found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        findPair(arr, target);
        sc.close();
    }
}

