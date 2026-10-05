import java.util.Scanner;

public class Tarea05_ejercicio_26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int secreto = (int) (Math.random() * 100) + 1;
        int num;

        System.out.println("Adivina el número entre 1 y 100:");
        num = entrada.nextInt();

        while (num != secreto) {
            if (num < secreto) {
                System.out.println("Es MAYOR. Intenta de nuevo: ");
            } else {
                System.out.println("Es MENOR. Intenta de nuevo: ");
            }
            num = entrada.nextInt();
        }
        System.out.println("¡Correcto! El número era: " + secreto);
        entrada.close();
    }
}