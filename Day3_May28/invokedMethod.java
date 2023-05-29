package Day3_May28;

public class invokedMethod {
    private int length;
    private int breadth;

    public invokedMethod(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int CalculateArea() {
        return length*breadth;
    }

    public static void main(String[] args) {
        invokedMethod rect = new invokedMethod(5,20);
        System.out.println("Rectangle: " + rect.CalculateArea());

    }
}
