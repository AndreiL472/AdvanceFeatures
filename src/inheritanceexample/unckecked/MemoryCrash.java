
// Error - OutOfMemoryError nu e tratabil în mod normal
package inheritanceexample.unckecked;

public class MemoryCrash {
    public static void main(String[] args) {
        int[] massive = new int[Integer.MAX_VALUE]; // provoacă OutOfMemoryError
    }
}