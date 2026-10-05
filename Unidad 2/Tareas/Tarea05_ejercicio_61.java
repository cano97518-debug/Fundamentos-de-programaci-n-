import java.util.Scanner;

public class Tarea05_ejercicio_61 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        boolean simetrica = true;

        System.out.println("Ingrese los elementos de una matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        if (simetrica) {
            System.out.println("\nLa matriz es SIMÉTRICA.");
        } else {
            System.out.println("\nLa matriz NO es simétrica.");
        }
        entrada.close();
    }
}