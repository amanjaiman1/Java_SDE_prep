package Day9_June4;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Exception handling code
            System.out.println("Error: Division by zero");
        }
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
