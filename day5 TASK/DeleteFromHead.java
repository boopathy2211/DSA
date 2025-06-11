package datastructures;
import java.util.Scanner;

public class DeleteFromHead {
    Node last;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    DeleteFromHead() {
        last = null;
    }

    void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    void deleteHead() {
        if (last == null) return;
        if (last.next == last) last = null;
        else last.next = last.next.next;
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
        DeleteFromHead list = new DeleteFromHead();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) list.insertAtTail(sc.nextInt());
        list.deleteHead();
        list.traverse();
        sc.close();
    }
}
