import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_89 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            int sum = 0;
            String numStr = "";
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isDigit(c)) {
                    numStr += c;
                } else {
                    if (!numStr.isEmpty()) {
                        sum += Integer.parseInt(numStr);
                        numStr = "";
                    }
                }
            }
            if (!numStr.isEmpty()) {
                sum += Integer.parseInt(numStr);
            }
            System.out.println("La suma de los números en la cadena es: " + sum);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}