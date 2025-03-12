public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();

        // Creating different animals
        Lion lion = new Lion("Lion King", 5);
        Elephant elephant = new Elephant("Dumbo", 10);

        // Adding animals
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);

        // Listing animals
        myZoo.showAllAnimals();

        // Making animals sound
        myZoo.makeAllSounds();
    }
}
