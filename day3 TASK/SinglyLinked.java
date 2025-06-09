package datastructures;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class SinglyLinked {
    Node head;

    void insert(int val) {
        Node n = new Node(val);
        if (head == null) head = n;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = n;
        }
    }

    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinked list = new SinglyLinked();
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) list.insert(sc.nextInt());
        list.traverse();
        sc.close();
    }
}


