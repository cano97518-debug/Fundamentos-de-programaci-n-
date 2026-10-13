import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_61 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();
            System.out.print("Ingrese el número n: ");
            int n = Integer.parseInt(reader.readLine());

            System.out.println("La cadena dada es: " + str);
            System.out.println("El número dado es: " + n);
            String res = "";
            if (n > 0 && str.length() >= n) {
                res = str.substring(0, n) + str.substring(str.length() - n);
            }
            System.out.println("La nueva cadena es: " + res);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}