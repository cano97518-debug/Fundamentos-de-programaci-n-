import java.util.Scanner;

public class Tarea05_ejercicio_31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num, suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            num = entrada.nextDouble();
            suma += num;
        }
        System.out.println("La suma total es: " + suma);
        entrada.close();
    }
}