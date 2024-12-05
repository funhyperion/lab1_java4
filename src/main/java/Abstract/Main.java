package Abstract;

public class Main {
    public static void main(String [] args) {
        AbstractAnimal rect = new Dog(AbstractAnimal.Dog, 30, 2);
        AbstractAnimal circ = new Cat(AbstractAnimal.Cat, 1);

        rect.printArea();
        circ.printArea();
    }
}
