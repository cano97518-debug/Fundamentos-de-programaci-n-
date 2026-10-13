import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_106 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena original: ");
            String str = reader.readLine();
            System.out.print("Ingrese el número de veces: ");
            int n = Integer.parseInt(reader.readLine());

            System.out.println("Cadena original: " + str);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(str);
            }
            System.out.println("Después de repetir " + n + " veces: " + sb.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}