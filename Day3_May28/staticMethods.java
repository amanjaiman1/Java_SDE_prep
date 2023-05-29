package Day3_May28;

public class staticMethods {
    public static String reverseString(String input){
        StringBuilder reversed = new StringBuilder(input);
        return  reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String reversed = staticMethods.reverseString("My name not like Aman");
        System.out.println(reversed);
    }
}
