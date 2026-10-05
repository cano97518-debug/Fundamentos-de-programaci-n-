import java.util.Scanner;

public class Tarea05_ejercicio_27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num, suma = 0;

        System.out.print("Introduzca un número (0 para salir): ");
        num = entrada.nextDouble();

        while (num != 0) {
            suma += num;
            System.out.print("Introduzca otro número (0 para salir): ");
            num = entrada.nextDouble();
        }
        System.out.println("La suma total es: " + suma);
        entrada.close();
    }
}