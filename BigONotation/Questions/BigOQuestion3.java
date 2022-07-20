package BigONotation.Questions;

import java.util.Arrays;

public class BigOQuestion3 {

    public static void main(String[] args) {
        int[] customArray = {1, 2,3,4,5};
        int[] customArray2 = {1, 2, 3, 4, 5};
        System.out.println(reverseArray(customArray));
    }
    
    public static Object reverseArray(int[] array){
        for (int i = 0; i < array.length/2 ; i++) {
            int other = array.length-i-1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
        System.out.println(Arrays.toString(array));
        return 0;
    }

}
