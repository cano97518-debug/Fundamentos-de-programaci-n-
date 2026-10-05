import java.util.Scanner;

public class Tarea05_ejercicio_56 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] datos = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contPares = 0, contImpares = 0;

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            datos[i] = entrada.nextInt();
            if (datos[i] % 2 == 0) {
                pares[contPares++] = datos[i];
            } else {
                impares[contImpares++] = datos[i];
            }
        }

        System.out.println("\n--- ELEMENTOS PARES ---");
        for (int i = 0; i < contPares; i++) System.out.print(pares[i] + " ");

        System.out.println("\n\n--- ELEMENTOS IMPARES ---");
        for (int i = 0; i < contImpares; i++) System.out.print(impares[i] + " ");

        System.out.println();
        entrada.close();
    }
}