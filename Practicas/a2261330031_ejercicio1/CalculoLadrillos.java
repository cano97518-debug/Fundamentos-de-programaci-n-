package a2261330031_ejercicio1;
import java.util.Scanner;

public class CalculoLadrillos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del muro (m): ");
        double longitudMuro = scanner.nextDouble();
        System.out.print("Ingrese la altura del muro (m): ");
        double alturaMuro = scanner.nextDouble();
        System.out.print("Ingrese el número de castillos: ");
        double numCastillos = scanner.nextDouble();
        System.out.print("Ingrese la longitud de cada castillo (m): ");
        double longitudCastillo = scanner.nextDouble();
        System.out.print("Ingrese el largo del ladrillo (m): ");
        double largoLadrillo = scanner.nextDouble();
        System.out.print("Ingrese el alto del ladrillo (m): ");
        double altoLadrillo = scanner.nextDouble();
        System.out.print("Ingrese el espesor de la junta horizontal (m): ");
        double juntaHoriz = scanner.nextDouble();
        System.out.print("Ingrese el espesor de la junta vertical (m): ");
        double juntaVert = scanner.nextDouble();

        double areaTotal = longitudMuro * alturaMuro;
        double areaCastillos = numCastillos * (longitudCastillo * alturaMuro);
        double areaEfectiva = areaTotal - areaCastillos;
        double areaLadrilloConJunta = (largoLadrillo + juntaVert) * (altoLadrillo + juntaHoriz);
        double numLadrillos = areaEfectiva / areaLadrilloConJunta;

        System.out.printf("%nNúmero total de ladrillos necesarios: %.2f%n", numLadrillos);
        scanner.close();
    }
}

