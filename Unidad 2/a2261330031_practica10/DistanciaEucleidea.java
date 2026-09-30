package a2261330031_practica10;
import java.util.Scanner;

public class DistanciaEucleidea {
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x1: "); double x1 = sc.nextDouble();
        System.out.print("y1: "); double y1 = sc.nextDouble();
        System.out.print("x2: "); double x2 = sc.nextDouble();
        System.out.print("y2: "); double y2 = sc.nextDouble();

        double dist = calcularDistancia(x1, y1, x2, y2);
        System.out.printf("La distancia euclídea es: %.4f\n", dist);
    }
}