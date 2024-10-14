package se.deved;

import se.deved.di.AnimalManager;
import se.deved.di.ListManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Inheritance
        //  extends, implements
        //  fields & methods
        //  instanceof & casting
        //  super
        //  constructors
        //  protected
        //  abstract
        //  interfaces

        // 2. Polymorphism
        //  override
        //  abstract
        //  interfaces

        // 3. Dependency injection (DI)
        AnimalManager animalManager = new AnimalManager(new ListManager());

        Cat cat = new Cat("Superman", 6.0, 7, "fish");

        cat.eat();

        Dog dog = new Dog("Batman", 6.0, 4);
        dog.weight = 4.0;

        dog.eat();

        printNameAnimal(cat);
        printNameAnimal(dog);
        System.out.println(cat.age);

        // Animal animal = new Animal("", 4.0, 2);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
    }

    public static void printNameAnimal(Animal animal) {
        System.out.println(animal.name);

        animal.eat();

        if (animal instanceof Cat) {
            // Kompileringsfel
            // System.out.println(animal.favoriteFood);

            Cat cat = (Cat) animal;
            System.out.println("Det är en katt!");
            System.out.println("Favoritmat: " + cat.favoriteFood);
        }
    }
}
