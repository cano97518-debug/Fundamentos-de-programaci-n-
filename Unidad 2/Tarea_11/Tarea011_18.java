import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_18 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena: ");
        String str = reader.readLine();

        int hash = str.hashCode();
        System.out.println("El hash para " + str + " es " + hash + ".");
    }
}