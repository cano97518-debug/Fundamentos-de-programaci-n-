package a2261330031_practica10;
import java.util.Scanner;

public class Trigonometria {
    public static void mostrarRazonesTrig(double grados) {
        double rad = Math.toRadians(grados);
        System.out.println("Seno: " + Math.sin(rad));
        System.out.println("Coseno: " + Math.cos(rad));
        System.out.println("Tangente: " + Math.tan(rad));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el ángulo en grados: ");
        double angulo = sc.nextDouble();

        mostrarRazonesTrig(angulo);
    }
}