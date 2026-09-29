package a2261330031_practica4;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("--- TABLA ALINEADA DERECHA ---");
        System.out.printf("%10s %10s\n", "Producto", "Precio");
        System.out.printf("%10s %10.2f\n", "Cuaderno", 45.50);
        System.out.printf("%10s %10.2f\n", "Lápiz", 12.00);

        System.out.println("\n--- TABLA ALINEADA IZQUIERDA ---");
        System.out.printf("%-10s %-10s\n", "Producto", "Precio");
        System.out.printf("%-10s %-10.2f\n", "Cuaderno", 45.50);
        System.out.printf("%-10s %-10.2f\n", "Lápiz", 12.00);
    }
}