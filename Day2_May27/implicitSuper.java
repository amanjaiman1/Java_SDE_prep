/*
In this example, we have a Vehicle class and a Car class that extends the Vehicle class.
The Vehicle class has a constructor that takes a brand parameter and initializes the brand variable.
The Car class has a constructor that takes both a brand and year parameter.

When you create an instance of the Car class, the Car constructor is called.
But before the Car constructor executes, the implicit super constructor of the Vehicle class is invoked using the super(brand) statement.
This ensures that the superclass (Vehicle) is properly initialized before the subclass (Car) is initialized.
The super(brand) call passes the brand parameter to the superclass constructor.

*/

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


Output: Vehicle constructor called
        Car constructor called
        Brand: Toyota
        Year: 2021

/*
As you can see, when the Car object is created, the implicit super constructor of the Vehicle class is automatically invoked first,
initializing the brand variable. Then, the Car constructor is executed, initializing the year variable.

This example demonstrates how the implicit super constructor works in Java to ensure proper initialization of superclass members
before the subclass constructor is executed.
*/


