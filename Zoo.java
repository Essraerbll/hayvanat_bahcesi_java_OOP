import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    // Method to add an animal
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.name + " has been added to the zoo.");
    }

    // Method to list all animals
    public void showAllAnimals() {
        System.out.println("\n📋 Zoo Animal List:");
        for (Animal animal : animals) {
            animal.displayInfo();
        }
    }

    // Method to make all animals sound
    public void makeAllSounds() {
        System.out.println("\n🔊 Animals are making sounds:");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
