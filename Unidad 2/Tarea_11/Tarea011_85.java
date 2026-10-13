import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_85 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena principal: ");
            String str = reader.readLine();
            System.out.print("Ingrese la subcadena: ");
            String sub = reader.readLine();

            System.out.println("Las cadenas dadas son: " + str + " y " + sub);
            StringBuilder sb = new StringBuilder();
            int idx = str.indexOf(sub);
            while (idx != -1) {
                if (idx > 0) sb.append(str.charAt(idx - 1));
                if (idx + sub.length() < str.length()) sb.append(str.charAt(idx + sub.length()));
                idx = str.indexOf(sub, idx + 1);
            }
            System.out.println("La nueva cadena es: " + sb.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}