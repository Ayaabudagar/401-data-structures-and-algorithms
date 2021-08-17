package stack.and.queue;

public class AnimalShelter {
    Queue<Animal> cat = new Queue<>();
    Queue<Animal> dog = new Queue<>();

    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dog.enqueue(animal);
        } else if (animal instanceof Cat) {
            cat.enqueue(animal);
        }
    }
    public Object dequeue(String pref) {
        if (pref.equals("cat")) {
            return cat.dequeue();
        } else  if (pref.equals("dog")) {
            return dog.dequeue();
        }
        return null;
    }
}
