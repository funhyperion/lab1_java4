package Abstract;

public class Cat extends AbstractAnimal{
    private double weight;

    public Cat(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    public double animalWeight() {
        return weight*3;
    }
}
