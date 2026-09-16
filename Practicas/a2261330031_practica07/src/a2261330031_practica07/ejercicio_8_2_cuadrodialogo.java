package a2261330031_practica07;

import javax.swing.JOptionPane;

public class ejercicio_8_2_cuadrodialogo {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Lado A:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Lado B:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Lado C:"));
        
        String tipo = "";
        if (a == b && b == c) {
            tipo = "Triángulo Equilátero";
        }
        if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            tipo = "Triángulo Isósceles";
        }
        if (a != b && b != c && a != c) {
            tipo = "Triángulo Escaleno";
        }
        
        JOptionPane.showMessageDialog(null, tipo);
        System.exit(0);
    }
}



















