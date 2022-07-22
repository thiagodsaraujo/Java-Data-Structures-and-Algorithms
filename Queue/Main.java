package Queue;

public class Main {
    public static void main(String[] args) {
        QueueArray newQueue = new QueueArray(5);
//        System.out.println(newQueue.isFull());
//        System.out.println(newQueue.isEmpty());

        newQueue.enQueue(1);
        newQueue.enQueue(2);

        // deQueue

        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.peek());

    }
}
