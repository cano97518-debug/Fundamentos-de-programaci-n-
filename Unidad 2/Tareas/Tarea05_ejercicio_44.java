import java.util.Scanner;

public class Tarea05_ejercicio_44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[5];

        // Llenado del arreglo
        System.out.println("Introduzca 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();
        }

        // Mostrar el arreglo en el mismo orden
        System.out.println("\nLos números ingresados son:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posición [" + i + "]: " + numeros[i]);
        }

        entrada.close();
    }
}