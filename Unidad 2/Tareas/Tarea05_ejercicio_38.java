import java.util.Scanner;

public class Tarea05_ejercicio_38 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo, litros, litrosArt1 = 0, mas600 = 0;
        double precio, importe, facturacionTotal = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("--- Factura " + i + " ---");
            System.out.print("Código del artículo: "); codigo = entrada.nextInt();
            System.out.print("Cantidad en litros: "); litros = entrada.nextInt();
            System.out.print("Precio por litro: "); precio = entrada.nextDouble();

            importe = litros * precio;
            facturacionTotal += importe;

            if (codigo == 1) litrosArt1 += litros;
            if (importe > 600) mas600++;
        }

        System.out.println("Facturación total: $" + facturacionTotal);
        System.out.println("Litros vendidos del artículo 1: " + litrosArt1);
        System.out.println("Facturas emitidas de más de $600: " + mas600);
        entrada.close();
    }
}