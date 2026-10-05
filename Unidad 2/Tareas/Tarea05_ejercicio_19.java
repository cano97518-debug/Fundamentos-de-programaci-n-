import java.util.Scanner;

public class Tarea05_ejercicio_19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int d1, m1, a1, d2, m2, a2;

        System.out.println("--- Fecha 1 ---");
        System.out.print("Día: "); d1 = entrada.nextInt();
        System.out.print("Mes: "); m1 = entrada.nextInt();
        System.out.print("Año: "); a1 = entrada.nextInt();

        System.out.println("--- Fecha 2 ---");
        System.out.print("Día: "); d2 = entrada.nextInt();
        System.out.print("Mes: "); m2 = entrada.nextInt();
        System.out.print("Año: "); a2 = entrada.nextInt();

        int totalDias1 = (a1 * 360) + (m1 * 30) + d1;
        int totalDias2 = (a2 * 360) + (m2 * 30) + d2;

        int diferencia = Math.abs(totalDias2 - totalDias1);

        System.out.println("La diferencia es de: " + diferencia + " días.");

        entrada.close();
    }
}