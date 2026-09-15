package a2261330031_practica07;

import javax.swing.JOptionPane;

public class ejercicio_8_1_cuadrodialogo {
    public static void main(String args[]) {
        double tarifa, subtotal, iva, total;
        int tipo;
        tarifa = Double.parseDouble(JOptionPane.showInputDialog("Introduce la tarifa base:"));
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Introduce tipo usuario (1=Profesor, 2=Alumno, 3=General):"));
        
        if (tipo == 1)
            subtotal = tarifa - (tarifa * 0.20);
        else
            if (tipo == 2)
                subtotal = tarifa - (tarifa * 0.10);
            else
                subtotal = tarifa;
                
        iva = subtotal * 0.16;
        total = subtotal + iva;
        JOptionPane.showMessageDialog(null, "El total a pagar es: " + total);
        System.exit(0);
    }
}























