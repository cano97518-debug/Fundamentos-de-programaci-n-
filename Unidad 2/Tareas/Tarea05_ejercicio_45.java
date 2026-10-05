import java.util.Scanner;

public class Tarea05_ejercicio_45 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] valores = new double[5];

        // Llenado del arreglo
        System.out.println("Introduzca 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            valores[i] = entrada.nextDouble();
        }

        // Mostrar el arreglo en orden inverso (del índice 4 al 0)
        System.out.println("\nLos números en orden inverso son:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Posición [" + i + "]: " + valores[i]);
        }

        entrada.close();
    }
}