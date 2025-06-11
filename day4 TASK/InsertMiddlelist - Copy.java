
package datastructures;
class InsertMiddlelist {
class Node { int data; Node prev, next; Node(int d) { data=d; } }

    Node head, tail; int size=0;
    void append(int data) {
        Node n = new Node(data);
        if (head==null) head=tail=n;
        else { tail.next=n; n.prev=tail; tail=n; }
        size++;
    }
    void insertAtMiddle(int data) {
        if (head==null) { append(data); return; }
        Node slow=head, fast=head;
        while (fast!=null && fast.next!=null && fast.next.next!=null) {
            slow=slow.next; fast=fast.next.next;
        }
        Node n = new Node(data);
        n.next=slow.next; n.prev=slow;
        if (slow.next!=null) slow.next.prev=n;
        else tail=n;
        slow.next=n;
        size++;
    }
    void display() {
        for (Node n=head; n!=null; n=n.next) System.out.print(n.data+" <-> ");
        System.out.println("null");
    }
    public static void main(String[] args) {
    	InsertMiddlelist dll = new InsertMiddlelist();
        dll.append(10); dll.append(20); dll.append(30); dll.append(40);
        dll.display();
        dll.insertAtMiddle(25);
        dll.display();
    }
}


