import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_20 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena: ");
        String input = reader.readLine();

        String str1 = input;
        String str2 = new String(input);
        String str3 = str2.intern();

        System.out.println("¿str1 == str2? " + (str1 == str2));
        System.out.println("¿str1 == str3? " + (str1 == str3));
    }
}