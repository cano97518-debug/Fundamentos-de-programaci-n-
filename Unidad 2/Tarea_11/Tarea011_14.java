import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la primera cadena: ");
        String str1 = reader.readLine();

        System.out.print("Introduce la segunda cadena: ");
        String str2 = reader.readLine();

        boolean result = str1.equalsIgnoreCase(str2);
        System.out.println("\"" + str1 + "\" es igual a \"" + str2 + "\"? " + result);
    }
}