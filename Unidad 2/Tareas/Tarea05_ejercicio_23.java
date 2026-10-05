import java.util.Scanner;

public class Tarea05_ejercicio_23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num;

        System.out.print("Introduzca un número (0 para salir): ");
        num = entrada.nextDouble();

        while (num != 0) {
            if (num > 0) {
                System.out.println("El número es POSITIVO.");
            } else {
                System.out.println("El número es NEGATIVO.");
            }

            System.out.print("Introduzca otro número (0 para salir): ");
            num = entrada.nextDouble();
        }

        System.out.println("Programa finalizado.");
        entrada.close();
    }
}