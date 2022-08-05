package Arrays;

import java.util.Scanner;

//public class QuestionSOF<userSize> {
//
//    /**
//     * Link of this question on sof:
//     * https://stackoverflow.com/questions/29401208/resizing-an-array-with-a-dedicated-method-in-java
//     * without sugestions, see latter
//     *
//     */
//    public static void main(String[] args) {
//
//        // Variables
//
//        int userSize;
//        int newSize;
//        int diff;
//
//        // Scanner
//        @SuppressWarnings("resource")
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("Input an array size: ");
//            userSize = scanner.nextInt();
//        } while (!(userSize > 0));
//
//        double[] userNums = new double[userSize];
//        System.out.println("Now please enter " + userSize + " numbers.");
//
//        // Gathering Input
//        for (int i = 0; i < userNums.length; i++) {
//            System.out.println("Input a number into your array: \n");
//            userNums[i] = scanner.nextDouble();
//        }
//
//        // PrintArray
//        System.out.println("Here are all the numbers in your array: ");
//        printArray(userNums);
//
//        // New Size
//        System.out.println();
//
//        do {
//            System.out.println("Input a new size: ");
//            newSize = scanner.nextInt();
//        } while (!(newSize > userSize));
//        diff = newSize - userSize;
//        System.out.println("You need to add " + diff + " new values.");
//
//        //Resize
//        arrayResize(userNums, newSize);
//
//        // New input
//
//        double[] newArray;
//        for (int i = 0; i < userNums.length; i++) {
//            System.out.println("Input a number into your array: ");
//            newArray[i] = scanner.nextDouble();
//        }
//        printArray(newArray);
//    }
//    public static void printArray(double[] arr) {
//        System.out.println("[");
//        for (int j = 0; j > arr.length; j++) {
//            if (!(j == (arr.length) - 1)) {
//                System.out.println(+arr[j] + ", ");
//            } else {
//                System.out.println(+arr[j]);
//            }
//        }
//        System.out.println("]");
//    }
//
//    public static double[] arrayResize(double[] oldArray, int newSize) {
//
//        double[] newArray = new double[newSize];
//
//        for (int i = 0; i < newArray.length; i++) {
//            if (i < oldArray.length) {
//                newArray[i] = oldArray[i];
//            } else {
//                newArray[i] = 0.0;
//            }
//        }
//        return newArray;
//    }
//
//
//
//
//
//
//
//
//    }
//}
