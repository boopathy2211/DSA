package datastructures;

public class CircularLinkedList {

	class Node {
	    int data;
	    Node next;
	    Node(int d) {
	        data = d;
	        next = null;
	    }
	}

	public class CircularLinkedList {
	    Node head;

	    void deleteAtPosition(int position) {
	        if (head == null) return;

	        if (position == 0) {
	            if (head.next == head) {
	                head = null;
	                return;
	            }
	            Node last = head;
	            while (last.next != head) last = last.next;
	            head = head.next;
	            last.next = head;
	            return;
	        }

	        Node current = head;
	        for (int i = 0; i < position - 1; i++) {
	            current = current.next;
	            if (current == head) return;
	        }

	        if (current.next == head) return;
	        current.next = current.next.next;
	    }

	    void printList() {
	        if (head == null) return;
	        Node temp = head;
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        CircularLinkedList clist = new CircularLinkedList();
	        clist.head = new Node(10);
	        Node second = new Node(20);
	        Node third = new Node(30);
	        Node fourth = new Node(40);

	        clist.head.next = second;
	        second.next = third;
	        third.next = fourth;
	        fourth.next = clist.head;

	        clist.printList();
	        clist.deleteAtPosition(2);
	        clist.printList();
	        clist.deleteAtPosition(0);
	        clist.printList();
	    }
	}
}
		

}
}
