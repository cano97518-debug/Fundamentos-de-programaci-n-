package a2261330031_practica10;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalculoAreas {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static double pedirDato(String mensaje) throws IOException {
        System.out.print(mensaje);
        return Double.parseDouble(lectura.readLine());
    }

    public static double areaCirculo(double r) {
        return Math.PI * r * r;
    }

    public static double areaTriangulo(double b, double h) {
        return (b * h) / 2.0;
    }

    public static double areaRectangulo(double b, double h) {
        return b * h;
    }

    public static double areaTrapecio(double B, double b, double h) {
        return ((B + b) * h) / 2.0;
    }

    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ DE ÁREAS ---");
        System.out.println("C.- Área del Círculo");
        System.out.println("T.- Área del Triángulo");
        System.out.println("R.- Área del Rectángulo");
        System.out.println("P.- Área del Trapecio");
        System.out.println("S.- Salir");
        System.out.print("Elige una opción: ");
    }

    public static void main(String[] args) throws IOException {
        String opcion = "";
        
        mostrarMenu();
        opcion = lectura.readLine().toUpperCase();

        while (!opcion.equals("S")) {
            switch (opcion) {
                case "C":
                    double r = pedirDato("Ingresa el radio del círculo: ");
                    System.out.println("Área: " + areaCirculo(r));
                    break;
                case "T":
                    double bT = pedirDato("Ingresa la base del triángulo: ");
                    double hT = pedirDato("Ingresa la altura del triángulo: ");
                    System.out.println("Área: " + areaTriangulo(bT, hT));
                    break;
                case "R":
                    double bR = pedirDato("Ingresa la base del rectángulo: ");
                    double hR = pedirDato("Ingresa la altura del rectángulo: ");
                    System.out.println("Área: " + areaRectangulo(bR, hR));
                    break;
                case "P":
                    double B = pedirDato("Ingresa la base mayor del trapecio: ");
                    double b = pedirDato("Ingresa la base menor del trapecio: ");
                    double hP = pedirDato("Ingresa la altura del trapecio: ");
                    System.out.println("Área: " + areaTrapecio(B, b, hP));
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            mostrarMenu();
            opcion = lectura.readLine().toUpperCase();
        }
        System.out.println("Saliendo del programa...");
    }
}