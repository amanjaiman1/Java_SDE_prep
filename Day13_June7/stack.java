package Day13_June7;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        for(int i = 0; i < s.size() - 1; i--) {
            s.pop();
            System.out.println(s.peek());
        }
    }
}
