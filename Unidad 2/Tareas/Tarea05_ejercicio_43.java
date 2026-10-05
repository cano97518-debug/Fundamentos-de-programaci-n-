import java.util.Scanner;

public class Tarea05_ejercicio_43 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        boolean haySuspenso = false;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Calificación del alumno " + i + ": ");
            nota = entrada.nextDouble();
            if (nota < 5) {
                haySuspenso = true;
            }
        }

        if (haySuspenso) {
            System.out.println("Atención: Hay al menos un alumno suspenso.");
        } else {
            System.out.println("Todos los alumnos han aprobado.");
        }
        entrada.close();
    }
}