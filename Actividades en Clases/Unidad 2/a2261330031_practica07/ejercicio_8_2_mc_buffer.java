package a2261330031_practica07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_2_mc_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Lado A:"); double a = Double.parseDouble(entrada.readLine());
        System.out.println("Lado B:"); double b = Double.parseDouble(entrada.readLine());
        System.out.println("Lado C:"); double c = Double.parseDouble(entrada.readLine());

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

























