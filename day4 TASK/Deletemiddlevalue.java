package datastructures;

public class Deletemiddlevalue {
	  Node head;
	    class Node {
	        int data;
	        Node prev, next;
	        Node(int d) { data = d; }
	    }
	    void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        while (temp.next != null) temp = temp.next;
	        temp.next = newNode;
	        newNode.prev = temp;
	    }
	    void delete(int key) {
	        if (head == null) return;
	        Node temp = head;
	        while (temp != null && temp.data != key) temp = temp.next;
	        if (temp == null) return;
	        if (temp.prev != null) temp.prev.next = temp.next;
	        else head = temp.next;
	        if (temp.next != null) temp.next.prev = temp.prev;
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
	    	Deletemiddlevalue dll = new Deletemiddlevalue();
	        dll.insert(10);
	        dll.insert(20);
	        dll.insert(30);
	        dll.insert(40);
	        dll.traverse();
	        dll.delete(30);
	        dll.traverse();
	    }
	}

