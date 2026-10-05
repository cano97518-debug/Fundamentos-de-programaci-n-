import java.util.Scanner;

public class Tarea05_ejercicio_47 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] datos = new int[10];

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento [" + i + "]: ");
            datos[i] = entrada.nextInt();
        }

        System.out.println("\nValores intercalados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(datos[i]);
            System.out.println(datos[9 - i]);
        }
        entrada.close();
    }
}