import java.util.Scanner;

public class Tarea05_ejercicio_22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num, cuadrado;

        System.out.print("Introduzca un número (negativo para salir): ");
        num = entrada.nextDouble();

        while (num >= 0) {
            cuadrado = Math.pow(num, 2);
            System.out.println("El cuadrado de " + num + " es: " + cuadrado);

            System.out.print("Introduzca otro número (negativo para salir): ");
            num = entrada.nextDouble();
        }

        System.out.println("Programa finalizado.");
        entrada.close();
    }
}