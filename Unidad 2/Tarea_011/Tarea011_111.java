import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_111 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Introduce una cadena:");
            String text = reader.readLine();
            System.out.println("Introduzca la palabra que desea eliminar:");
            String word = reader.readLine();

            String result = text.replaceAll("\\b" + word + "\\b", "").replaceAll("\\s+", " ").trim();
            System.out.println("Nueva cadena, después de eliminar dicha palabra:\n" + result);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}