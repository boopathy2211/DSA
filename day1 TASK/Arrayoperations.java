package datastructures;

public class Arrayoperations {
	
	    private int[] data;
	    private int size;

	    public Arrayoperations(int capacity) {
	        data = new int[capacity];
	        size = 0;
	    }

	    public boolean insert(int element) {
	        if (size == data.length) return false;
	        data[size++] = element;
	        return true;
	    }

	    public boolean delete(int element) {
	        int index = -1;
	        for (int i = 0; i < size; i++) {
	            if (data[i] == element) {
	                index = i;
	                break;
	            }
	        }
	        if (index == -1) return false;

	        for (int i = index; i < size - 1; i++) {
	            data[i] = data[i + 1];
	        }
	        size--;
	        return true;
	    }

	    public void display() {
	        for (int i = 0; i < size; i++) {
	            System.out.print(data[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Arrayoperations arr = new Arrayoperations(5);

	      
	        arr.insert(5);
	        arr.insert(10);
	        arr.insert(15);

	        
	        arr.display(); 

	       
	        arr.delete(10);

	        
	        arr.display(); 
	    }
}

	


