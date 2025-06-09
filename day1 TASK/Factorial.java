package datastructures;

public class Factorial {

    public int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
  public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();

        int factNum = 7;  
        int fibNum = 10
        		;   

        System.out.println("Factorial of " + factNum + " is " + obj.factorial(factNum));
        System.out.println("Fibonacci number at position " + fibNum + " is " + obj.fib(fibNum));
    }
}


	   


