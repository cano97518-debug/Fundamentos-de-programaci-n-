package a2261330031_practica08;

import java.util.Scanner;

public class ejercicio04_b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el valor del operando 1: ");
        double operando1 = entrada.nextDouble();
        System.out.print("Introduce el valor del operando 2: ");
        double operando2 = entrada.nextDouble();

        System.out.print("Menu de opciones de Operaciones Basicas\n 1.- Suma\n 2.- Multiplicacion\n 3.- Division\n Elige una Opcion [1..2..3]: ");
        int opcion = entrada.nextInt();
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
        System.out.println(cadena);
        entrada.close();
    }
}







