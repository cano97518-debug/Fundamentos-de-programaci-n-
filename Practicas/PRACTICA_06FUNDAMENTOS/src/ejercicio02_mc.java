import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio02_mc {
    public static void main(String[] args) throws IOException {
        // declaracion de las variables
        int numero;
        int dm, um, c, d, u;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        // solicitud y captura del numero
        System.out.print("Introduzca un número entre 0 y 99.999: ");
        numero = Integer.parseInt(entrada.readLine());
        
        dm = (int) numero / 10000;
        numero = numero % 10000;
        um = (int) numero / 1000;
        numero = numero % 1000;
        c = (int) numero / 100;
        numero = numero % 100;
        d = (int) numero / 10;
        numero = numero % 10;
        u = numero;
        
        // lo imprimimos al revés:
        System.out.println(u + " " + d + " " + c + " " + um + " " + dm);
        
        // otra forma de hacerlo es
        numero = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;
        System.out.println(numero);
    }
}