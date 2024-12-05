package Abstract;

public abstract class AbstractAnimal {
    private String nameOfAnimal;

    public static final String Bird = "Bird";
    public static final String Dog = "Dog";
    public static final String Cat = "Cat";

    protected AbstractAnimal(String name) {
        nameOfAnimal = name;
    }
    abstract public double animalWeight();

    public void printArea(){
        double area = this.animalWeight(); // dynamic binding
        System.out.println("The area of the " + nameOfAnimal + " = " + area);
    }
}