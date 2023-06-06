package Day11_June5;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(102);
        list.add(23);
        list.add(1004);
        list.add(922);


        list.add(1, 99);
        System.out.println(list);

        list.set(0,1);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
