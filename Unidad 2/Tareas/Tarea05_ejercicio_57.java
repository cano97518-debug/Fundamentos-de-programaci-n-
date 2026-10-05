import java.util.Scanner;

public class Tarea05_ejercicio_57 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];

        System.out.println("Ingrese 10 números ORDENADOS para el Arreglo A:");
        for (int i = 0; i < 10; i++) a[i] = entrada.nextInt();

        System.out.println("Ingrese 10 números ORDENADOS para el Arreglo B:");
        for (int i = 0; i < 10; i++) b[i] = entrada.nextInt();

        int i = 0, j = 0, k = 0;
        while (i < 10 && j < 10) {
            if (a[i] < b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }

        while (i < 10) c[k++] = a[i++];
        while (j < 10) c[k++] = b[j++];

        System.out.println("\nArreglo C mezclado y ordenado:");
        for (int m = 0; m < 20; m++) {
            System.out.print(c[m] + " ");
        }
        System.out.println();
        entrada.close();
    }
}