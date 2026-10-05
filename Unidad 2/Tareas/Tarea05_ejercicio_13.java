import java.util.Scanner;

public class Tarea05_ejercicio_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, u, d, c, m;

        System.out.print("Introduzca un número entre 0 y 9999: ");
        num = entrada.nextInt();

        if (num < 0 || num > 9999) {
            System.out.println("Error: Número fuera de rango.");
        } else {
            u = num % 10;
            num = num / 10;
            d = num % 10;
            num = num / 10;
            c = num % 10;
            m = num / 10;

            if (m != 0 && m == u && c == d) {
                System.out.println("Es capicúa.");
            } else if (m == 0 && c != 0 && c == u) {
                System.out.println("Es capicúa.");
            } else if (m == 0 && c == 0 && d != 0 && d == u) {
                System.out.println("Es capicúa.");
            } else if (m == 0 && c == 0 && d == 0) {
                System.out.println("Es capicúa.");
            } else {
                System.out.println("NO es capicúa.");
            }
        }

        entrada.close();
    }
}