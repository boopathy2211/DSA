package datastructures;

import java.util.Scanner;

public class MENUCLL {



	class Node {
	    int data; Node next;
	    Node(int d) { data = d; }
	}

	
	    Node head;

	    void insertEnd(int data) {
	        Node n = new Node(data);
	        if (head == null) { head = n; n.next = head; return; }
	        Node t = head;
	        while (t.next != head) t = t.next;
	        t.next = n; n.next = head;
	    }

	    void insertBegin(int data) {
	        Node n = new Node(data);
	        if (head == null) { head = n; n.next = head; return; }
	        Node t = head;
	        while (t.next != head) t = t.next;
	        n.next = head; t.next = n; head = n;
	    }

	    void deleteAt(int pos) {
	        if (head == null) return;
	        if (pos == 0) {
	            if (head.next == head) { head = null; return; }
	            Node t = head;
	            while (t.next != head) t = t.next;
	            head = head.next; t.next = head; return;
	        }
	        Node c = head;
	        for (int i = 0; i < pos - 1; i++) {
	            if (c.next == head) return;
	            c = c.next;
	        }
	        if (c.next == head) return;
	        c.next = c.next.next;
	    }

	    void show() {
	        if (head == null) { System.out.println("Empty"); return; }
	        Node t = head;
	        do { System.out.print(t.data + " "); t = t.next; } while (t != head);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	       MENUCLL c = new MENUCLL(); Scanner s = new Scanner(System.in);
	        while (true) {
	            System.out.println("1.InsertEnd 2.InsertBeg 3.DeletePos 4.Show 5.Exit");
	            int ch = s.nextInt();
	            if (ch == 5) break;
	            if (ch == 1) c.insertEnd(s.nextInt());
	            else if (ch == 2) c.insertBegin(s.nextInt());
	            else if (ch == 3) c.deleteAt(s.nextInt());
	            else if (ch == 4) c.show();
	        }
	    }


	

}

