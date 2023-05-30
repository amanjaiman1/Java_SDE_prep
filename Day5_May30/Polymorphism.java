package Day5_May30;

// Shape class (parent class)
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Circle class (subclass of Shape)
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Rectangle class (subclass of Shape)
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Main class
public class Polymorphism {
    public static void main(String[] args) {
        Shape shape1 = new Circle(); // Creating a Circle object as a Shape reference
        Shape shape2 = new Rectangle(); // Creating a Rectangle object as a Shape reference

        shape1.draw(); // Calls the draw() method of Circle class at runtime
        shape2.draw(); // Calls the draw() method of Rectangle class at runtime
    }
}

