import java.util.Scanner;

public class Tarea05_ejercicio_48 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];

        System.out.println("--- Arreglo A ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = entrada.nextInt();
        }

        System.out.println("--- Arreglo B ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            b[i] = entrada.nextInt();
        }

        int j = 0;
        for (int i = 0; i < 10; i++) {
            c[j++] = a[i];
            c[j++] = b[i];
        }

        System.out.println("\nArreglo C mezclado:");
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        entrada.close();
    }
}