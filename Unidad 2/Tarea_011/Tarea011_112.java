import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_112 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Introduzca la primera cadena:");
            String s1 = reader.readLine();
            System.out.println("Introduzca la segunda cadena:");
            String s2 = reader.readLine();

            boolean res = true;
            for (int i = 0; i < s2.length(); i++) {
                char c = s2.charAt(i);
                if (s1.indexOf(c) == -1) {
                    res = false;
                    break;
                }
            }
            System.out.println("Comprueba que la primera cadena contiene letras de la segunda cadena:");
            System.out.println(res ? "verdadero" : "falso");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}