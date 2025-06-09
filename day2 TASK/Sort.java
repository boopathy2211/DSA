package datastructures;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int[] original = {77, 27, 45, 12,34, 89};
        int[] sorted = original.clone();

        
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j] < sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }

       
        System.out.print("Original: ");
        for (int num : original) System.out.print(num + " ");
        System.out.println();

        System.out.print("Sorted (Descending): ");
        for (int num : sorted) System.out.print(num + " ");
        System.out.println();
    }
}

