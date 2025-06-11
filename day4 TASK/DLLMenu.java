package datastructures;

public class DLLMenu {
	Node head, tail;

    class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void traverseFromFront() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void traverseFromEnd() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	DLLMenu dll = new DLLMenu();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(34);
        dll.insert(380);

        System.out.print("Traverse from front: ");
        dll.traverseFromFront();

        System.out.print("Traverse from end: ");
        dll.traverseFromEnd();
    }

}
