import java.util.Scanner;

public class Tarea05_ejercicio_67 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese número de filas (N): ");
        int n = entrada.nextInt();
        System.out.print("Ingrese número de columnas (M): ");
        int m = entrada.nextInt();

        int[][] marco = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }

        System.out.println("\nMatriz Marco Dinámica (" + n + "x" + m + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }
        entrada.close();
    }
}