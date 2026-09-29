package a2261330031_ejercicio1;
import java.util.Scanner;

public class CalculoMaterialesLosa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la losa (m): ");
        double longitudLosa = scanner.nextDouble();
        System.out.print("Ingrese el ancho de la losa (m): ");
        double anchoLosa = scanner.nextDouble();
        System.out.print("Ingrese el espesor de la losa (m): ");
        double espesorLosa = scanner.nextDouble();

        double volumen = longitudLosa * anchoLosa * espesorLosa;
        double cemento = volumen * 7;
        double arena = volumen * 0.5;
        double grava = volumen * 0.7;
        double agua = volumen * 180;

        System.out.printf("%nVolumen total de la losa: %.2f m³%n", volumen);
        System.out.printf("Cantidad de cemento (bultos de 50kg): %.2f%n", cemento);
        System.out.printf("Cantidad de arena: %.2f m³%n", arena);
        System.out.printf("Cantidad de grava: %.2f m³%n", grava);
        System.out.printf("Cantidad de agua: %.2f litros%n", agua);

        scanner.close();
    }
}



