import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_68 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            StringBuilder sb = new StringBuilder();
            boolean[] remove = new boolean[str.length()];
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '#') {
                    remove[i] = true;
                    if (i > 0) remove[i - 1] = true;
                    if (i < str.length() - 1) remove[i + 1] = true;
                }
            }
            for (int i = 0; i < str.length(); i++) {
                if (!remove[i]) {
                    sb.append(str.charAt(i));
                }
            }
            System.out.println("La nueva cadena es: " + sb.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}