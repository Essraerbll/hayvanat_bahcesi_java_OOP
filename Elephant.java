public class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " trumpeted: Prrrr!");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating grass.");
    }
}
