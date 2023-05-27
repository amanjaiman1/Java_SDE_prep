package Day2_May27;

class referStatic {
    private static int count;

    static {
        System.out.println("We are now inside the constructor");
        count = 20;
    }

    public static int getCount() {
        return count;
    }
}

public class staticInitializingBlocks {
    public static void main(String[] args) {
        System.out.println("I want something else");
        System.out.flush();
        System.out.println("count: " + referStatic.getCount());
    }
}
