import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_63 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la primera cadena: ");
            String s1 = reader.readLine();
            System.out.print("Ingrese la segunda cadena: ");
            String s2 = reader.readLine();

            System.out.println("Las cadenas dadas son: " + s1 + " " + s2);
            boolean res = false;
            if (s1.length() >= 2 && s2.length() >= 2) {
                String prefix = s1.substring(0, 2);
                res = s2.endsWith(prefix);
            }
            System.out.println("Los dos primeros caracteres aparecen en el último es: " + (res ? "verdadero" : "falso"));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}