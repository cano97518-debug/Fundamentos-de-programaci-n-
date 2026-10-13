import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena: ");
        String str = reader.readLine();

        System.out.print("Introduce la posición (índice) de referencia: ");
        int index = Integer.parseInt(reader.readLine());

        int unicodePoint = str.codePointBefore(index);
        System.out.println("Carácter (punto Unicode) = " + unicodePoint);
    }
}