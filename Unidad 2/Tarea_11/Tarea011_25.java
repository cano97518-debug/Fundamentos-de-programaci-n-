import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_25 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena original: ");
        String str = reader.readLine();

        System.out.print("Introduce la expresión regular o palabra a buscar: ");
        String regex = reader.readLine();

        System.out.print("Introduce el texto de reemplazo: ");
        String replacement = reader.readLine();

        String result = str.replaceAll(regex, replacement);
        System.out.println("Cadena original: " + str);
        System.out.println("Nueva cadena: " + result);
    }
}