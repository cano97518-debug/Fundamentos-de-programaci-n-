import java.util.Scanner;

public class Tarea05_ejercicio_06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;

        System.out.print("Introduzca el primer número: ");
        n1 = entrada.nextInt();

        System.out.print("Introduzca el segundo número: ");
        n2 = entrada.nextInt();

        if (n2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
        } else if (n1 % n2 == 0) {
            System.out.println(n1 + " es múltiplo de " + n2);
        } else {
            System.out.println(n1 + " NO es múltiplo de " + n2);
        }

        entrada.close();
    }
}