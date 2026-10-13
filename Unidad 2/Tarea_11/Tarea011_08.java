import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena original: ");
        String str = reader.readLine();

        System.out.print("Introduce la secuencia a buscar: ");
        String seq = reader.readLine();

        boolean contains = str.contains(seq);
        System.out.println("Cadena original: " + str);
        System.out.println("Secuencia especificada de valores de caracteres: " + seq);
        System.out.println(contains);
    }
}