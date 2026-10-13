import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena: ");
        String str = reader.readLine();

        System.out.print("Introduce la posición (índice) a consultar: ");
        int index = Integer.parseInt(reader.readLine());

        int unicodePoint = str.codePointAt(index);
        System.out.println("Carácter (punto Unicode) = " + unicodePoint);
    }
}