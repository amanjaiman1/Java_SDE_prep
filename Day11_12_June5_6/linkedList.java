package Day11_12_June5_6;

import java.util.*;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<> ();

        list.addFirst("name");
        list.addLast("is");
        list.addFirst("my");
        list.addLast("aman");
        list.addFirst("hey");

        System.out.println(list);
        System.out.println(list.size());

        list.removeFirst();
        System.out.println(list);
    }
}
