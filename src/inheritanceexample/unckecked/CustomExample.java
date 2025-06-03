
//Custom Checked Exception - definită de utilizator, extinde Exception
package inheritanceexample.unckecked;

public class CustomExample {
    public static void main(String[] args) {
        try {
            throw new MyException("Aceasta este o excepție personalizată!");
        } catch (MyException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}