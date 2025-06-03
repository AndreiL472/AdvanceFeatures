
//Error - StackOverflowError cauzat de recursivitate infinită
package inheritanceexample.unckecked;

public class StackCrash {
    public static void infiniteRecursion() {
        infiniteRecursion(); // apel infinit
    }
    public static void main(String[] args) {
        infiniteRecursion();
    }
}