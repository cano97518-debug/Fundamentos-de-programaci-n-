import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_71 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la primera cadena: ");
            String s1 = reader.readLine();
            System.out.print("Ingrese la segunda cadena: ");
            String s2 = reader.readLine();

            System.out.println("Las cadenas dadas son: " + s1 + " y " + s2);
            boolean res = s1.toLowerCase().endsWith(s2.toLowerCase()) || s2.toLowerCase().endsWith(s1.toLowerCase());
            System.out.println("¿Aparece una cadena al final de otra? " + res);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}