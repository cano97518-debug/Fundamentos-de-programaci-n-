import java.util.Scanner;

public class Tarea05_ejercicio_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;

        System.out.print("Introduzca una nota entre 0 y 10: ");
        nota = entrada.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Error: Nota fuera de rango.");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }

        entrada.close();
    }
}