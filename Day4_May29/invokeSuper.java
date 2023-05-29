package Day4_May29;

class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        super.makeSound(); // Invoking the superclass method
        System.out.println("Meow");
    }
}

public class invokeSuper {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}

