import java.util.Scanner;

public class Tarea05_ejercicio_74 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese dimensión de la matriz cuadrada (N): ");
        int n = entrada.nextInt();
        double[][] m = new double[n][n];
        boolean esVandermonde = true;

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            double alfa = m[i][1]; // Base de la fila
            for (int j = 0; j < n; j++) {
                if (Math.abs(m[i][j] - Math.pow(alfa, j)) > 0.0001) {
                    esVandermonde = false;
                    break;
                }
            }
        }

        if (esVandermonde) {
            System.out.println("\nLa matriz ES de Vandermonde.");
        } else {
            System.out.println("\nLa matriz NO es de Vandermonde.");
        }
        entrada.close();
    }
}

