import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_107 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();
            System.out.print("Ingrese el carácter a contar: ");
            char c = reader.readLine().charAt(0);

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    count++;
                }
            }
            System.out.println("El carácter '" + c + "' aparece " + count + " veces.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}