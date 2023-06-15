package Day15_June15;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(7);
        set.add(2);
        set.add(5);
        set.add(1);

        System.out.println(set);
        if (set.contains(3)){
            System.out.println("Set contains 3");
        }
    }
}
