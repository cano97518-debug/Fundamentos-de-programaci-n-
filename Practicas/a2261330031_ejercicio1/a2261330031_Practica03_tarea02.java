package a2261330031_ejercicio1;
import java.util.Scanner;

public class a2261330031_Practica03_tarea02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la longitud de la losa (X en metros): ");
        double largoLosa = sc.nextDouble();

        System.out.print("Introduce el ancho de la losa (Y en metros): ");
        double anchoLosa = sc.nextDouble();

        System.out.print("Introduce el espesor de la losa (N en metros): ");
        double espesorLosa = sc.nextDouble();

        double volumen = largoLosa * anchoLosa * espesorLosa;
        double bultosCemento = volumen * 7.0;
        double volumenArena = volumen * 0.50;
        double volumenGrava = volumen * 0.70;
        double litrosAgua = volumen * 180.0;

        System.out.println("\nEl volumen total de la losa es: " + volumen + " m3");
        System.out.println("Bultos de cemento requeridos: " + bultosCemento);
        System.out.println("Metros cubicos de arena requeridos: " + volumenArena);
        System.out.println("Metros cubicos de grava requeridos: " + volumenGrava);
        System.out.println("Litros de agua requeridos: " + litrosAgua);
    }
}