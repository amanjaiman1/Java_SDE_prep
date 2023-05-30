package Day5_May30;

// Animal class (parent class)
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class (subclass of Animal)
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Cat class (subclass of Animal)
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class PolymorphismExample1 {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Creating a Dog object as an Animal reference
        Animal animal2 = new Cat(); // Creating a Cat object as an Animal reference

        animal1.makeSound(); // Calls the makeSound() method of Dog class at runtime
        animal2.makeSound(); // Calls the makeSound() method of Cat class at runtime
    }
}
