package Day9_June4;

public class exception {
    public static void main(String[] args) {
        try {
            double m = 12/9;
            System.out.println(m);
        } catch (ArithmeticException e) {
            System.out.println("Hey this is totally wrong, why you parsing string in Int");
        }

    }
}
