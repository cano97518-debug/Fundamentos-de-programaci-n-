import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_69 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("Las cadenas dadas son: " + str);
            String res = "";
            int first = str.indexOf("toast");
            int last = str.lastIndexOf("toast");
            if (first != -1 && last != -1 && first != last) {
                res = str.substring(first + 5, last);
            }
            System.out.println("La nueva cadena es: " + res);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}