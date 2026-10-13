import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Tarea011_104 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese los colores separados por comas: ");
            String line = reader.readLine();
            String[] colors = line.split(",\\s*");

            System.out.println("Colores originales sin clasificar: " + Arrays.toString(colors));

            String[] desc = colors.clone();
            Arrays.sort(desc, (a, b) -> Integer.compare(b.length(), a.length()));
            System.out.println("Color ordenado (en orden descendente): " + Arrays.toString(desc));

            String[] asc = colors.clone();
            Arrays.sort(asc, Comparator.comparingInt(String::length));
            System.out.println("Color ordenado (orden ascendente): " + Arrays.toString(asc));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}