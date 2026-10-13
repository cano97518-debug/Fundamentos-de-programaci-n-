import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_101 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            boolean res = true;
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    res = false;
                    break;
                }
            }
            System.out.println(res ? "verdadero" : "falso");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}