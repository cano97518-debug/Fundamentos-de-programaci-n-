import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_75 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena principal: ");
            String str = reader.readLine();
            System.out.print("Ingrese la subcadena: ");
            String sub = reader.readLine();

            System.out.println("La cadena proporcionada es: " + str);
            boolean res = false;
            int idx = str.indexOf(sub);
            if (idx != -1) {
                int left = idx;
                int right = str.length() - (idx + sub.length());
                if (Math.abs(left - right) <= 1) {
                    res = true;
                }
            }
            System.out.println("¿Aparece en el medio? " + res);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}