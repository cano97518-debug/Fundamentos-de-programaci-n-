package a2261330031_practica08;

import javax.swing.JOptionPane;

public class ejercicio05_c {
    public static void main(String[] args) {
        String producto1 = "coca cola light lata 400 ml";
        String producto2 = "coca cola lata 400 ml";
        double precio1 = 16.0, precio2 = 15.0;
        
        String menu = "Menu de Opciones\n1.-Productos\n2.-Punto de venta\nQue opcion deseas:";
        int opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        switch (opc) {
            case 1:
                String info = "El " + producto1 + " cuesta: $" + precio1 + "\nEl " + producto2 + " cuesta: $" + precio2;
                JOptionPane.showMessageDialog(null, info);
                break;
            case 2:
                int cant1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad comprada de " + producto1 + ":"));
                int cant2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada de " + producto2 + ":"));
                
                double subtotal1 = cant1 * precio1;
                double iva1 = subtotal1 * 0.16;
                double total1 = iva1 + subtotal1;
                
                double subtotal2 = cant2 * precio2;
                double iva2 = subtotal2 * 0.16;
                double total2 = iva2 + subtotal2;
                
                String resumen = "Para " + cant1 + " " + producto1 + " subtotal fue " + subtotal1 + ", iva fue " + iva1 + ", total fue " + total1 + "\n"
                        + "Para " + cant2 + " " + producto2 + " subtotal fue " + subtotal2 + ", iva fue " + iva2 + ", total fue " + total2 + "\n\n"
                        + "El total de la venta fue:\n"
                        + "subtotal fue (" + (subtotal1 + subtotal2) + ")\n"
                        + "el total de iva fue (" + (iva1 + iva2) + ")\n"
                        + "Total Fue (" + (total1 + total2) + ")";
                        
                JOptionPane.showMessageDialog(null, resumen);
                break;
            default:
                JOptionPane.showMessageDialog(null, "eleccion incorrecta");
                break;
        }
    }
}