import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_108 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la palabra u oración: ");
            String word = reader.readLine();

            boolean consecutive = false;
            for (int i = 0; i < word.length() - 1; i++) {
                if (word.charAt(i) == word.charAt(i + 1)) {
                    consecutive = true;
                    break;
                }
            }
            System.out.println("Palabra original: " + word);
            System.out.println("Si hay dos letras idénticas consecutivas en dicha cadena: " + (consecutive ? "verdadero" : "falso"));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}