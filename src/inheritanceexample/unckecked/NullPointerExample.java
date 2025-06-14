
// Unchecked Exception - NullPointerException apare dacă accesezi un obiect null
package inheritanceexample.unckecked;

public class NullPointerExample {
    public static void main(String[] args) {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Unchecked Exception: text este null.");
        }
    }
}