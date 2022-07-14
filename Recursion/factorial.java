package Recursion;

import com.sun.tools.javac.Main;

public class factorial {

    public static void main(String[] args) {

        System.out.println(factorial(-3));
    }

    static int factorial(int n){
        if (n < 0){
            return -1;
        }else if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
