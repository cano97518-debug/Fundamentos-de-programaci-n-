import java.util.Scanner;

public class Tarea05_ejercicio_05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num;

        System.out.print("Introduzca un número: ");
        num = entrada.nextDouble();

        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        entrada.close();
    }
}


