package Arrays.ResizableArray;

public class ResizableArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        arr = (int[]) resizeArray(arr, 5);
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    private static Object resizeArray(Object oldArray, int newSize){

        int oldSize = java.lang.reflect.Array.getLength(oldArray);

        Class elementType = oldArray.getClass().getComponentType();

        Object newArray = java.lang.reflect.Array.newInstance(elementType, newSize);

        int preserveLength = Math.min(oldSize, newSize);

        if (preserveLength > 0){
            System.arraycopy(oldArray, 0, newArray,0,  preserveLength);
        }
        return newArray;
    }


}
