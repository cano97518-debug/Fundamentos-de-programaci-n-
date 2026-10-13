import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_66 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            StringBuilder sb = new StringBuilder();
            if (str.length() > 0) {
                if (str.charAt(0) == 'g') sb.append('g');
            }
            if (str.length() > 1) {
                if (str.charAt(1) == 'h') sb.append('h');
            }
            if (str.length() > 2) {
                sb.append(str.substring(2));
            }
            System.out.println("La nueva cadena es: " + sb.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}