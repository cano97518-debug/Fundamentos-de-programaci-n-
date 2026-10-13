import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_62 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            boolean res = (str.length() >= 4 && (str.substring(0, 4).equals("good") || (str.length() >= 5 && str.substring(1, 5).equals("good"))));
            System.out.println("La palabra 'bueno' que aparece en la cadena es: " + res);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}