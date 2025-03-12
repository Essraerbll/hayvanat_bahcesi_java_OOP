// Abstract class: Animal
public abstract class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract methods (Different animal types will provide their own versions)
    public abstract void makeSound();
    public abstract void eat();
    
    // Common method
    public void displayInfo() {
        System.out.println("Animal: " + name + ", Age: " + age);
    }
}
