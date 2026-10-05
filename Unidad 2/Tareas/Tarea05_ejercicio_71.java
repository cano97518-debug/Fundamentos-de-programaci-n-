import java.util.Scanner;

public class Tarea05_ejercicio_71 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] m = new int[4][4];

        System.out.println("Ingrese matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = entrada.nextInt();
            }
        }

        System.out.print("Ingrese primera fila a intercambiar (0-3): ");
        int f1 = entrada.nextInt();
        System.out.print("Ingrese segunda fila a intercambiar (0-3): ");
        int f2 = entrada.nextInt();

        for (int j = 0; j < 4; j++) {
            int aux = m[f1][j];
            m[f1][j] = m[f2][j];
            m[f2][j] = aux;
        }

        System.out.println("\nMatriz con filas intercambiadas:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        entrada.close();
    }
}