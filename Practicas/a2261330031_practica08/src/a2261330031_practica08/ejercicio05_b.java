package a2261330031_practica08;

import java.util.Scanner;

public class ejercicio05_b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String producto1 = "coca cola light lata 400 ml";
        String producto2 = "coca cola lata 400 ml";
        double precio1 = 16.0, precio2 = 15.0;
        
        System.out.println("Menu de Opciones\n1.-Productos\n2.-Punto de venta");
        System.out.print("Que opcion deseas: ");
        int opc = entrada.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("El " + producto1 + " cuesta: $" + precio1);
                System.out.println("El " + producto2 + " cuesta: $" + precio2);
                break;
            case 2:
                System.out.print("Introduce la cantidad comprada de " + producto1 + ": ");
                int cant1 = entrada.nextInt();
                System.out.print("Introduzca la cantidad comprada de " + producto2 + ": ");
                int cant2 = entrada.nextInt();
                
                double subtotal1 = cant1 * precio1;
                double iva1 = subtotal1 * 0.16;
                double total1 = iva1 + subtotal1;
                System.out.println("Para " + cant1 + " " + producto1 + " subtotal fue " + subtotal1 + ", iva fue " + iva1 + ", total fue " + total1);
                
                double subtotal2 = cant2 * precio2;
                double iva2 = subtotal2 * 0.16;
                double total2 = iva2 + subtotal2;
                System.out.println("Para " + cant2 + " " + producto2 + " subtotal fue " + subtotal2 + ", iva fue " + iva2 + ", total fue " + total2);
                
                System.out.println("\nEl total de la venta fue");
                System.out.println("subtotal fue (" + (subtotal1 + subtotal2) + ")");
                System.out.println("el total de iva fue (" + (iva1 + iva2) + ")");
                System.out.println("Total Fue (" + (total1 + total2) + ")");
                break;
            default:
                System.out.println("eleccion incorrecta");
                break;
        }
        entrada.close();
    }
}