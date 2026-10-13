import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la primera cadena: ");
        String str1 = reader.readLine();

        System.out.print("Introduce la segunda cadena: ");
        String str2 = reader.readLine();

        int result = str1.compareTo(str2);
        System.out.println("Cadena 1: " + str1);
        System.out.println("Cadena 2: " + str2);

        if (result < 0) {
            System.out.println("\"" + str1 + "\" es menor que \"" + str2 + "\".");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" es mayor que \"" + str2 + "\".");
        } else {
            System.out.println("\"" + str1 + "\" es igual a \"" + str2 + "\".");
        }
    }
}