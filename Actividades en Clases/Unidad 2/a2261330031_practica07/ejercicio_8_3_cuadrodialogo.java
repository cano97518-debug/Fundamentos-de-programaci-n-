package a2261330031_practica07;

import javax.swing.JOptionPane;

public class ejercicio_8_3_cuadrodialogo {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Lado A:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Lado B:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Lado C:"));
        
        String tipo = "";
        if (a == b && b == c) {
            tipo = "Triángulo Equilátero";
        } else {
            if (a == b || a == c || b == c) {
                tipo = "Triángulo Isósceles";
            } else {
                tipo = "Triángulo Escaleno";
            }
        }
        
        JOptionPane.showMessageDialog(null, tipo);
        System.exit(0);
    }
}
















