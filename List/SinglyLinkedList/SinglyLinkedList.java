package List.SinglyLinkedList;

public class SinglyLinkedList {

    // Create Head and Tail

    public Node head;
    public Node tail;
    public int size;

    // Create Single List

    /**
     *  Criamos o head e tail da lista e o primeiro nó
     *
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

    // Insert Method SinglyLinkedList
    // Time Complexity = Big O = N
    // Space Complexity = Big O = 1

    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0){
            node.next = head;
            head = node;
        } else if (location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // SinglyLinkedList Traversal
    // Time Complexity = Big O = N
    // Space Complexity = Big O = 1

    public void traverseSinglyLinkedList(){
        if (head == null){
            System.out.println("Singly Linked List doesn't exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size ; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" -> ");
                } else {
                    System.out.println(" -> End of the list.");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

}
