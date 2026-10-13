import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_84 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();
            System.out.print("Ingrese el número p: ");
            int p = Integer.parseInt(reader.readLine());

            System.out.println("La cadena dada es: " + str);
            System.out.println("Número de caracteres repetidos y repetición: " + p);
            StringBuilder sb = new StringBuilder();
            int idx = 0;
            for (int i = p; i > 0; i--) {
                sb.append(str.substring(0, i));
            }
            System.out.println("La nueva cadena es: " + sb.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}