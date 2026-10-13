import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_67 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            StringBuilder sb = new StringBuilder();
            if (str.length() > 0 && str.charAt(0) != 'o') {
                sb.append(str.charAt(0));
            }
            if (str.length() > 1 && str.charAt(1) != 'o') {
                sb.append(str.charAt(1));
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