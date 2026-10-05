import java.util.Scanner;

public class Tarea05_ejercicio_49 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[12];
        int[] b = new int[12];
        int[] c = new int[24];

        System.out.println("Llenado Arreglo A (12 elementos):");
        for (int i = 0; i < 12; i++) a[i] = entrada.nextInt();

        System.out.println("Llenado Arreglo B (12 elementos):");
        for (int i = 0; i < 12; i++) b[i] = entrada.nextInt();

        int j = 0;
        for (int i = 0; i < 12; i += 3) {
            for (int k = 0; k < 3; k++) c[j++] = a[i + k];
            for (int k = 0; k < 3; k++) c[j++] = b[i + k];
        }

        System.out.println("\nArreglo C (mezclado de 3 en 3):");
        for (int i = 0; i < 24; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        entrada.close();
    }
}
