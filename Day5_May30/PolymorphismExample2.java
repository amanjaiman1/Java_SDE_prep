package Day5_May30;

// Employee class (parent class)
abstract class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateSalary();
}

// RegularEmployee class (subclass of Employee)
class RegularEmployee extends Employee {
    private double baseSalary;

    public RegularEmployee(String name, int age, double baseSalary) {
        super(name, age);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

// ContractEmployee class (subclass of Employee)
class ContractEmployee extends Employee {
    private int contractDuration;
    private double hourlyRate;

    public ContractEmployee(String name, int age, int contractDuration, double hourlyRate) {
        super(name, age);
        this.contractDuration = contractDuration;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return contractDuration * hourlyRate;
    }
}

// Main class
public class PolymorphismExample2 {
    public static void main(String[] args) {
        Employee employee1 = new RegularEmployee("John Doe", 30, 5000.0);
        Employee employee2 = new ContractEmployee("Jane Smith", 25, 6, 15.0);

        System.out.println("Employee 1: " + employee1.getName() + ", Salary: $" + employee1.calculateSalary());
        System.out.println("Employee 2: " + employee2.getName() + ", Salary: $" + employee2.calculateSalary());
    }
}
