import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_70 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("Las cadenas dadas son: " + str);
            boolean balanced = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'p') {
                    if (i > 0 && str.charAt(i - 1) == 'q') {
                        balanced = false;
                        break;
                    }
                    boolean foundQ = false;
                    for (int j = i + 1; j < str.length(); j++) {
                        if (str.charAt(j) == 'q') {
                            foundQ = true;
                            break;
                        }
                    }
                    if (!foundQ) {
                        balanced = false;
                        break;
                    }
                }
            }
            System.out.println("¿La cadena está equilibrada en pq? " + balanced);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}