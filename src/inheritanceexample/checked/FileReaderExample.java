
//Checked Exception - IOException trebuie tratată
package inheritanceexample.checked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Linie: " + line);
            }
        } catch (IOException e) {
            System.out.println("Checked Exception: Eroare la citirea fișierului.");
        }
    }
}