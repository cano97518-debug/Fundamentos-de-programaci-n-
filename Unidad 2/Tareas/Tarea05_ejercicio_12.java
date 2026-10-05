import java.util.Scanner;

public class Tarea05_ejercicio_12 {
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

            if (m != 0) {
                System.out.println("Al revés: " + u + c + d + m);
            } else if (c != 0) {
                System.out.println("Al revés: " + u + d + c);
            } else if (d != 0) {
                System.out.println("Al revés: " + u + d);
            } else {
                System.out.println("Al revés: " + u);
            }
        }

        entrada.close();
    }
}