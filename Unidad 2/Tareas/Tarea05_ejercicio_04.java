import java.util.Scanner;

public class Tarea05_ejercicio_04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;

        System.out.print("Introduzca el primer número: ");
        n1 = entrada.nextDouble();

        System.out.print("Introduzca el segundo número: ");
        n2 = entrada.nextDouble();

        if (n1 == n2) {
            System.out.println("Los dos números son iguales.");
        } else {
            System.out.println("Los números son diferentes.");
        }

        entrada.close();
    }
}