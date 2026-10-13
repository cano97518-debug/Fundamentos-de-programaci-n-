import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_109 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            String[] words = str.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() % 2 != 0) {
                    sb.append(new StringBuilder(words[i]).reverse().toString());
                } else {
                    sb.append(words[i]);
                }
                if (i < words.length - 1) {
                    sb.append(" ");
                }
            }
            System.out.println("Resultado: " + sb.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}