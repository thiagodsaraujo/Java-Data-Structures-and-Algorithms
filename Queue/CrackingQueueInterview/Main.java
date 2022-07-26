package Queue.CrackingQueueInterview;

public class Main {
    public static void main(String[] args) {
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Cat(("Kiki")));
        animals.enqueue(new Cat(("Morgana")));
        animals.enqueue(new Cat(("Minerva")));
        animals.enqueue(new Dog(("Jade")));
        animals.enqueue(new Dog(("Akira")));
        animals.enqueue(new Dog(("Tina")));

        System.out.println(animals.dequeueAny().name());
        System.out.println(animals.dequeueDogs().name());
        System.out.println(animals.dequeueCats().name());
    }
}
