package Day6_May31;

class encapsulate{
    private String name;
    private int age;
    private int number;

    public encapsulate(){
        name = "Aman";
        age = 20;
        number = 637872;
    }

    public String getName() {
        return  this.name;
    }
    public int getAge() {
        return  this.age;
    }
    public int getNumber() {
        return  this.number;
    }

}

public class Student {
    public static void main(String[] args) {
        encapsulate values = new encapsulate();
        System.out.println("Name: " + values.getName());
        System.out.println("Age: " + values.getAge());
        System.out.println("Number: " + values.getNumber()  );
    }
}
