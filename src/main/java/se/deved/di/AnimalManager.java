package se.deved.di;

import se.deved.Animal;

public class AnimalManager {

    private SaveManager saveManager;

    public AnimalManager(SaveManager saveManager) {
        this.saveManager = saveManager;
    }

    public void addAnimal(Animal animal) {
        saveManager.saveAnimal(animal);
    }
}
