import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Tarea011_51 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();
            System.out.println("La cadena proporcionada es: " + str);
            System.out.println("Los caracteres duplicados y sus recuentos son:");

            Map<Character, Integer> count = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                count.put(c, count.getOrDefault(c, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : count.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println("La letra " + entry.getKey() + " aparece " + entry.getValue() + " veces");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}