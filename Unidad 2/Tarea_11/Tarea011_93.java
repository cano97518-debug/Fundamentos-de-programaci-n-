import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_93 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            String longest = "";
            int n = str.length();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    String sub = str.substring(i, j);
                    String rev = new StringBuilder(sub).reverse().toString();
                    if (str.endsWith(rev) && sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
            System.out.println("La subcadena más larga en la cadena es: " + longest);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}