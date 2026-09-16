package a2261330031_practica07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_1_mc_buffer {
    public static void main(String args[]) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double tarifa, subtotal, iva, total;
        int tipo;
        System.out.println("Introduce la tarifa base:");
        tarifa = Double.parseDouble(entrada.readLine());
        System.out.println("Introduce tipo usuario (1=Profesor, 2=Alumno, 3=General):");
        tipo = Integer.parseInt(entrada.readLine());
        
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















