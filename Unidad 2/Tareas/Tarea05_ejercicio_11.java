import java.util.Scanner;

public class Tarea05_ejercicio_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Introduzca un número entre 0 y 9999: ");
        num = entrada.nextInt();

        if (num < 0 || num > 9999) {
            System.out.println("Error: El número está fuera del rango permitido.");
        } else if (num < 10) {
            System.out.println("Tiene 1 cifra.");
        } else if (num < 100) {
            System.out.println("Tiene 2 cifras.");
        } else if (num < 1000) {
            System.out.println("Tiene 3 cifras.");
        } else {
            System.out.println("Tiene 4 cifras.");
        }

        entrada.close();
    }
}