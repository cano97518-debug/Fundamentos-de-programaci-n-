import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_78 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();
            System.out.print("Ingrese el número n de caracteres y veces: ");
            int n = Integer.parseInt(reader.readLine());

            System.out.println("La cadena dada es: " + str);
            String suffix = str.substring(str.length() - n);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(suffix);
            }
            System.out.println("La nueva cadena después de la repetición: " + sb.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}