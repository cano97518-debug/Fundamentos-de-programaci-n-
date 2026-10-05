import java.util.Scanner;

public class Tarea05_ejercicio_07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;

        System.out.print("Introduzca el primer número: ");
        n1 = entrada.nextDouble();

        System.out.print("Introduzca el segundo número: ");
        n2 = entrada.nextDouble();

        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " es mayor que " + n1);
        } else {
            System.out.println("Ambos números son iguales.");
        }

        entrada.close();
    }
}