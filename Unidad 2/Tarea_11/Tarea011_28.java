import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_28 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese una cadena de texto: ");
            String texto = reader.readLine();

            // Convierte la cadena en un array de caracteres
            char[] arregloCaracteres = texto.toCharArray();

            System.out.print("Resultado: ");
            System.out.println(arregloCaracteres);

        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }
    }
}