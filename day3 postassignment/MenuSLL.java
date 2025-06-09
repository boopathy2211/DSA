package datastructures;

	import java.util.Scanner;
	public class MenuSLL {
	    static class Node{int data;Node next;Node(int d){data=d;}}
	    Node head;
	    void insert(int v){
	        Node n=new Node(v);
	        if(head==null)head=n;
	        else{Node t=head;while(t.next!=null)t=t.next;t.next=n;}
	    }
	    void deleteAtPos(int p){
	        if(head==null)return;
	        if(p==1){head=head.next;return;}
	        Node t=head;
	        for(int i=1;i<p-1 && t!=null;i++) t=t.next;
	        if(t==null||t.next==null)return;
	        t.next=t.next.next;
	    }
	    void display(){
	        Node t=head;
	        while(t!=null){System.out.print(t.data+" ");t=t.next;}
	        System.out.println();
	    }
	    public static void main(String[] a){
	        Scanner s=new Scanner(System.in);
	        MenuSLL l=new MenuSLL();
	        while(true){
	            System.out.println("1.Insert 2.Delete 3.Display 4.Exit");
	            int c=s.nextInt();
	            if(c==1) l.insert(s.nextInt());
	            else if(c==2) l.deleteAtPos(s.nextInt());
	            else if(c==3) l.display();
	            else break;
	        }
	        s.close();
	    }
	}


