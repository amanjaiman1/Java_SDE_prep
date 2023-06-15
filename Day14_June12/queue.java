package Day14_June12;
import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> letsque = new LinkedList<>();
        letsque.offer(1);
        letsque.add(2);
        letsque.add(3);
        letsque.add(4);
        letsque.add(5);

        while (!letsque.isEmpty()) {
            System.out.println(letsque.poll());
            System.out.println(letsque.size());
        }
    }
}
