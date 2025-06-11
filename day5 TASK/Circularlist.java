
package datastructures;

public class Circularlist {
    Node last;

    class Node {
        int data;
        Node next;

        public Node(int num) {
            data = num;
            next = null;
        }
    }

    public Circularlist() {
        last = null;
    }

    public void insert(int data) {
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

    public void traverse() {
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
        Circularlist cl = new Circularlist();

        cl.insert(101);
        cl.insert(202);
        cl.insert(304);

        System.out.print("Circular Linked List: ");
        cl.traverse();
    }
}

