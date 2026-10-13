import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_40 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();
            System.out.print("Ingrese el número de partes (n): ");
            int n = Integer.parseInt(reader.readLine());

            System.out.println("La cadena dada es: " + str);
            int len = str.length();
            if (len % n != 0) {
                System.out.println("La cadena no se puede dividir en " + n + " partes iguales.");
            } else {
                int partLength = len / n;
                System.out.println("La cuerda se dividió en " + n + " partes y son:");
                for (int i = 0; i < len; i += partLength) {
                    System.out.println(str.substring(i, i + partLength));
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido.");
        }
    }
}