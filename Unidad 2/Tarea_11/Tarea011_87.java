import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_87 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();
            System.out.print("Ingrese el carácter a comprobar: ");
            char c = reader.readLine().charAt(0);

            System.out.println("La cadena dada es: " + str);
            boolean happy = false;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    if ((i > 0 && str.charAt(i - 1) == c) || (i < str.length() - 1 && str.charAt(i + 1) == c)) {
                        happy = true;
                        break;
                    }
                }
            }
            System.out.println("¿Es " + c + " feliz en la cadena: " + (happy ? "verdadero?" : "falses?"));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}