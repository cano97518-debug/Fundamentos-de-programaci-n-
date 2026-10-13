import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_73 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            int dotIndex = str.indexOf('.');
            boolean res = (dotIndex != -1 && str.substring(0, dotIndex).contains("abc"));
            System.out.println("¿Aparece 'abc' antes del punto? " + res);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}