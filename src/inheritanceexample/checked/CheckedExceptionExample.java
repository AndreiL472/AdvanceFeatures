
// Checked Exception - trebuie tratată (FileNotFoundException este checked)
package inheritanceexample.checked;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
    static boolean readFile() throws FileNotFoundException {
        FileReader reader = new FileReader("myfile.txt");
        return true;
    }
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception: fisierul nu exista.");
        }
        try {
            FileReader reader = new FileReader("fisier.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception: alt fisier lipsa.");
        }
    }
}
