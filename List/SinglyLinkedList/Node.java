package List.SinglyLinkedList;

public class Node {
    public int value;
    public Node next;


    @Override
    public String toString() {
        String result = value + ", ";
        if (next != null){
            result += next.toString();
        }
        return result;
    }

    public int print(){
        return value;
    }

}
