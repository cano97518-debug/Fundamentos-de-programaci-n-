import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la primera cadena: ");
        String str1 = reader.readLine();

        System.out.print("Introduce la segunda cadena: ");
        String str2 = reader.readLine();

        boolean equals = str1.contentEquals(str2);
        System.out.println("Comparando " + str1 + " y " + str2 + ": " + equals);
    }
}