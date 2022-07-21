package Arrays;

import java.util.Arrays;

public class SingleDimensionArray {

    public static void main(String[] args) {

        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,10);
        sda.insert(1,11);
        sda.insert(2,12);
        sda.insert(3,13);
        sda.insert(4,14);

        var firstElement = sda.arr[0];
        var secondElement = sda.arr[1];
        var thirdElement = sda.arr[2];
        var fourthElement = sda.arr[3];

        System.out.println(firstElement);
        System.out.println(secondElement);
        System.out.println(thirdElement);
        System.out.println(fourthElement);

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
}
