import java.util.Scanner;

public class Tarea05_ejercicio_51 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] tabla = new int[10];
        int numero, posicion;

        System.out.println("Ingrese 8 números enteros:");
        for (int i = 0; i < 8; i++) {
            tabla[i] = entrada.nextInt();
        }

        System.out.print("Ingrese un nuevo número: ");
        numero = entrada.nextInt();
        System.out.print("Ingrese la posición (0 a 8) donde desea insertarlo: ");
        posicion = entrada.nextInt();

        for (int i = 8; i > posicion; i--) {
            tabla[i] = tabla[i - 1];
        }
        tabla[posicion] = numero;

        System.out.println("\nArreglo tras la inserción:");
        for (int i = 0; i < 9; i++) {
            System.out.println("Posición [" + i + "]: " + tabla[i]);
        }
        entrada.close();
    }
}