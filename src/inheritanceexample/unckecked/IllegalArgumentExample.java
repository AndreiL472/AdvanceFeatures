
//Unchecked Exception - IllegalArgumentException (excepție logică)

package inheritanceexample.unckecked;
public class IllegalArgumentExample {
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Varsta nu poate fi negativă.");
        }
    }
    public static void main(String[] args) {
        try {
            setAge(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        } finally {
            System.out.println("Se execută mereu.");
        }
    }
}