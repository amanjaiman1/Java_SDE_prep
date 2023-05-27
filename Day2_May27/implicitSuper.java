package Day2_May27;

class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called");
    }

    public String getBrand() {
        return brand;
    }

}
class Car extends Vehicle {
    private int year;

    public Car(String brand, int year) {
        super(brand);
        this.year = year;
        System.out.println("Car constructor called");
    }

    public int getYear() {
        return year;
    }
}

public class implicitSuper {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2021);
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Year: " + myCar.getYear());
    }
}


