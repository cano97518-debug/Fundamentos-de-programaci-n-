import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_31 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese una cadena de texto: ");
            String texto = reader.readLine();

            String nuevaCadena = texto.trim();

            System.out.println("Cadena original: " + texto);
            System.out.println("Nueva cadena: " + nuevaCadena);

        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }
    }
}