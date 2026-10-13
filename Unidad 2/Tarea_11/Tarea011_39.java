import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_39 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            char result = '\0';
            for (int i = 0; i < str.length(); i++) {
                boolean unique = true;
                for (int j = 0; j < str.length(); j++) {
                    if (i != j && str.charAt(i) == str.charAt(j)) {
                        unique = false;
                        break;
                    }
                }
                if (unique) {
                    result = str.charAt(i);
                    break;
                }
            }
            System.out.println("El primer carácter no repetido en String es: " + result);

        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }
    }
}