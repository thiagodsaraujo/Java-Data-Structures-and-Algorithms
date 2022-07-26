package Queue.LinearQueue;

public class QueueArray {

    //https://pythontutor.com/visualize.html#code=public%20class%20QueueArray%20%7B%0A%20%20%20%20int%5B%5D%20arr%3B%0A%20%20%20%20int%20topOfQueue%3B%0A%20%20%20%20int%20beginningOfQueue%3B%0A%0A%0A%20%20%20%20public%20QueueArray%28int%20size%29%7B%0A%20%20%20%20%20%20%20%20this.arr%20%3D%20new%20int%5Bsize%5D%3B%0A%20%20%20%20%20%20%20%20this.topOfQueue%20%3D%20-1%3B%0A%20%20%20%20%20%20%20%20this.beginningOfQueue%20%3D%20-1%3B%0A%20%20%20%20%20%20%20%20System.out.println%28%22The%20Queue%20is%20succesffully%20created%20with%20size%20of%3A%20%22%20%2B%20size%29%3B%0A%20%20%20%20%7D%0A%20%20%20%20//%20IsFull%0A%20%20%20%20public%20%20boolean%20isFull%28%29%7B%0A%20%20%20%20%20%20%20%20if%20%28topOfQueue%20%3D%3D%20arr.length-1%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20return%20true%3B%0A%20%20%20%20%20%20%20%20%7Delse%20%7B%0A%20%20%20%20%20%20%20%20return%20false%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%7D%0A%20%20%20%20//IsEmpty%0A%20%20%20%20public%20boolean%20isEmpty%28%29%7B%0A%20%20%20%20%20%20%20%20if%20%28beginningOfQueue%20%3D%3D%20-1%20%7C%7C%20beginningOfQueue%20%3D%3D%20arr.length%29%7B%0A%20%20%20%20%20%20%20%20return%20true%3B%0A%20%20%20%20%20%20%20%20%7Delse%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20return%20false%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%7D%0A%20%20%20%20//%20Enqueue%0A%20%20%20%20public%20void%20enQueue%28int%20value%29%7B%0A%20%20%20%20%20%20%20%20if%20%28isFull%28%29%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20System.out.println%28%22The%20Queue%20is%20Full%22%29%3B%0A%20%20%20%20%20%20%20%20%7D%20else%20if%28isEmpty%28%29%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20beginningOfQueue%20%3D%200%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20topOfQueue%2B%2B%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20arr%5BtopOfQueue%5D%20%3D%20value%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20System.out.println%28%22Succesffully%20inserted%20%22%20%2B%20value%20%2B%20%22%20in%20the%20queue%22%29%3B%0A%20%20%20%20%20%20%20%20%7D%20else%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20topOfQueue%2B%2B%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20arr%5BtopOfQueue%5D%20%3D%20value%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20System.out.println%28%22Succesffully%20inserted%20%22%20%2B%20value%20%2B%20%22%20in%20the%20queue%22%29%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%7D%0A%0A%20%20%20%20//%20deQueue%0A%0A%20%20%20%20public%20int%20deQueue%28%29%7B%0A%20%20%20%20%20%20%20%20if%20%28isEmpty%28%29%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20System.out.println%28%22The%20Queue%20is%20empty!%22%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20return%20-1%3B%0A%20%20%20%20%20%20%20%20%7D%20else%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20int%20result%20%3D%20arr%5BbeginningOfQueue%5D%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20beginningOfQueue%2B%2B%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20if%20%28beginningOfQueue%20%3E%20topOfQueue%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20beginningOfQueue%20%3D%20topOfQueue%20%3D%20-1%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%20%20%20%20return%20result%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20//%20Peek%0A%20%20%20%20public%20int%20peek%28%29%7B%0A%20%20%20%20%20%20%20%20if%20%28!isEmpty%28%29%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20return%20arr%5BbeginningOfQueue%5D%3B%0A%20%20%20%20%20%20%20%20%7D%20else%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20System.out.println%28%22The%20Queue%20is%20empty!%22%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20return%20-1%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%7D%0A%20%20%20%20%0A%20%20%20%20//%20Delete%0A%20%20%20%20%0A%20%20%20%20public%20void%20deleteQueue%28%29%7B%0A%20%20%20%20%20%20%20%20arr%20%3D%20null%3B%0A%20%20%20%20%20%20%20%20System.out.println%28%22Queue%20is%20successfully%20deleted!%22%29%3B%0A%20%20%20%20%7D%0A%20%20%20%20%0A%20%20%0A%20%20%0A%20%20%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20QueueArray%20newQueue%20%3D%20new%20QueueArray%285%29%3B%0A//%20%20%20%20%20%20%20%20System.out.println%28newQueue.isFull%28%29%29%3B%0A//%20%20%20%20%20%20%20%20System.out.println%28newQueue.isEmpty%28%29%29%3B%0A%0A%20%20%20%20%20%20%20%20newQueue.enQueue%281%29%3B%0A%20%20%20%20%20%20%20%20newQueue.enQueue%282%29%3B%0A%0A%20%20%20%20%20%20%20%20//%20deQueue%0A%0A%20%20%20%20%20%20%20%20System.out.println%28newQueue.peek%28%29%29%3B%0A%0A%20%20%20%20%7D%0A%20%20%20%20%0A%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
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
