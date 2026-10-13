import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_77 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la primera cadena: ");
            String s1 = reader.readLine();
            System.out.print("Ingrese la segunda cadena (separador): ");
            String s2 = reader.readLine();
            System.out.print("Ingrese el número de veces: ");
            int n = Integer.parseInt(reader.readLine());

            System.out.println("Las cadenas dadas son: " + s1 + " y " + s2);
            System.out.println("Número de veces que se repetirá: " + n);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(s1);
                if (i < n - 1) {
                    sb.append(s2);
                }
            }
            System.out.println("La nueva cadena es: " + sb.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}