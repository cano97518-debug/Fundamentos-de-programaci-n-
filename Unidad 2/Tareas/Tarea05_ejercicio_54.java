import java.util.Scanner;

public class Tarea05_ejercicio_54 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] tabla = new int[6];
        int numero, pos = 0;

        System.out.println("Ingrese 5 números enteros en orden creciente:");
        for (int i = 0; i < 5; i++) {
            tabla[i] = entrada.nextInt();
        }

        System.out.print("Ingrese el número a insertar: ");
        numero = entrada.nextInt();

        while (pos < 5 && tabla[pos] < numero) {
            pos++;
        }

        for (int i = 5; i > pos; i--) {
            tabla[i] = tabla[i - 1];
        }
        tabla[pos] = numero;

        System.out.println("\nArreglo ordenado resultante:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Posición [" + i + "]: " + tabla[i]);
        }
        entrada.close();
    }
}