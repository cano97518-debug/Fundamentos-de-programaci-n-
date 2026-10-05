import java.util.Scanner;

public class Tarea05_ejercicio_28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num, suma = 0;
        int contador = 0;

        System.out.print("Introduzca un número (negativo para terminar): ");
        num = entrada.nextDouble();

        while (num >= 0) {
            suma += num;
            contador++;
            System.out.print("Introduzca otro número (negativo para terminar): ");
            num = entrada.nextDouble();
        }

        if (contador > 0) {
            System.out.println("La media es: " + (suma / contador));
        } else {
            System.out.println("No se introdujeron números válidos.");
        }
        entrada.close();
    }
}