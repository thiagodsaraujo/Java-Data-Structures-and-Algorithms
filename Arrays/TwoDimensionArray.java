package Arrays;
import java.util.Arrays;
public class TwoDimensionArray {

    /**
     * When to use:
     * - To store multiple variables of same data type;
     * - Random acess;
     *
     * When to avoid
     * - Same data type elements;
     * - Reserve memory;
     */

    int arr[][] = null;

    // Constructor

    public TwoDimensionArray(int numberOfRows, int numberOfColumns){
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr.length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the Array
    public void insertValueInTheArray(int row, int col, int value){
        try {
            if (arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            }else {
                System.out.println("This cell already occupied");

            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }

    // Acessing cell value from given array
    public void acessCell(int row, int col){
        System.out.println("\nAcessing Row #" + row + ", Col #" + col);
        try {
            System.out.println("Cell value is: " + arr[row][col]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }

    //Traversing Two Dimensional Array
    public void traverse2DArray(){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Searching  2D Array

    public  void searchingValue(int value){
        for (int row = 0; row < arr.length; row++){
            for (int col=0; col< arr[0].length; col++){
                if (arr[row][col] == value){
                    System.out.println("Value is found at row: " + row + ", and Col: " + col);
                    return;
                }
            }
        }
    System.out.println("Value is not found!");
    }

    // Deleting Array Element in 2D Array
    public void deletingValueFromArray(int row, int col){
        try {
            System.out.println("Successfully deleted: " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This index is not valid for array");
        }
    }


    public static void main(String[] args) {
        //Step 1 - Declare
        int [][] int2DArray;
        //Step 2 - Instantiate
        int2DArray = new int[2][2]; // 2 rows and 2 columns
        //Step 3 - Initialize
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;
        System.out.println(Arrays.deepToString(int2DArray));
        // All together
        String s2DArray[][] = {{"a","b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(s2DArray));

        // Insertion

        TwoDimensionArray sda = new TwoDimensionArray(3,3);
        sda.insertValueInTheArray(0,0,10);
        sda.insertValueInTheArray(0,1,20);
        sda.insertValueInTheArray(1,0,30);
        sda.insertValueInTheArray(2,0,40);
        sda.insertValueInTheArray(2,1,50);
//        System.out.println(Arrays.deepToString(sda.arr));

//        sda.acessCell(0,0);
//        sda.acessCell(0,1);

        // Traverse 2D Array
        sda.traverse2DArray();

        //Searching Value in 2D Array
        sda.searchingValue(70);
        System.out.println("\n------------------------------");
        //Deleting Value in 2D Array
        System.out.println(Arrays.deepToString(sda.arr));
        sda.deletingValueFromArray(0, 0);
        System.out.println(Arrays.deepToString(sda.arr));
    }

}
