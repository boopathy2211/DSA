package datastructures;

public class ReverseNumber {
	
	    private int number;

	   
	    public ReverseNumber(int num) {
	        this.number = num;
	    }

	   
	    public int reverse() {
	        char[] digits = String.valueOf(number).toCharArray();
	        int left = 0;
	        int right = digits.length - 1;

	        while (left < right) {
	          
	            char temp = digits[left];
	            digits[left] = digits[right];
	            digits[right] = temp;

	            left++;
	            right--;
	        }
	        return Integer.parseInt(new String(digits));
	    }

	    public static void main(String[] args) {
	        ReverseNumber rn = new ReverseNumber(123456);
	        System.out.println("Original number: " + rn.number);
	        System.out.println("Reversed number: " + rn.reverse());
	    }
	}
