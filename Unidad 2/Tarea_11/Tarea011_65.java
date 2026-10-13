import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_65 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            String res = str;
            if (str.length() > 0 && str.charAt(0) == str.charAt(str.length() - 1)) {
                res = str.substring(1, str.length() - 1);
            }
            System.out.println("La nueva cadena es: " + res);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}