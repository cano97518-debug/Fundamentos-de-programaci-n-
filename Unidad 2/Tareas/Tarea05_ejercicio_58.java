import java.util.Scanner;

public class Tarea05_ejercicio_58 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] datos = new int[10];
        int buscar, pos = -1;

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            datos[i] = entrada.nextInt();
        }

        System.out.print("Ingrese el número a buscar: ");
        buscar = entrada.nextInt();

        for (int i = 0; i < 10; i++) {
            if (datos[i] == buscar) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            System.out.println("El número " + buscar + " se encuentra en el índice: " + pos);
        } else {
            System.out.println("El número no se encuentra en el arreglo.");
        }
        entrada.close();
    }
}