import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_22 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena: ");
        String str = reader.readLine();

        int length = str.length();
        System.out.println("La longitud de la cadena '" + str + "' es: " + length);
    }
}