import java.util.Scanner;

public class Tarea05_ejercicio_53 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int n;

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextInt();
        }

        System.out.print("¿Cuántas posiciones desea desplazar hacia abajo?: ");
        n = entrada.nextInt();

        for (int rotacion = 0; rotacion < n; rotacion++) {
            int ultimo = numeros[9];
            for (int i = 9; i > 0; i--) {
                numeros[i] = numeros[i - 1];
            }
            numeros[0] = ultimo;
        }

        System.out.println("\nArreglo resultante:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posición [" + i + "]: " + numeros[i]);
        }
        entrada.close();
    }
}