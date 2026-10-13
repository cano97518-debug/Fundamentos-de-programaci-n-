import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_79 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < str.length()) {
                if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'g') {
                    sb.append(str.charAt(0)); // Ejemplo simplificado del patrón
                    i += 3;
                } else {
                    sb.append(str.charAt(i));
                    i++;
                }
            }
            System.out.println("La nueva cadena es: " + str);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}