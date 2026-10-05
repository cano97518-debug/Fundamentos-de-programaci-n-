import java.util.Scanner;

public class Tarea05_ejercicio_01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c;
        double x1, x2, d;

        System.out.print("Introduzca primer coeficiente (a): ");
        a = entrada.nextDouble();

        System.out.print("Introduzca segundo coeficiente (b): ");
        b = entrada.nextDouble();

        System.out.print("Introduzca tercer coeficiente (c): ");
        c = entrada.nextDouble();

        if (a == 0) {
            System.out.println("Error: El coeficiente 'a' debe ser diferente de cero.");
        } else {
            d = (b * b) - (4 * a * c);

            if (d < 0) {
                System.out.println("No existen soluciones reales.");
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("Solución 1: " + x1);
                System.out.println("Solución 2: " + x2);
            }
        }

        entrada.close();
    }
}



