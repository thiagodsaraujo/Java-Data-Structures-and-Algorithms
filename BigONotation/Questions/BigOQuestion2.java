package BigONotation.Questions;

public class BigOQuestion2 {
    public static void main(String[] args) {
        int[] customArray = {1, 2,3,4,5};
        int[] customArray2 = {1, 2, 3, 4, 5};
        System.out.println(printPairs(customArray));
        System.out.println("==========");
        System.out.println(printPairs2(customArray2));

    }

    static Object printPairs(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
                count++;
            }
        }
        return "Numero de pares: "+ count;
    }

    static Object printPairs2(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
                count++;
            }
        }
        return "Numero de pares: "+ count;
    }
}
