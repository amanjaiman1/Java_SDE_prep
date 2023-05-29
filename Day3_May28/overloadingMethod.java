package Day3_May28;

public class overloadingMethod {
    public  int maxCalc(int x, int y){
        return x*y;
    }
    public double maxCalc(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        overloadingMethod calc = new overloadingMethod();

        int calc1 = calc.maxCalc(10,20);
        double calc2 = calc.maxCalc(1.5,5.5);

        System.out.println("calc1: " + calc1 + " calc2: " + calc2);
    }
}
