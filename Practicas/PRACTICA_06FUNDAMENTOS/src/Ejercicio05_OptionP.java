import javax.swing.JOptionPane;

public class Ejercicio05_OptionP {
    public static void main(String[] args) {
        int cant = 0, sumacant = 0;
        String salida = "";
        double precio, subtotal, iva, total;
        double sumaiva = 0.0, sumatotal = 0.0;

        // Producto 1
        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio del Refresco coca cola light lata"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada del Refresco coca cola light lata"));

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;

        salida = "subtotal " + subtotal + " iva " + iva;
        salida = salida + " Total " + total;
        JOptionPane.showMessageDialog(null, salida);

        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = sumatotal + total;

        // Producto 2
        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio 1/4 de Arroz"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada del 1/4 de Arroz"));

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;

        salida = "subtotal " + subtotal + " iva " + iva;
        salida = salida + " Total " + total;
        JOptionPane.showMessageDialog(null, salida);

        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = sumatotal + total;

        // Producto 3
        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio pieza de pan frances"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada piezas de pan frances"));

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;

        salida = "subtotal " + subtotal + " iva " + iva;
        salida = salida + " Total " + total;
        JOptionPane.showMessageDialog(null, salida);

        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = sumatotal + total;

        // Resumen final
        String resumen = "el total de productos vendidos fue " + sumacant + "\n"
                       + "el total del iva fue " + sumaiva + "\n"
                       + "el total " + sumatotal;

        JOptionPane.showMessageDialog(null, resumen);
    }
}