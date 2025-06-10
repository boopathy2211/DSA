
	package datastructures;

	import java.util.Scanner;

	class Node {
	    int data;
	    Node next;
	    Node prev;

	    Node(int data) {
	    	 this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}

	public class DLL {
	    Node head;

	    
	    void insert(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	            newNode.prev = temp;
	        }
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
	        DLL dll = new DLL();

	        System.out.println("Enter number of elements to insert:");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter value: ");
	            int val = sc.nextInt();
	            dll.insert(val);
	        }

	        System.out.println("Doubly Linked List:");
	        dll.display();
	    }
	}


