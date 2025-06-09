package datastructures;

import java.util.Scanner;

public class Maxminvalue {
    int[] a; 
    int size = 0;

    Maxminvalue(int n) { 
        a = new int[n]; 
    }

    void insert(int x) { 
        a[size++] = x; 
    }

    int max() {
        int m = a[0];
        for (int i = 1; i < size; i++) 
            if (a[i] > m) m = a[i];
        return m;
    }

    int min() {
        int m = a[0];
        for (int i = 1; i < size; i++) 
            if (a[i] < m) m = a[i];
        return m;
    }

    void display() {
        for (int i = 0; i < size; i++) 
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Maxminvalue u = new Maxminvalue(n);
        for (int i = 0; i < n; i++) 
            u.insert(s.nextInt());
        u.display();
        System.out.println(u.max());
        System.out.println(u.min());
        s.close();
    }
}
	