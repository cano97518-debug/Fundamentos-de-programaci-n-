import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_53 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();
            System.out.print("Ingrese el patrón con comodines (*, ?): ");
            String pattern = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            System.out.println("La cadena de patrón dada es: " + pattern);
            
            boolean match = matchRecursive(str, pattern, 0, 0);
            if (match) {
                System.out.println("El patrón dado coincide.");
            } else {
                System.out.println("El patrón dado NO coincide.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static boolean matchRecursive(String first, String second, int n, int m) {
        if (m == second.length()) return n == first.length();
        if (second.charAt(m) == '*') {
            if (m + 1 < second.length() && second.charAt(m + 1) == '*') {
                return matchRecursive(first, second, n, m + 1);
            }
            for (int i = n; i <= first.length(); i++) {
                if (matchRecursive(first, second, i, m + 1)) return true;
            }
            return false;
        }
        if (n < first.length() && (second.charAt(m) == '?' || first.charAt(n) == second.charAt(m))) {
            return matchRecursive(first, second, n + 1, m + 1);
        }
        return false;
    }
}