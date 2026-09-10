import java.util.Scanner;

public class ejercicio02_mc_scanner {
    public static void main(String[] args) {
        //declaracion de las variables
        int numero;
        int dm, um, c, d, u;
        Scanner entrada = new Scanner(System.in);
        
        // solicitud y captura del numero
        System.out.print("Introduzca un número entre 0 y 99.999: ");
        numero = entrada.nextInt();
        
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