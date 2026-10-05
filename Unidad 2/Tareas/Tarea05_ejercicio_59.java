import java.util.Scanner;

public class Tarea05_ejercicio_59 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] t1 = new double[5];
        double[] t2 = new double[5];
        double[] t3 = new double[5];
        double s1 = 0, s2 = 0, s3 = 0;

        System.out.println("--- NOTAS TRIMESTRE 1 ---");
        for (int i = 0; i < 5; i++) { System.out.print("Alumno " + (i + 1) + ": "); t1[i] = entrada.nextDouble(); s1 += t1[i]; }

        System.out.println("--- NOTAS TRIMESTRE 2 ---");
        for (int i = 0; i < 5; i++) { System.out.print("Alumno " + (i + 1) + ": "); t2[i] = entrada.nextDouble(); s2 += t2[i]; }

        System.out.println("--- NOTAS TRIMESTRE 3 ---");
        for (int i = 0; i < 5; i++) { System.out.print("Alumno " + (i + 1) + ": "); t3[i] = entrada.nextDouble(); s3 += t3[i]; }

        System.out.println("\nPromedio del grupo Trimestre 1: " + (s1 / 5));
        System.out.println("Promedio del grupo Trimestre 2: " + (s2 / 5));
        System.out.println("Promedio del grupo Trimestre 3: " + (s3 / 5));

        System.out.print("\nIngrese la posición del alumno (0 a 4) para ver su media final: ");
        int p = entrada.nextInt();
        double mediaAlumno = (t1[p] + t2[p] + t3[p]) / 3.0;
        System.out.println("La media del alumno seleccionado es: " + mediaAlumno);

        entrada.close();
    }
}¿