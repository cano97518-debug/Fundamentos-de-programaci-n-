import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_100 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Cadena original:");
            String str = reader.readLine();
            System.out.print("Ingrese la subcadena a buscar: ");
            String sub = reader.readLine();

            boolean res = str.contains(sub);
            System.out.println("¿Aparece la palabra \"" + sub + "\" en dicho texto?");
            System.out.println(res ? "verdadero" : "falso");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}