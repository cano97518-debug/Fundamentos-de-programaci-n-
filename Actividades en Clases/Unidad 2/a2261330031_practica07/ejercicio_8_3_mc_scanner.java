package a2261330031_practica07;

import java.util.Scanner;

public class ejercicio_8_3_mc_scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Lado A:"); double a = entrada.nextDouble();
        System.out.println("Lado B:"); double b = entrada.nextDouble();
        System.out.println("Lado C:"); double c = entrada.nextDouble();

        if (a == b && b == c) {
            System.out.println("Triángulo Equilátero");
        } else {
            if (a == b || a == c || b == c) {
                System.out.println("Triángulo Isósceles");
            } else {
                System.out.println("Triángulo Escaleno");
            }
        }
        System.exit(0);
    }
}










