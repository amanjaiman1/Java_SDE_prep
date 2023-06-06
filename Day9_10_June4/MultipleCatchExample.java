package Day9_June4;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[5] / 0;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } catch (Exception e) {
            System.out.println("Error: Something went wrong");
        }
    }
}
