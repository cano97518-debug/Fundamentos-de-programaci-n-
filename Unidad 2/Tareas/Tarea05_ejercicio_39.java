import java.util.Scanner;

public class Tarea05_ejercicio_39 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo, litros, litrosArt1 = 0, mas600 = 0;
        double precio = 0, importe, facturacionTotal = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("--- Factura " + i + " ---");
            System.out.print("Código de artículo (1, 2 o 3): "); codigo = entrada.nextInt();
            System.out.print("Cantidad en litros: "); litros = entrada.nextInt();

            switch (codigo) {
                case 1: precio = 0.6; litrosArt1 += litros; break;
                case 2: precio = 3.0; break;
                case 3: precio = 1.25; break;
                default: System.out.println("Código no válido. Se asigna 0."); precio = 0;
            }

            importe = litros * precio;
            facturacionTotal += importe;
            if (importe > 600) mas600++;
        }

        System.out.println("Facturación total: $" + facturacionTotal);
        System.out.println("Litros vendidos del artículo 1: " + litrosArt1);
        System.out.println("Facturas de más de $600: " + mas600);
        entrada.close();
    }
}