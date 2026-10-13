import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la primera cadena: ");
        String str1 = reader.readLine();

        System.out.print("Introduce la segunda cadena: ");
        String str2 = reader.readLine();

        String concatenated = str1.concat(str2);
        System.out.println("Cadena 1: " + str1);
        System.out.println("Cadena 2: " + str2);
        System.out.println("La cadena concatenada: " + concatenated);
    }
}