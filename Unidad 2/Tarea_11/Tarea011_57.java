import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_57 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            String res = "";
            if (str.length() < 2) {
                res = str;
            } else {
                char[] chars = str.toCharArray();
                char temp = chars[chars.length - 1];
                chars[chars.length - 1] = chars[chars.length - 2];
                chars[chars.length - 2] = temp;
                res = new String(chars);
            }
            System.out.println("La cadena después del intercambio de los dos últimos caracteres es: " + res);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}