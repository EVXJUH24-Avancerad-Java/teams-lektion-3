package se.deved;

public class Dog extends Animal {

    public Dog(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void eat() {
        System.out.println("Hundar äter ben!");
    }
}
