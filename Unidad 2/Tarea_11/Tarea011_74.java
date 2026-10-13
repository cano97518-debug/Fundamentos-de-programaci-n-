import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_74 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();
            System.out.print("Ingrese la longitud del prefijo n: ");
            int n = Integer.parseInt(reader.readLine());

            System.out.println("Las cadenas dadas son: " + str);
            System.out.println("La longitud de la cadena de prefijo es: " + n);
            boolean res = false;
            if (str.length() >= n) {
                String prefix = str.substring(0, n);
                String rest = str.substring(n);
                res = rest.contains(prefix);
            }
            System.out.println("¿Aparece en alguna otra parte de la cadena? " + res);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}