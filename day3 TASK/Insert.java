package datastructures;
import java.util.Scanner;
public class Insert {
	
	    static class Node {
	        int data; Node next;
	        Node(int d){ data=d; }
	    }
	    Node head;
	    void insertAtPos(int val, int pos){
	        Node n=new Node(val);
	        if(pos==1){ n.next=head; head=n; return; }
	        Node t=head;
	        for(int i=1;i<pos-1 && t!=null;i++) t=t.next;
	        if(t==null){ System.out.println("Invalid position"); return; }
	        n.next=t.next; t.next=n;
	    }
	    void display(){
	        Node t=head;
	        while(t!=null){ System.out.print(t.data+" "); t=t.next; }
	        System.out.println();
	    }
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        Insert list=new Insert();
	        System.out.println("Enter number of nodes:");
	        int n=sc.nextInt();
	        for(int i=0;i<n;i++){
	            System.out.println("Enter value and position:");
	            int val=sc.nextInt(), pos=sc.nextInt();
	            list.insertAtPos(val,pos);
	        }
	        System.out.println("Linked list:");
	        list.display();
	        sc.close();
	    }
	}
