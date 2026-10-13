import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_95 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena proporcionada es: " + str);
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isDigit(c)) {
                    sum += Character.getNumericValue(c);
                }
            }
            System.out.println("La suma de los dígitos de la cadena es: " + sum);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}