import java.util.Scanner;

public class Tarea05_ejercicio_69 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] m = new int[4][4];
        int diagPrincipal = 0, diagSecundaria = 0;

        System.out.println("Ingrese datos para la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            diagPrincipal += m[i][i];
            diagSecundaria += m[i][3 - i];
        }

        System.out.println("\nSuma Diagonal Principal: " + diagPrincipal);
        System.out.println("Suma Diagonal Secundaria: " + diagSecundaria);
        entrada.close();
    }
}