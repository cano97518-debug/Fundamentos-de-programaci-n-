import java.util.Scanner;

public class Tarea05_ejercicio_25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, contador = 0;

        System.out.print("Introduzca un número (negativo para salir): ");
        num = entrada.nextInt();

        while (num >= 0) {
            contador++;
            System.out.print("Introduzca otro número (negativo para salir): ");
            num = entrada.nextInt();
        }
        System.out.println("Se han introducido " + contador + " números.");
        entrada.close();
    }
}