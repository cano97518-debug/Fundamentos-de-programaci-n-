import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tarea011_38 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena proporcionada es: " + str);
            StringBuilder sb = new StringBuilder();
            Set<Character> set = new LinkedHashSet<>();
            for (int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i));
            }
            for (Character c : set) {
                sb.append(c);
            }
            System.out.println("Tras eliminar los caracteres duplicados, la nueva cadena es: " + sb.toString());

        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }
    }
}