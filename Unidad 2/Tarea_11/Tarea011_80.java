import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_80 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            boolean res = false;
            for (int i = 1; i < str.length() - 1; i++) {
                if (str.charAt(i) == '#' && str.charAt(i - 1) == str.charAt(i + 1)) {
                    res = true;
                    break;
                }
            }
            System.out.println("El carácter anterior y posterior son iguales: " + (res ? "verdadero" : "falso"));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}