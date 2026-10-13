import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena: ");
        String str = reader.readLine();

        System.out.print("Introduce la subcadena final: ");
        String suffix = reader.readLine();

        boolean result = str.endsWith(suffix);
        System.out.println("\"" + str + "\" termina con \"" + suffix + "\"? " + result);
    }
}