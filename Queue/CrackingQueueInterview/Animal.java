package Queue.CrackingQueueInterview;

public abstract class Animal {

    private int order;

    protected String name;

    public Animal(String n){
        name = n;
    }

    public abstract String name();

    public void setOrder(int ord){
        order = ord;
    }

    public int getOrder(){
        return order;
    }

    public boolean isOlderThan (Animal animal){
        return this.order < animal.getOrder();
    }



}
