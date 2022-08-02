package Queue;


import java.util.Arrays;
import java.util.Iterator;

class Queue<T> implements Iterable<T> {

    private class QueueIterator implements Iterator<T>{
        private int curr = head;

        public boolean hasNext(){
            return curr != tail;
        }

        public void remove(){
            throw new UnsupportedOperationException();
        }
        public T next(){
            return data[curr++];
        }
    }

    private T[] data;
    private int head, tail;
    public Iterator<T> iterator(){
        return new QueueIterator();
    }

    public Queue(){
        data = (T[]) new Object[2];
        head = 0;
        tail = 0;
    }
    public int size(){
        return tail - head;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void realign(){
        java.util.Arrays.sort(data, new java.util.Comparator<Object>(){
            public int compare(Object o1, Object o2){
                if (o1 == null)return 1;
                else if (o2 ==null) return -1;
                else return 0;
            }
        });
        tail -= head;
        head = 0;
    }

    private void resize(){
        if (tail == data.length && size() != data.length){
            realign();
        }
        if (data.length == size()){
            int newLength = data.length * 2;
            T[] newData = (T[]) new Object[newLength];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        } else if (size() == data.length / 4 && size() != 0){
            int newLength = data.length / 2 ;
            T[] newData = (T[]) new Object[newLength];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    public void enqueue(T item){
        if (item == null){throw new NullPointerException();}
        resize();
        data[tail] = item;
        tail++;
        return;
    }

    public T dequeue(){
        if (isEmpty()){ throw new java.util.NoSuchElementException(); }
        T res = data[head];
        data[head] = null;
        head++;
        if (head == tail){
            head = tail = 0;
        }
        return res;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println(queue.head);
        System.out.println(queue.tail);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);

        System.out.println(queue.head);
        System.out.println(queue.tail);
        System.out.println(queue.toString());


//        System.out.println( queue.size());

    }


}
