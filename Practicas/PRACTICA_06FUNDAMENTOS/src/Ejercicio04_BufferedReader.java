import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio04_BufferedReader {
    public static void main(String[] args) throws IOException {
        int num, dm, um, c, d, u;
        String salida;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num = Integer.parseInt(entrada.readLine());

        u = num % 10;
        num = num / 10;

        d = num % 10;
        num = num / 10;

        c = num % 10;
        num = num / 10;

        um = num % 10;
        num = num / 10;

        dm = num;

        salida = String.valueOf(u) + " " + String.valueOf(d) + " " + String.valueOf(c);
        salida = salida + " " + String.valueOf(um) + " " + String.valueOf(dm);

        num = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;

        System.out.println(salida);
        System.out.println(num);
    }
}