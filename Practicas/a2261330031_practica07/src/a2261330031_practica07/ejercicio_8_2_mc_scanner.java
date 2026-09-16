package a2261330031_practica07;

import java.util.Scanner;

public class ejercicio_8_2_mc_scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Lado A:"); double a = entrada.nextDouble();
        System.out.println("Lado B:"); double b = entrada.nextDouble();
        System.out.println("Lado C:"); double c = entrada.nextDouble();

        if (a == b && b == c) {
            System.out.println("Triángulo Equilátero");
        }
        if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            System.out.println("Triángulo Isósceles");
        }
        if (a != b && b != c && a != c) {
            System.out.println("Triángulo Escaleno");
        }
        System.exit(0);
    }
}























