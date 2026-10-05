import java.util.Scanner;

public class Tarea05_ejercicio_02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio, area;

        System.out.print("Introduzca el radio del círculo: ");
        radio = entrada.nextDouble();

        if (radio <= 0) {
            System.out.println("Error: El radio debe ser mayor a cero.");
        } else {
            area = Math.PI * Math.pow(radio, 2);
            System.out.println("El área del círculo es: " + area);
        }

        entrada.close();
    }
}