package datastructures;
import java.util.Scanner;
class DLLMenuDriven {
    class Node {
        int data; Node prev, next;
        Node(int d) { data = d; }
    }
    Node head, tail;
    void insert(int d) {
        Node n = new Node(d);
        if (head == null) head = tail = n;
        else { tail.next = n; n.prev = tail; tail = n; }
    }
    void delete(int key) {
        Node temp = head;
        while (temp != null && temp.data != key) temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev;
        System.out.println("Deleted: " + key);
    }
    void traverseFront() {
        if (head == null) { System.out.println("Empty list"); return; }
        Node temp = head;
        while (temp != null) { System.out.print(temp.data + " "); temp = temp.next; }
        System.out.println();
    }
    void traverseEnd() {
        if (tail == null) { System.out.println("Empty list"); return; }
        Node temp = tail;
        while (temp != null) { System.out.print(temp.data + " "); temp = temp.prev; }
        System.out.println();
    }
    public static void main(String[] args) {
        DLLMenuDriven dll = new DLLMenuDriven();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1.Insert 2.Delete 3.Traverse Front 4.Traverse End 5.Exit");
            int ch = sc.nextInt();
            if (ch == 5) break;
            switch(ch) {
                case 1 -> {
                    System.out.print("Enter value: ");
                    dll.insert(sc.nextInt());
                }
                case 2 -> {
                    System.out.print("Enter value to delete: ");
                    dll.delete(sc.nextInt());
                }
                case 3 -> dll.traverseFront();
                case 4 -> dll.traverseEnd();
                default -> System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}

