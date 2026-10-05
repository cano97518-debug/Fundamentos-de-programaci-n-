import java.util.Scanner;

public class Tarea05_ejercicio_21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, u, d;

        System.out.print("Introduzca un número entre 0 y 99: ");
        num = entrada.nextInt();

        u = num % 10;
        d = num / 10;

        if (num < 0 || num > 99) {
            System.out.println("Error: Número fuera de rango.");
        } else if (num == 0) System.out.println("Cero");
        else if (num == 1) System.out.println("Uno");
        else if (num == 2) System.out.println("Dos");
        else if (num == 3) System.out.println("Tres");
        else if (num == 4) System.out.println("Cuatro");
        else if (num == 5) System.out.println("Cinco");
        else if (num == 6) System.out.println("Seis");
        else if (num == 7) System.out.println("Siete");
        else if (num == 8) System.out.println("Ocho");
        else if (num == 9) System.out.println("Nueve");
        else if (num == 10) System.out.println("Diez");
        else if (num == 11) System.out.println("Once");
        else if (num == 12) System.out.println("Doce");
        else if (num == 13) System.out.println("Trece");
        else if (num == 14) System.out.println("Catorce");
        else if (num == 15) System.out.println("Quince");
        else {
            String textoDecena = "";
            String textoUnidad = "";

            switch (d) {
                case 1: textoDecena = "Dieci"; break;
                case 2: textoDecena = (u == 0) ? "Veinte" : "Veinti"; break;
                case 3: textoDecena = (u == 0) ? "Treinta" : "Treinta y "; break;
                case 4: textoDecena = (u == 0) ? "Cuarenta" : "Cuarenta y "; break;
                case 5: textoDecena = (u == 0) ? "Cincuenta" : "Cincuenta y "; break;
                case 6: textoDecena = (u == 0) ? "Sesenta" : "Sesenta y "; break;
                case 7: textoDecena = (u == 0) ? "Setenta" : "Setenta y "; break;
                case 8: textoDecena = (u == 0) ? "Ochenta" : "Ochenta y "; break;
                case 9: textoDecena = (u == 0) ? "Noventa" : "Noventa y "; break;
            }

            if (u != 0 && !(d == 1 || d == 2)) {
                switch (u) {
                    case 1: textoUnidad = "uno"; break;
                    case 2: textoUnidad = "dos"; break;
                    case 3: textoUnidad = "tres"; break;
                    case 4: textoUnidad = "cuatro"; break;
                    case 5: textoUnidad = "cinco"; break;
                    case 6: textoUnidad = "seis"; break;
                    case 7: textoUnidad = "siete"; break;
                    case 8: textoUnidad = "ocho"; break;
                    case 9: textoUnidad = "nueve"; break;
                }
            } else if (u != 0 && d == 1) {
                switch (u) {
                    case 6: textoDecena = "Dieciséis"; break;
                    case 7: textoDecena = "Diecisiete"; break;
                    case 8: textoDecena = "Dieciocho"; break;
                    case 9: textoDecena = "Diecinueve"; break;
                }
            } else if (u != 0 && d == 2) {
                switch (u) {
                    case 1: textoUnidad = "uno"; break;
                    case 2: textoUnidad = "dós"; break;
                    case 3: textoUnidad = "trés"; break;
                    case 4: textoUnidad = "cuatro"; break;
                    case 5: textoUnidad = "cinco"; break;
                    case 6: textoUnidad = "séis"; break;
                    case 7: textoUnidad = "siete"; break;
                    case 8: textoUnidad = "ocho"; break;
                    case 9: textoUnidad = "nueve"; break;
                }
            }

            System.out.println(textoDecena + textoUnidad);
        }

        entrada.close();
    }
}