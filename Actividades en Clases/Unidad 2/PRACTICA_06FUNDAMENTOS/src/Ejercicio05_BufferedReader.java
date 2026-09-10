import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio05_BufferedReader {
    public static void main(String[] args) throws IOException {
        int cant = 0, sumacant = 0;
        String salida = "";
        double precio, subtotal, iva, total;
        double sumaiva = 0.0, sumatotal = 0.0;
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        // Producto 1: Refresco coca cola light lata
        System.out.print("Introduzca el precio del Refresco coca cola light lata: ");
        precio = Double.parseDouble(entrada.readLine());
        System.out.print("Introduzca la cantidad comprada del Refresco coca cola light lata: ");
        cant = Integer.parseInt(entrada.readLine());

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;

        salida = "subtotal: " + subtotal + " iva: " + iva;
        salida = salida + " Total: " + total;
        System.out.println(salida);

        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = sumatotal + total;

        // Producto 2: 1/4 de Arroz
        System.out.print("Introduzca el precio 1/4 de Arroz: ");
        precio = Double.parseDouble(entrada.readLine());
        System.out.print("Introduzca la cantidad comprada del 1/4 de Arroz: ");
        cant = Integer.parseInt(entrada.readLine());

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;

        salida = "subtotal: " + subtotal + " iva: " + iva;
        salida = salida + " Total: " + total;
        System.out.println(salida);

        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = sumatotal + total;

        // Producto 3: pieza de pan frances
        System.out.print("Introduzca el precio pieza de pan frances: ");
        precio = Double.parseDouble(entrada.readLine());
        System.out.print("Introduzca la cantidad comprada piezas de pan frances: ");
        cant = Integer.parseInt(entrada.readLine());

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