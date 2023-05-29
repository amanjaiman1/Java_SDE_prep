package Day4_May29;

class Shape {
    protected int area;

    public void calculateArea() {
        System.out.println("Calculating area in the Shape class");
    }
}

class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        super.calculateArea(); // Calling the superclass method
        area = length * width; // Accessing the superclass variable
        System.out.println("Area of the rectangle: " + area);
    }
}


public class accessSuper {
    public static void main(String[] args) {
        Rectangle calc = new Rectangle(10 , 20);
        calc.calculateArea();
    }
}
