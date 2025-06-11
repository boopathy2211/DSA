package datastructures;

import java.util.Scanner;

public class InsertatTail {
    Node last;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    InsertatTail() {
        last = null;
    }

    void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    void traverse() {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }

    public static void main(String[] args) {
        InsertatTail list = new InsertatTail();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.insertAtTail(sc.nextInt());
        }
        System.out.print("Circular Linked List: ");
        list.traverse();
        sc.close();
    }
}
