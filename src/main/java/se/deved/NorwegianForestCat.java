package se.deved;

public class NorwegianForestCat extends Cat {
    public NorwegianForestCat(String name, double weight, int age, String favoriteFood) {
        super(name, weight, age, favoriteFood);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Norska skogskatter äter gräs.");
    }
}