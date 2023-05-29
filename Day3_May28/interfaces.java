package Day3_May28;

// Interface declaration
interface Printable {
    void print();
}

// Class implementing the interface
class Printer implements Printable {
    public void print() {
        System.out.println("Printing...");
    }
}

// Another class implementing the interface
class Scanner implements Printable {
    public void print() {
        System.out.println("Scanning...");
    }
}

// Main class to test the interface implementation
public class interfaces {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(); // Output: Printing...

        Scanner scanner = new Scanner();
        scanner.print(); // Output: Scanning...
    }
}
