import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_81 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena: ");
            String str = reader.readLine();

            System.out.println("La cadena dada es: " + str);
            int red = 0, blue = 0;
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 3).equals("red")) red++;
            }
            for (int i = 0; i < str.length() - 3; i++) {
                if (str.substring(i, i + 4).equals("blue")) blue++;
            }
            boolean res = (red == blue);
            System.out.println("La apariencia del rojo y el azul es la misma: " + (res ? "verdadero" : "falso"));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}