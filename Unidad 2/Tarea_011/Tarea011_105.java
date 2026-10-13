import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_105 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la subcadena: ");
            String sub = reader.readLine();
            System.out.print("Ingrese la cadena principal: ");
            String str = reader.readLine();

            int count = 0;
            int idx = str.indexOf(sub);
            while (idx != -1) {
                count++;
                idx = str.indexOf(sub, idx + 1);
            }
            System.out.println("'" + sub + "' ha ocurrido " + count + " veces en '" + str + "'");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}