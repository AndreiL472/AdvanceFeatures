
//Unchecked Exception - ArithmeticException apare la rulare
package inheritanceexample.unckecked;

public class ArithmeticExample {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: Împărțire la 0.");
        }
    }
}