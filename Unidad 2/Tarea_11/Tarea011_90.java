import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_90 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            int countThe = 0, countIs = 0;
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 3).equalsIgnoreCase("the")) countThe++;
                if (str.substring(i, i + 2).equalsIgnoreCase("is")) countIs++;
            }
            boolean res = (countThe == countIs);
            System.out.println("¿La apariencia de 'the' y 'is' es igual? " + (res ? "verdadero" : "falso"));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}