import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_48 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();
            System.out.println("La cadena dada es: " + str);
            
            int n = str.length();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < n) {
                if (str.charAt(i) == 'b') {
                    i++;
                } else if (i + 1 < n && str.charAt(i) == 'a' && str.charAt(i + 1) == 'c') {
                    i += 2;
                } else {
                    sb.append(str.charAt(i));
                    i++;
                }
            }
            System.out.println("Después de eliminar la nueva cadena es: " + sb.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}