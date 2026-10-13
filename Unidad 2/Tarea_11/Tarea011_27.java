import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_27 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cadena original: ");
            String cadenaOriginal = reader.readLine();

            System.out.print("Ingrese el índice inicial: ");
            int inicio = Integer.parseInt(reader.readLine());

            System.out.print("Ingrese el índice final: ");
            int fin = Integer.parseInt(reader.readLine());

            // Se obtiene la subcadena usando substring()
            String subcadena = cadenaOriginal.substring(inicio, fin);

            System.out.println("\nviejo = " + cadenaOriginal);
            System.out.println("nuevo = " + subcadena);

        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese números válidos para los índices.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Los índices ingresados están fuera del rango de la cadena.");
        }
    }
}