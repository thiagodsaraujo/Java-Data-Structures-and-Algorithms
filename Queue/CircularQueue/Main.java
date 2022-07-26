package Queue.CircularQueue;

public class Main {
    public static void main(String[] args) {
    CircularQueue circularQueue = new CircularQueue(3);
    circularQueue.enQueue(10);
    circularQueue.enQueue(20);
    circularQueue.enQueue(30);
    circularQueue.enQueue(40);
    circularQueue.enQueue(50);

        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());

    }


}
