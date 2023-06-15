package Day15_June15;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 20);
        map.put("Lanka", 120);
        map.put("UK", 220);
        map.put("America", 420);
        map.put("China", 320);


        System.out.println(map);

        System.out.println(map.get("UK"));
    }
}
