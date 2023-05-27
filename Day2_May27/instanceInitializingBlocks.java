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
