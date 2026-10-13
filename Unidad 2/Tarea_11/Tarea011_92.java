import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_92 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena principal: ");
            String str = reader.readLine();
            System.out.print("Ingrese la subcadena a eliminar: ");
            String remove = reader.readLine();

            System.out.println("La cadena principal es: " + str);
            System.out.println("La cuerda extraíble es: " + remove);
            String res = str.replace(remove, "");
            System.out.println("La nueva cadena es: " + res);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}