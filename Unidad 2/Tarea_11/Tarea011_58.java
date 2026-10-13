import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_58 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();
            System.out.print("Ingrese la cadena de longitud 2 para verificar el final: ");
            String suffix = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            boolean ends = str.endsWith(suffix);
            System.out.println("La cadena que contiene " + suffix + " al final: " + ends);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}