package datastructures;
import java.util.Scanner;
public class ReverseSll {
    static class Node{int data;Node next;Node(int d){data=d;}}
    Node head;
    void insert(int v){
        Node n=new Node(v);
        if(head==null)head=n;
        else{Node t=head;while(t.next!=null)t=t.next;t.next=n;}
    }
    void reverse(){
        Node p=null,c=head,n;
        while(c!=null){n=c.next;c.next=p;p=c;c=n;}
        head=p;
    }
    void display(){
        Node t=head;
        while(t!=null){System.out.print(t.data+" ");t=t.next;}
        System.out.println();
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ReverseSll l=new ReverseSll();
        int n=s.nextInt();
        for(int i=0;i<n;i++) l.insert(s.nextInt());
        l.display();
        l.reverse();
        l.display();
        s.close();
    }
}
