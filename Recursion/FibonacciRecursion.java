package Recursion;

public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
    //f(n) = f(n-1) + f(n+2)

    public static int fibonacci(int n){
        if (n < 0){
            return -1;
        }
        if (n== 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
