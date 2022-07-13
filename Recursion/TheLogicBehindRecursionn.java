package Recursion;

// Aula 12 do curso, explica o stack de memoria chamada pelo sistema
// So the last method that we inserted over here will be run the first
// last in, first out

public class TheLogicBehindRecursionn {

    public static void main(String[] args) {

        firstMethod();
        recursiveMethod(10);
    }
    static void firstMethod(){
        secondMethod();
        System.out.println("I am the first Method");
    }

    static void secondMethod(){
        thirdMethod();
        System.out.println("I am the second Method");
    }

    static void thirdMethod(){
        fourthMethod();
        System.out.println("I am the third Method");
    }

    static void fourthMethod(){
        System.out.println("I am the fourth Method");
    }

    static void recursiveMethod(int n){
        if (n < 1){
            System.out.println("n is less than 1");
        }else {
            recursiveMethod(n-1);
            System.out.println(n);
        }
    }
}
