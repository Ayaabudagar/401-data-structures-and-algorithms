/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());
        Stack <Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(50);
        System.out.println(stack.peek());
        Queue <Integer> queue = new Queue<>();
        System.out.println(queue.rear.value);
        queue.enqueue(2);
        PseudoQueue pseudo = new PseudoQueue();

        pseudo.enqueue(4);
        pseudo.enqueue(6);
        pseudo.dequeue();
        pseudo.enqueue(10);
        pseudo.dequeue();
        System.out.println(pseudo.stackOne.toString());

        AnimalShelter animalShelter = new AnimalShelter();
        System.out.println(animalShelter);
        animalShelter.dequeue("cat");
        animalShelter.dequeue("dog");
        Animal animal = new Dog();
        animalShelter.enqueue(animal);
    }
    public static boolean brackets (String string) {
        Stack<String> validateStack = new Stack<>();
        if (string.isEmpty()) return true;

        String[] bracketArray= string.split("");
        for (String character:bracketArray){
            if (character.equals("[") || character.equals("{") || character.equals("(")) {
                validateStack.push(character);

            if ((character.equals("]") || character.equals("}") || character.equals(")"))) {
                return false;
            }
                if (validateStack.isEmpty()) return false;

        }else if (character.equals("}")) {
                if (validateStack.top.value.equals("{")) validateStack.pop();
                else return false;
            } else if (character.equals(")")) {
                if (validateStack.top.value.equals("(")) validateStack.pop();
                else return false;
            } else if (character.equals("]")) {
                if (validateStack.top.value.equals("[")) validateStack.pop();
                else return false;
            }

    }
        return validateStack.isEmpty();
    }
}


