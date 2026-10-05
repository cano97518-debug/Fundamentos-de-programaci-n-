import java.util.Scanner;

public class Tarea05_ejercicio_73 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] m = new double[3][3];
        int pos = 0, neg = 0, ceros = 0;

        System.out.println("Ingrese matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = entrada.nextDouble();
                if (m[i][j] > 0) pos++;
                else if (m[i][j] < 0) neg++;
                else ceros++;
            }
        }

        System.out.println("\nResultados del Análisis:");
        System.out.println("Cantidad de Positivos: " + pos);
        System.out.println("Cantidad de Negativos: " + neg);
        System.out.println("Cantidad de Ceros: " + ceros);
        entrada.close();
    }
}