import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena: ");
        String str = reader.readLine();

        System.out.print("Introduce el índice inicial: ");
        int start = Integer.parseInt(reader.readLine());

        System.out.print("Introduce el índice final: ");
        int end = Integer.parseInt(reader.readLine());

        int count = str.codePointCount(start, end);
        System.out.println("Cadena original: " + str);
        System.out.println("Número de puntos de código = " + count);
    }
}