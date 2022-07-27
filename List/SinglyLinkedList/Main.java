package List.SinglyLinkedList;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);

        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 2);
        sLL.insertInLinkedList(8, 3);
        sLL.insertInLinkedList(99, 4);
        sLL.traverseSinglyLinkedList();
        sLL.deletionOfNode(0);
        sLL.traverseSinglyLinkedList();
        sLL.searchNode(99);



//        System.out.println(sLL.head.toString());



    }
}
