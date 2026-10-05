import java.util.Scanner;

public class Tarea05_ejercicio_55 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] datos = new int[10];
        int posicion;

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            datos[i] = entrada.nextInt();
        }

        System.out.print("Ingrese la posición (0 a 9) que desea eliminar: ");
        posicion = entrada.nextInt();

        for (int i = posicion; i < 9; i++) {
            datos[i] = datos[i + 1];
        }

        System.out.println("\nArreglo tras la eliminación:");
        for (int i = 0; i < 9; i++) {
            System.out.println("Posición [" + i + "]: " + datos[i]);
        }
        entrada.close();
    }
}