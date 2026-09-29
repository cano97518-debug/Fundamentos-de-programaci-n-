package a2261330031_ejercicio1;
import java.util.Scanner;

public class a2261330031_Practica03_tarea01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la longitud del muro (X en metros): ");
        double longitudMuro = sc.nextDouble();

        System.out.print("Introduce la altura del muro (Y en metros): ");
        double alturaMuro = sc.nextDouble();

        System.out.print("Introduce el numero de castillos (N): ");
        double numCastillos = sc.nextDouble();

        System.out.print("Introduce la longitud de cada castillo (P en metros): ");
        double longitudCastillo = sc.nextDouble();

        System.out.print("Introduce el largo del ladrillo (metros): ");
        double largoLadrillo = sc.nextDouble();

        System.out.print("Introduce el alto del ladrillo (metros): ");
        double altoLadrillo = sc.nextDouble();

        System.out.print("Introduce el espesor de junta horizontal (metros): ");
        double juntaHoriz = sc.nextDouble();

        System.out.print("Introduce el espesor de junta vertical (metros): ");
        double juntaVert = sc.nextDouble();

        double areaTotal = longitudMuro * alturaMuro;
        double areaCastillos = numCastillos * (longitudCastillo * alturaMuro);
        double areaEfectiva = areaTotal - areaCastillos;
        double areaLadrilloConJunta = (largoLadrillo + juntaVert) * (altoLadrillo + juntaHoriz);
        double NL = areaEfectiva / areaLadrilloConJunta;

        System.out.println("\nEl numero de ladrillos obtenido es: " + NL);
    }
}