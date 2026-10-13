import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_60 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la primera cadena: ");
            String s1 = reader.readLine();
            System.out.print("Ingrese la segunda cadena: ");
            String s2 = reader.readLine();

            System.out.println("Las cadenas dadas son: " + s1 + " y " + s2);
            int len1 = s1.length();
            int len2 = s2.length();
            if (len1 > len2) {
                s1 = s1.substring(len1 - len2);
            } else if (len2 > len1) {
                s2 = s2.substring(len2 - len1);
            }
            System.out.println("La nueva cadena es: " + s1 + s2);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}