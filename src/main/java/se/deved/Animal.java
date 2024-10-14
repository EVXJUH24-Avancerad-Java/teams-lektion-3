package se.deved;

// Bas, super, parent till Cat
public abstract class Animal {
    public String name;
    public double weight;
    protected int age;

    public Animal(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public abstract void eat();
}