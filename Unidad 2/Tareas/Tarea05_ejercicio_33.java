import java.util.Scanner;

public class Tarea05_ejercicio_33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        long factorial = 1;

        System.out.print("Introduzca un número entero: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
        entrada.close();
    }
}