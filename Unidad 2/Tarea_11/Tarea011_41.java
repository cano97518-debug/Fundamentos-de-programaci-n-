import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Tarea011_41 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cadena dada: ");
            String str = reader.readLine();
            System.out.print("Ingrese la cadena de máscara: ");
            String mask = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            System.out.println("La cadena de máscara proporcionada es: " + mask);

            Set<Character> maskSet = new HashSet<>();
            for (int i = 0; i < mask.length(); i++) {
                maskSet.add(mask.charAt(i));
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (!maskSet.contains(str.charAt(i))) {
                    sb.append(str.charAt(i));
                }
            }

            System.out.println("\nLa nueva cadena es:\n" + sb.toString());

        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }
    }
}