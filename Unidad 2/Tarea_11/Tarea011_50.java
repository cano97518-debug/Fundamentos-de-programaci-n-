import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_50 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();
            System.out.println("La cadena proporcionada es: " + str);
            
            int n = str.length();
            int mul = fact(n);
            int rank = 1;
            int[] count = new int[256];

            for (int i = 0; i < n; i++) {
                count[str.charAt(i)]++;
            }
            for (int i = 0; i < 256; i++) {
                count[i] += (i == 0) ? 0 : count[i - 1];
            }

            for (int i = 0; i < n; i++) {
                mul /= n - i;
                rank += count[str.charAt(i) - 1] * mul;
                for (int j = str.charAt(i); j < 256; j++) {
                    count[j]--;
                }
            }
            System.out.println("El rango lexicográfico de la cadena dada es: " + rank);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int fact(int n) {
        return (n <= 1) ? 1 : n * fact(n - 1);
    }
}