package se.deved;

// Child, sub till Animal
public class Cat extends Animal {
    // Cat ärver Animal

    public String favoriteFood;

    public Cat(String name, double weight, int age, String favoriteFood) {
       super(name, weight, age);

       this.favoriteFood = favoriteFood;
        System.out.println(this.age);
    }

    public static Cat createCat() {
        return new Cat("Ironman", 4.0, 4, "fish");
    }

    @Override
    public void eat() {
        System.out.println("Katter äter fisk.");
    }
}