package datastructures;
import java.util.Scanner;

public class DeleteNode {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    Node head;

    void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    void deleteAtPosition(int pos) {
        if (head == null) return;
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeleteNode list = new DeleteNode();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++)
            list.insert(sc.nextInt());

        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        list.deleteAtPosition(pos);

        System.out.print("List after deletion: ");
        list.display();
        sc.close();
    }
}
