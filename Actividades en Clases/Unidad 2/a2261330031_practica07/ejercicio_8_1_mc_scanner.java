package a2261330031_practica07;

import java.util.Scanner;

public class ejercicio_8_1_mc_scanner {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double tarifa, subtotal, iva, total;
        int tipo;
        System.out.println("Introduce la tarifa base:");
        tarifa = entrada.nextDouble();
        System.out.println("Introduce tipo usuario (1=Profesor, 2=Alumno, 3=General):");
        tipo = entrada.nextInt();
        
        if (tipo == 1)
            subtotal = tarifa - (tarifa * 0.20);
        else
            if (tipo == 2)
                subtotal = tarifa - (tarifa * 0.10);
            else
                subtotal = tarifa;
                
        iva = subtotal * 0.16;
        total = subtotal + iva;
        System.out.println("El total a pagar es: " + total);
        System.exit(0);
    }
}




















