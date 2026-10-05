import java.util.Scanner;

public class Tarea05_ejercicio_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio, longitud;

        System.out.print("Introduzca el radio de la circunferencia: ");
        radio = entrada.nextDouble();

        if (radio <= 0) {
            System.out.println("Error: El radio debe ser mayor a cero.");
        } else {
            longitud = 2 * Math.PI * radio;
            System.out.println("La longitud de la circunferencia es: " + longitud);
        }

        entrada.close();
    }
}