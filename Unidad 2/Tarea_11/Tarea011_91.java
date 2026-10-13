import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_91 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese el texto: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            String[] words = str.split("\\s+");
            int count = 0;
            for (String w : words) {
                if (!w.isEmpty()) {
                    char last = Character.toLowerCase(w.charAt(w.length() - 1));
                    if (last == 'm' || last == 'n') {
                        count++;
                    }
                }
            }
            System.out.println("El número de palabras que terminan en m o n es: " + count);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}