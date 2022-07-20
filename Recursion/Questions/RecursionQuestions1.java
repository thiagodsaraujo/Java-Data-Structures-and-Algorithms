package Recursion.Questions;

public class RecursionQuestions1 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(333));
        System.out.println(power(2,10));
    }

    // Question 1

    public static int sumOfDigits(int n){
        if (n == 0 || n < 0){
            return 0;
        }
        return n % 10 + sumOfDigits( n / 10);
    }

    // Question 2 - Power

    public static int power(int base, int exp) {
        if (exp < 0){
            return -1;
        }
        if (exp == 0){
            return 1;
        }
        return base * power(base, exp - 1);
    }

    // Question 3 - Common divisor - GCD

    public  static int gcd(int a, int b){
        if (a < 0 || b < 0 ){
            return -1;
        }
        if (b == 0){
            return a;
        }
        return gcd (b,a % b);
    }

    // Question 4 - Convert Decimal to Binary

    public static int decimalToBinary(int n){
        if (n == 0){
            return 0;
        }
        return n % 2 + 10 * decimalToBinary(n / 2);
    }
}



