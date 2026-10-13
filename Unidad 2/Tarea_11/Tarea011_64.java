import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_64 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("Las cadenas dadas son: " + str);
            String res = str;
            if (str.length() >= 2) {
                String start = str.substring(0, 2);
                if (str.substring(str.length() - 2).equals(start)) {
                    res = str.substring(2);
                }
            }
            System.out.println("La nueva cadena es: " + res);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}