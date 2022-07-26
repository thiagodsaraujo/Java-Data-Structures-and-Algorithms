package Queue.CircularQueue;

public class CircularQueue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    // Time Complexity O(1) - Space Complexity O(N)

    public CircularQueue(int size){
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The CQ is successfully created with size of " + size);
    }

    // isEmpty
    // Time Complexity O(1) - Space Complexity O(1)

    public boolean isEmpty(){
        if (topOfQueue == -1) {
            return true;
        } else {
            return false;
        }
    }

    // isFull

    public boolean isFull(){
        // voltar a aula passada(163) para entender por que dessa condição
        // Time Complexity O(1) - Space Complexity O(1)

        if (topOfQueue+ 1 == beginningOfQueue){
            return true;
        } else if (beginningOfQueue == 0 && topOfQueue+1 == size){
            return true;
        }else {
            return false;
        }
    }

    // enQueue
    // Time Complexity O(1) - Space Complexity O(1)

    public void enQueue(int value){
        if (isFull()){
            System.out.println("The Queue is full!");
        } else if (isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("The Value is Successfully inserted " + value + " in the queue");
        } else {
            if (topOfQueue+1 == size){
                topOfQueue = 0;
            }else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("The Value is Successfully inserted " + value + " in the queue");
        }
    }

    //deQueue
    // Time Complexity O(1) - Space Complexity O(1)

    public int deQueue(){
        if (isEmpty()){
            System.out.println("The CQ is empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue + 1 == size){
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            return result;
        }
    }

    // peek
    // Time Complexity O(1) - Space Complexity O(1)


    public int peek(){
        if (isEmpty()){
            System.out.println("The CQ is empty!");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    //deleteQueue
    // Time Complexity O(1) - Space Complexity O(1)

    public void deleteQueue(){
        arr = null;
        System.out.println("Queue CQ is successfully deleted!");
    }

}
