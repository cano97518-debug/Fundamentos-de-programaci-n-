import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_26 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena: ");
        String str = reader.readLine();

        System.out.print("Introduce el prefijo a evaluar: ");
        String prefix = reader.readLine();

        boolean result = str.startsWith(prefix);
        System.out.println(str + " ¿Empieza con " + prefix + "? " + result);
    }
}