package Queue;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    /**
     * Time and Space Complexity of Linear Queue using Array
     *
     * Create Queue - Time Complexity O(1) / Space Complexity O(N)
     * @param size
     */
    public QueueArray(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is succesffully created with size of: " + size);
    }
    // IsFull

    /**
     * Time and Space Complexity of Linear Queue using Array
     *
     * isFull - Time Complexity O(1) / Space Complexity O(1)
     */

    public  boolean isFull(){
        if (topOfQueue == arr.length-1){
            return true;
        }else {
        return false;
        }
    }

    //IsEmpty
    /**
     * Time and Space Complexity of Linear Queue using Array
     *
     * isEmpty - Time Complexity O(1) / Space Complexity O(1)
     */

    public boolean isEmpty(){
        if (beginningOfQueue == -1 || beginningOfQueue == arr.length){
        return true;
        }else {
            return false;
        }
    }

    // Enqueue
    /**
     * Time and Space Complexity of Linear Queue using Array
     *
     * Enqueue - Time Complexity O(1) / Space Complexity O(1)
     */
    public void enQueue(int value){
        if (isFull()){
            System.out.println("The Queue is Full");
        } else if(isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Succesffully inserted " + value + " in the queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Succesffully inserted " + value + " in the queue");
        }
    }

    // deQueue
    /**
     * Time and Space Complexity of Linear Queue using Array
     *
     * deQueue- Time Complexity O(1) / Space Complexity O(1)
     */
    public int deQueue(){
        if (isEmpty()){
            System.out.println("The Queue is empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    // Peek
    /**
     * Time and Space Complexity of Linear Queue using Array
     *
     * Peek - Time Complexity O(1) / Space Complexity O(1)
     */
    public int peek(){
        if (!isEmpty()){
            return arr[beginningOfQueue];
        } else {
            System.out.println("The Queue is empty!");
            return -1;
        }
    }

    // Delete
    /**
     * Time and Space Complexity of Linear Queue using Array
     *
     * Delete - Time Complexity O(1) / Space Complexity O(1)
     */
    public void deleteQueue(){
        arr = null;
        System.out.println("Queue is successfully deleted!");
    }
}
