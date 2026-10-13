import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Tarea011_34 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            char res = getSecondMostFreq(str);
            if (res != '\0') {
                System.out.println("El segundo carácter más frecuente en la cadena es: " + res);
            } else {
                System.out.println("No existe segundo carácter más frecuente.");
            }

        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }
    }

    static char getSecondMostFreq(String str) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            count.put(str.charAt(i), count.getOrDefault(str.charAt(i), 0) + 1);
        }

        int first = 0, second = 0;
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            int val = entry.getValue();
            if (val > first) {
                second = first;
                first = val;
            } else if (val > second && val != first) {
                second = val;
            }
        }

        char res = '\0';
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == second) {
                res = entry.getKey();
                break;
            }
        }
        return res;
    }
}