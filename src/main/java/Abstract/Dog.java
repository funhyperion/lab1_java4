package Abstract;

public class Dog extends AbstractAnimal  {
    private double size;
    private double ears;

    public Dog(String name, double size, double ears) {
        super(name);
        this.size = size;
        this.ears = ears;
    }

    public double animalWeight() {
        return size * ears;
    }
}

