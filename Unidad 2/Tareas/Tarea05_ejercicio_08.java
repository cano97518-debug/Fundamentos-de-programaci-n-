import java.util.Scanner;

public class Tarea05_ejercicio_08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;

        System.out.print("Introduzca el primer número: ");
        n1 = entrada.nextDouble();
        System.out.print("Introduzca el segundo número: ");
        n2 = entrada.nextDouble();

        if (n1 >= n2) {
            System.out.println("Ordenados: " + n1 + ", " + n2);
        } else {
            System.out.println("Ordenados: " + n2 + ", " + n1);
        }

        entrada.close();
    }
}