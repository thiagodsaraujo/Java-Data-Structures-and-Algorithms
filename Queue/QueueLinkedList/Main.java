package Queue.QueueLinkedList;


import Queue.QueueLinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList newQll = new QueueLinkedList();

        newQll.enQueue(10);
        newQll.enQueue(20);
        newQll.enQueue(30);
        System.out.println("1 - " + newQll.peek());
        System.out.println(newQll.deQueue());
        System.out.println("1 - " + newQll.peek());
        System.out.println(newQll.deQueue());
        System.out.println("1 - " + newQll.peek());
        System.out.println(newQll);
        newQll.deleteQueue();

        }
    }

