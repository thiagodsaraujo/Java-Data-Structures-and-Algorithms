package Arrays;

import java.util.Arrays;

public class SingleDimensionArray {

    public static void main(String[] args) {

        SingleDimensionArray lista = new SingleDimensionArray(10);
        lista.insert(0,10);
        lista.insert(1,11);
        lista.insert(2,12);
        lista.insert(3,13);
        lista.insert(4,14);

//        var firstElement = lista.arr[0];
//        var secondElement = lista.arr[1];
//        var thirdElement = lista.arr[2];
//        var fourthElement = lista.arr[3];
//
        lista.traverseArray();
        System.out.println("\n~~~~~~~~~~~~~~~~");
//        lista.searchInArray(15);
        lista.deleteValue(0);
        lista.traverseArray();


    }

    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted){
        try{
            if (arr[location] == Integer.MIN_VALUE){
                arr[location] =valueToBeInserted;
                System.out.println("Successfully inserted");
            }else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array!");
        }
    }

    // Array Traversal

    public void traverseArray(){
        try {
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }catch (Exception e){
            System.out.println("Array no longer exists!");
        }

    }

    // Search for an element in the given Array

    public void searchInArray(int valueToSearch){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == valueToSearch){
                System.out.println("Value " + valueToSearch + " is found at the index" +
                        "of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found!");
    }

    // Delete value form Array

    public void deleteValue(int valueToDeleteIndex){
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The value that is provided is not in the range");
        }
    }
}
