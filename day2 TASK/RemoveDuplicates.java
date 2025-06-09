package datastructures;

public class RemoveDuplicates {
	
	    public static int[] removeDuplicates(int[] arr) {
	        int i = 0;
	        for (int j = 1; j < arr.length; j++) {
	            if (arr[i] != arr[j]) {
	                arr[++i] = arr[j];
	            }
	        }
	        int[] result = new int[i + 1];
	        System.arraycopy(arr, 0, result, 0, i + 1);
	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr = {2,2,3, 3, 4, 4, 5, 8};
	        int[] result = removeDuplicates(arr);
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }
	}


