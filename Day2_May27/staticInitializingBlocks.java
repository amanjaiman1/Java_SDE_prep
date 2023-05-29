/*
Static Initialization Blocks:
Static initialization blocks are executed when the class is first loaded into memory, before any static variables or static methods are accessed.
Static initialization blocks are declared using the static keyword.
They are useful for performing one-time setup tasks or initializing static variables.

-In this example, the MyClass contains a static initialization block declared with the static keyword.
Inside the block, we print a message and initialize the static variable count to 5.
When we run the Main class, the static initialization block is executed when the MyClass is first loaded into memory.

*/

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

Output: I want something else
        We are noe inside the constructor
        count: 20

/*
Now we can see the main function is first get allocated in memory ,
execute the "I want something else" and then the class referStatic got revoked
*/
