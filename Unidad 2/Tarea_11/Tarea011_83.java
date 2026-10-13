import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_83 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la primera cadena: ");
            String s1 = reader.readLine();
            System.out.print("Ingrese la segunda cadena: ");
            String s2 = reader.readLine();

            System.out.println("Las cadenas dadas son: " + s1 + " y " + s2);
            StringBuilder sb = new StringBuilder();
            int max = Math.max(s1.length(), s2.length());
            for (int i = 0; i < max; i++) {
                if (i < s1.length()) sb.append(s1.charAt(i));
                if (i < s2.length()) sb.append(s2.charAt(i));
            }
            System.out.println("La nueva cadena es: " + sb.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}