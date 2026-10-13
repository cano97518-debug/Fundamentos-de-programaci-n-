import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_52 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la primera cadena: ");
            String s1 = reader.readLine();
            System.out.print("Ingrese la segunda cadena: ");
            String s2 = reader.readLine();

            System.out.println("Las cadenas dadas son: " + s1 + " y " + s2);
            String concat = s1 + s1;
            System.out.println("La concatenación de la primera cadena dos veces es: " + concat);
            boolean isRotation = (s1.length() == s2.length()) && (concat.contains(s2));
            System.out.println("La segunda cadena " + s2 + " existe en la nueva cadena: " + concat.contains(s2));
            System.out.println("Las cuerdas son rotaciones unas de otras: " + isRotation);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}