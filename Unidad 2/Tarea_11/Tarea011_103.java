import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_103 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena original: ");
            String str = reader.readLine();
            System.out.print("Ingrese la segunda cadena (caracteres a eliminar): ");
            String remove = reader.readLine();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (remove.indexOf(c) == -1) {
                    sb.append(c);
                }
            }
            System.out.println("\nSegunda cadena:\n" + sb.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}