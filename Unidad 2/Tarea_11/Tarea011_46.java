import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_46 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena proporcionada es: " + str);
            String[] words = str.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                sb.append(new StringBuilder(words[i]).reverse().toString());
                if (i < words.length - 1) {
                    sb.append(" ");
                }
            }
            System.out.println("La cadena invertida palabra por palabra es:\n" + sb.toString());

        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }
    }
}