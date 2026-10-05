import java.util.Scanner;

public class Tarea05_ejercicio_52 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextInt();
        }

        int ultimo = numeros[9];
        for (int i = 9; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;

        System.out.println("\nArreglo desplazado una posición:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posición [" + i + "]: " + numeros[i]);
        }
        entrada.close();
    }
}