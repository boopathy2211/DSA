package datastructures;

import java.util.Scanner;
public class ArrayManipulator {
    int[] arr;
    int size = 0;

    public ArrayManipulator(int capacity) {
        arr = new int[capacity];
    }

    public void insert(int value) {
        if (size < arr.length) {
            arr[size++] = value;
            System.out.println(value + " inserted.");
        } else {
            System.out.println("Array is full.");
        }
    }

    public void delete(int value) {
        int i = 0;
        for (; i < size; i++) {
            if (arr[i] == value) break;
        }
        if (i == size) {
            System.out.println("Element not found.");
        } else {
            for (int j = i; j < size - 1; j++) {
                arr[j] = arr[j + 1];
            }
            size--;
            System.out.println(value + " deleted.");
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
        } else {
            System.out.print("Array elements: ");
            for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public void max() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Max element: " + max);
    }

    public void min() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Min element: " + min);
    }

    public void menu(Scanner sc) {
        System.out.println("\nMenu:\n1.Insert\n2.Delete\n3.Display\n4.Max\n5.Min\n6.Exit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter element to insert: ");
                insert(sc.nextInt());
            }
            case 2 -> {
                System.out.print("Enter element to delete: ");
                delete(sc.nextInt());
            }
            case 3 -> display();
            case 4 -> max();
            case 5 -> min();
            case 6 -> {
                System.out.println("Exiting...");
                return;
            }
            default -> System.out.println("Invalid choice. Try again.");
        }
        menu(sc); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity of array: ");
        int capacity = sc.nextInt();

        ArrayManipulator obj = new ArrayManipulator(capacity);
        obj.menu(sc);

        sc.close();
    }
}
