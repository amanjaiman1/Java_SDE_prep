package Day9_10_June4;

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3};
            System.out.println("Outer try block");

            try {
                // Inner try block
                int result = numbers[5] / 0;
                System.out.println("Inner try block");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index out of bounds");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } finally {
            System.out.println("Finally block");
        }
    }
}

