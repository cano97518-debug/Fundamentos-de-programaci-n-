package a2261330031_practica08;

import java.util.Scanner;

public class ejercicio02_b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Menu de Opciones\n 1.-Opcion 1\n 2.-Opcion 2\n 3.-Opcion 3\n 4.-Opcion 4\n Eliga una opcion [1..4]--> ");
        int num = entrada.nextInt();
        String cadena;

        switch(num){
            case 1: cadena = "Elegiste la opcion 1"; break;
            case 2: cadena = "Elegiste la opcion 2"; break;
            case 3: cadena = "Elegiste la opcion 3"; break;
            case 4: cadena = "Elegiste la opcion 4"; break;
            default: cadena = "Elegiste una opcion que no existe"; break;
        }
        System.out.println("\n" + cadena);
        entrada.close();
    }
}







