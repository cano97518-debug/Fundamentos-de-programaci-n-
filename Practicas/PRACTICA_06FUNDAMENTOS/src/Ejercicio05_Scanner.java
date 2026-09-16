import java.util.Scanner;

public class Ejercicio05_Scanner {
    public static void main(String[] args) {
        int cant = 0, sumacant = 0;
        String salida = "";
        double precio, subtotal, iva, total;
        double sumaiva = 0.0, sumatotal = 0.0;

        Scanner entrada = new Scanner(System.in);

        // Producto 1
        System.out.print("Introduzca el precio del Refresco coca cola light lata: ");
        precio = entrada.nextDouble();
        System.out.print("Introduzca la cantidad comprada del Refresco coca cola light lata: ");
        cant = entrada.nextInt();

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;

        salida = "subtotal: " + subtotal + " iva: " + iva;
        salida = salida + " Total: " + total;
        System.out.println(salida);

        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = sumatotal + total;

        // Producto 2
        System.out.print("Introduzca el precio 1/4 de Arroz: ");
        precio = entrada.nextDouble();
        System.out.print("Introduzca la cantidad comprada del 1/4 de Arroz: ");
        cant = entrada.nextInt();

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;

        salida = "subtotal: " + subtotal + " iva: " + iva;
        salida = salida + " Total: " + total;
        System.out.println(salida);

        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = sumatotal + total;

        // Producto 3
        System.out.print("Introduzca el precio pieza de pan frances: ");
        precio = entrada.nextDouble();
        System.out.print("Introduzca la cantidad comprada piezas de pan frances: ");
        cant = entrada.nextInt();

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;

        salida = "subtotal: " + subtotal + " iva: " + iva;
        salida = salida + " Total: " + total;
        System.out.println(salida);

        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = sumatotal + total;

        // Totales generales
        System.out.println("el total de productos vendidos fue: " + sumacant);
        System.out.println("el total del iva fue: " + sumaiva);
        System.out.println("el total: " + sumatotal);
    }
}