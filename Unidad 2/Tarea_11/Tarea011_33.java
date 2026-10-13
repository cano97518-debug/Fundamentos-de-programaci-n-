import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tarea011_33 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la primera cadena: ");
            String s1 = reader.readLine();
            System.out.print("Ingrese la segunda cadena: ");
            String s2 = reader.readLine();

            System.out.println("Las cadenas dadas son: " + s1 + " " + s2);
            System.out.println("Las cadenas entrelazadas son:");
            List<String> res = new ArrayList<>();
            interleave(s1, s2, "", res);
            for (String s : res) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }
    }

    private static void interleave(String s1, String s2, String path, List<String> res) {
        if (s1.length() == 0 && s2.length() == 0) {
            res.add(path);
            return;
        }
        if (s1.length() > 0) {
            interleave(s1.substring(1), s2, path + s1.charAt(0), res);
        }
        if (s2.length() > 0) {
            interleave(s1, s2.substring(1), path + s2.charAt(0), res);
        }
    }
}