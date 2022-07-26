package List.SinglyLinkedList;

public class SinglyLinkedList {

    // Create Head and Tail

    public Node head;
    public Node tail;
    public int size;

    // Create Single List

    /**
     *  Criamos o head e tail da lista e o primeiro nó
     * @param nodeValue
     * @return
     */
    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;

    }
}
