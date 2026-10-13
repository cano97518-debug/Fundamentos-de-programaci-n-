import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_24 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena original: ");
        String str = reader.readLine();

        System.out.print("Introduce el carácter a buscar: ");
        char oldChar = reader.readLine().charAt(0);

        System.out.print("Introduce el nuevo carácter: ");
        char newChar = reader.readLine().charAt(0);

        String result = str.replace(oldChar, newChar);
        System.out.println("Cadena original: " + str);
        System.out.println("Nueva cadena: " + result);
    }
}