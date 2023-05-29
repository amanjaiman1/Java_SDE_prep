/*
Certainly! Constructors in Java are special methods that are used to initialize objects of a class.
They have the same name as the class and do not have a return type. Constructors are called when an object is created using the new keyword.
*/

package Day2_May27;

public class Constructor {
    String color;
    int numbers;

    public void write() {
        System.out.println("Writing Something by " + color + " pen and we have  " + numbers + " pens "  );
    }
    public static void main(String[] args) {
        Constructor myPen = new Constructor();

        myPen.color = "Red";
        myPen.numbers = 12;

        myPen.write();

    }
}

//Output: Writing Something by Red pen and we have 12 pen
