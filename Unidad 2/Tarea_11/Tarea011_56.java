import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_56 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la primera cadena: ");
            String s1 = reader.readLine();
            System.out.print("Ingrese la segunda cadena: ");
            String s2 = reader.readLine();

            System.out.println("Las cadenas dadas son: " + s1 + " y " + s2);
            StringBuilder sb = new StringBuilder();
            if (!s1.isEmpty() && !s2.isEmpty()) {
                sb.append(s1);
                if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
                    sb.append(s2.substring(1));
                } else {
                    sb.append(s2);
                }
            } else {
                sb.append(s1).append(s2);
            }
            System.out.println("La cadena después de la concatenación es: " + sb.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}