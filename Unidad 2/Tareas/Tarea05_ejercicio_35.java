import java.util.Scanner;

public class Tarea05_ejercicio_35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sueldo, suma = 0;
        int mayores10k = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduzca sueldo " + i + ": ");
            sueldo = entrada.nextDouble();
            suma += sueldo;
            if (sueldo > 10000) {
                mayores10k++;
            }
        }

        System.out.println("Suma total de sueldos: " + suma);
        System.out.println("Sueldos mayores a $10,000: " + mayores10k);
        entrada.close();
    }
}