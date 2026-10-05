import java.util.Scanner;

public class Tarea05_ejercicio_24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Introduzca un número (0 para salir): ");
        num = entrada.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("El número es PAR.");
            } else {
                System.out.println("El número es IMPAR.");
            }
            System.out.print("Introduzca otro número (0 para salir): ");
            num = entrada.nextInt();
        }
        System.out.println("Programa finalizado.");
        entrada.close();
    }
}