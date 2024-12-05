package Factory;

public class Main {
    public static void main(String[] args) {
        // Використання патерну Factory Method
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.makeSound(); // Виведе: Woof!

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.makeSound(); // Виведе: Meow!
    }
}
