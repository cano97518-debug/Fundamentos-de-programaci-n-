import java.util.Scanner;

public class Tarea05_ejercicio_64 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[10][10];
        int[] sumFilas = new int[10];
        int[] sumCol = new int[10];

        System.out.println("Ingrese los valores para una matriz de 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
                sumFilas[i] += matriz[i][j];
                sumCol[j] += matriz[i][j];
            }
        }

        System.out.println("\n--- SUMA POR FILAS ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Suma Fila " + i + ": " + sumFilas[i]);
        }

        System.out.println("\n--- SUMA POR COLUMNAS ---");
        for (int j = 0; j < 10; j++) {
            System.out.println("Suma Columna " + j + ": " + sumCol[j]);
        }
        entrada.close();
    }
}