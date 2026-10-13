import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Tarea011_49 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();
            System.out.println("Cadena: " + str);

            Map<Character, Integer> counts = new LinkedHashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                System.out.println("Lectura: " + c);
                counts.put(c, counts.getOrDefault(c, 0) + 1);

                char firstNonRepeating = '\0';
                for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
                    if (entry.getValue() == 1) {
                        firstNonRepeating = entry.getKey();
                        break;
                    }
                }
                System.out.println("El primer carácter que no se repite hasta ahora es: " + firstNonRepeating);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}