import java.util.Scanner;

public class Tarea05_ejercicio_40 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        int aprobados = 0, condicionados = 0, reprobados = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Nota del alumno " + i + ": ");
            nota = entrada.nextDouble();

            if (nota >= 5) {
                aprobados++;
            } else if (nota == 4) {
                condicionados++;
            } else {
                reprobados++;
            }
        }

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Condicionados (nota 4): " + condicionados);
        System.out.println("Reprobados: " + reprobados);
        entrada.close();
    }
}