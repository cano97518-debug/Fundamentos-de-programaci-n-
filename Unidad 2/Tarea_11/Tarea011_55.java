import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_55 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            String res = removeDuplicates(str);
            System.out.println("La nueva cadena después de eliminar todos los duplicados adyacentes es:\n" + res);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String removeDuplicates(String s) {
        int n = s.length();
        if (n <= 1) return s;

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < n) {
            if (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                while (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                }
            } else {
                sb.append(s.charAt(i));
            }
            i++;
        }

        String result = sb.toString();
        if (result.length() != n) {
            return removeDuplicates(result);
        }
        return result;
    }
}