import java.util.Scanner;

public class Tarea05_ejercicio_70 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] m = new int[3][4];

        System.out.println("Ingrese matriz de 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = entrada.nextInt();
            }
        }

        int mayor = m[0][0], fMayor = 0, cMayor = 0;
        int menor = m[0][0], fMenor = 0, cMenor = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (m[i][j] > mayor) {
                    mayor = m[i][j];
                    fMayor = i; cMayor = j;
                }
                if (m[i][j] < menor) {
                    menor = m[i][j];
                    fMenor = i; cMenor = j;
                }
            }
        }

        System.out.println("\nMayor: " + mayor + " en posición [" + fMayor + "][" + cMayor + "]");
        System.out.println("Menor: " + menor + " en posición [" + fMenor + "][" + cMenor + "]");
        entrada.close();
    }
}