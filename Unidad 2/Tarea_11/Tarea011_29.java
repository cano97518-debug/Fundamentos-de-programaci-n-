import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_29 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cadena de texto: ");
            String texto = reader.readLine();

            // Convierte toda la cadena a minúsculas
            String textoMinusculas = texto.toLowerCase();

            System.out.println("Cadena original: " + texto);
            System.out.println("Cadena en minúsculas: " + textoMinusculas);

        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }
    }
}