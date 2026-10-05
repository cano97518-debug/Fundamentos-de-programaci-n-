import java.util.Scanner;

public class Tarea05_ejercicio_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;

        System.out.print("Primer número: ");
        a = entrada.nextInt();
        System.out.print("Segundo número: ");
        b = entrada.nextInt();
        System.out.print("Tercer número: ");
        c = entrada.nextInt();

        if (a >= b && b >= c) {
            System.out.println("Ordenados: " + a + ", " + b + ", " + c);
        } else if (a >= c && c >= b) {
            System.out.println("Ordenados: " + a + ", " + c + ", " + b);
        } else if (b >= a && a >= c) {
            System.out.println("Ordenados: " + b + ", " + a + ", " + c);
        } else if (b >= c && c >= a) {
            System.out.println("Ordenados: " + b + ", " + c + ", " + a);
        } else if (c >= a && a >= b) {
            System.out.println("Ordenados: " + c + ", " + a + ", " + b);
        } else {
            System.out.println("Ordenados: " + c + ", " + b + ", " + a);
        }

        entrada.close();
    }
}