/* Instance Initialization Blocks:
Instance initialization blocks are enclosed within curly braces {} and are not associated with any specific method or constructor.
They are executed whenever an object of the class is created, before the execution of any constructor.
Instance initialization blocks are useful when you have common initialization code that needs to be executed for every object of a class.

- In the example, the MyClass contains an instance initialization block enclosed within curly braces {}.
Inside the block, we print a message and initialize the value variable to 10. The MyClass constructor is also present and prints a message.
When we create an instance of MyClass (MyClass obj = new MyClass();), the instance initialization block is executed before the constructor.
*/


package Day2_May27;

class MyClass{
    private int value;
    {
        System.out.println("This will be execute first");
        value = 10;
    }

    public MyClass() {
        System.out.println("This is the inside constructor");
    }

    public int getValue(){
        return value;
    }
}

public class instanceInitializingBlocks {
    public static void main(String[] args) {
        MyClass theValue = new MyClass();
        System.out.println("value: " + theValue.getValue());
    }
}


Ouput : This will be execute first
        This is the inside constructor
        value: 10
