import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_42 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la lista de cadenas separadas por espacios: ");
            String line = reader.readLine();
            System.out.print("Ingrese la palabra dada: ");
            String word = reader.readLine();

            String[] wordsArray = line.split("\\s+");

            System.out.print("Las cadenas dadas son: ");
            for(String w : wordsArray) {
                System.out.print(w + " ");
            }
            System.out.println();
            System.out.println("La palabra dada es: " + word);
            System.out.println("Las cadenas que contienen todas las letras de la palabra dada son:");

            for (String w : wordsArray) {
                if (containsAllChars(w, word)) {
                    System.out.println(w);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }
    }

    static boolean containsAllChars(String target, String reference) {
        for (int i = 0; i < reference.length(); i++) {
            char c = reference.charAt(i);
            if (target.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}