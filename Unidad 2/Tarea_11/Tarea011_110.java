import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Tarea011_110 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("Cadena original: " + str);
            Map<Character, Integer> count = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isLetterOrDigit(c)) {
                    count.put(c, count.getOrDefault(c, 0) + 1);
                }
            }

            int duplicates = 0;
            for (int val : count.values()) {
                if (val > 2) {
                    duplicates++;
                }
            }
            System.out.println("Número de caracteres duplicados en dicha cadena (aparecen más de dos veces): " + duplicates);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}