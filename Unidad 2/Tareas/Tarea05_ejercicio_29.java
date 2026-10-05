import java.util.Scanner;

public class Tarea05_ejercicio_29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("Introduzca el valor de N: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        entrada.close();
    }
}