import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_59 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("Las cadenas dadas son: " + str);
            String color = "";
            if (str.startsWith("rojo")) {
                color = "rojo";
            } else if (str.startsWith("negro")) {
                color = "negro";
            }
            System.out.println("La cadena comienza con el color: " + color);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}