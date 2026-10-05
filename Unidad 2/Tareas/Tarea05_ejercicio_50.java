import java.util.Scanner;

public class Tarea05_ejercicio_50 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean creciente = false, decreciente = false;

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (numeros[i] < numeros[i + 1]) creciente = true;
            if (numeros[i] > numeros[i + 1]) decreciente = true;
        }

        if (creciente && !decreciente) System.out.println("La serie está ordenada de forma CRECIENTE.");
        else if (!creciente && decreciente) System.out.println("La serie está ordenada de forma DECRECIENTE.");
        else if (creciente && decreciente) System.out.println("La serie está DESORDENADA.");
        else System.out.println("Todos los números son IGUALES.");

        entrada.close();
    }
}