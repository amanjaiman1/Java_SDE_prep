package Day2_May27;

public class Constructor {
    String color;
    int numbers;

    public void write() {
        System.out.println("Writing Something by " + color + " pen and we have  " + numbers + " pen "  );
    }
    public static void main(String[] args) {
        Constructor myPen = new Constructor();

        myPen.color = "Red";
        myPen.numbers = 12;

        myPen.write();

    }
}
