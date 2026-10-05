import java.util.Scanner;

public class Tarea05_ejercicio_42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num;
        boolean hayNegativo = false;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            num = entrada.nextDouble();
            if (num < 0) {
                hayNegativo = true;
            }
        }

        if (hayNegativo) {
            System.out.println("Sí se ha introducido al menos un número negativo.");
        } else {
            System.out.println("No se introdujo ningún número negativo.");
        }
        entrada.close();
    }
}