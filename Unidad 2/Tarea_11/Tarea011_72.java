import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_72 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            boolean res = false;
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'p' && str.charAt(i + 2) == 'p') {
                    res = true;
                    break;
                }
            }
            System.out.println("¿Aparece p?p en la cadena dada? " + res);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}