import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_36 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cadena dada: ");
            String s = reader.readLine();
            System.out.print("Ingrese la primera parte: ");
            String s1 = reader.readLine();
            System.out.print("Ingrese la segunda parte: ");
            String s2 = reader.readLine();

            System.out.println("La cadena proporcionada es: " + s);
            System.out.println("Las cadenas entrelazadas son " + s1 + " y " + s2);
            boolean result = checkLength(s, s1, s2) && findShuffle(s, s1, s2);
            System.out.println("La cadena dada es intercalada: " + result);

        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }
    }

    static boolean checkLength(String s, String s1, String s2) {
        return s.length() == s1.length() + s2.length();
    }

    static boolean findShuffle(String s, String s1, String s2) {
        if (s.length() == 0) return true;
        if (s1.length() > 0 && s.charAt(0) == s1.charAt(0) && findShuffle(s.substring(1), s1.substring(1), s2)) {
            return true;
        }
        if (s2.length() > 0 && s.charAt(0) == s2.charAt(0) && findShuffle(s.substring(1), s1, s2.substring(1))) {
            return true;
        }
        return false;
    }
}