import java.util.Scanner;

public class Tarea05_ejercicio_37 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("Introduzca un número (1 al 10): ");
        n = entrada.nextInt();

        System.out.println("Tabla del " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        entrada.close();
    }
}