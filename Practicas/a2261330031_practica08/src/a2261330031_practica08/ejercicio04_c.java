package a2261330031_practica08;

import javax.swing.JOptionPane;

public class ejercicio04_c {
    public static void main(String[] args) {
        double operando1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del operando 1:"));
        double operando2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del operando 2:"));

        String menu = "Menu de opciones de Operaciones Basicas\n 1.- Suma\n 2.- Multiplicacion\n 3.- Division\n Elige una Opcion [1..3]:";
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        double resultado;
        String cadena;

        switch (opcion) {
            case 1:
                resultado = operando1 + operando2;
                cadena = "el resultado de la suma es " + resultado;
                break;
            case 2:
                resultado = operando1 * operando2;
                cadena = "el resultado de la multiplicacion es: " + resultado;
                break;
            case 3:
                resultado = operando1 / operando2;
                cadena = "el resultado de la division es " + resultado;
                break;
            default:
                cadena = "opcion no reconocida ";
                break;
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
}

