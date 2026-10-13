import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Tarea011_17 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena: ");
        String str = reader.readLine();

        char[] charArray = str.toCharArray();
        System.out.println("El array de caracteres es igual a \"" + Arrays.toString(charArray) + "\"");
    }
}