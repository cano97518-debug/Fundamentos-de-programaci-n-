import java.util.Scanner;

public class Tarea05_ejercicio_41 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        double sueldo, maxSueldo = 0;

        System.out.print("¿Cuántos sueldos va a ingresar?: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Sueldo " + i + ": ");
            sueldo = entrada.nextDouble();
            if (sueldo > maxSueldo) {
                maxSueldo = sueldo;
            }
        }

        System.out.println("El sueldo máximo es: $" + maxSueldo);
        entrada.close();
    }
}