import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_76 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena proporcionada es: " + str);
            int count = 0;
            for (int i = 0; i < str.length() - 3; i++) {
                if (str.charAt(i) == 'l' && str.charAt(i + 1) == 'i' && str.charAt(i + 3) == 'e' && str.charAt(i + 2) != 'f') {
                    count++;
                }
            }
            System.out.println("La subcadena life o li?e aparece número de veces: " + count);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}