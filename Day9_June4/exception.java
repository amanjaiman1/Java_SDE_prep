package Day9_June4;

public class exception {
    public static void main(String[] args) {
        try {
            int myInt = Integer.parseInt("abd");
        } catch (NumberFormatException nfe) {
            System.out.println("Hey this is totally wrong, why you parsing string in Int");
        }
    }
}
