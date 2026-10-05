
public class Tarea05_ejercicio_76 {
    public static void main(String[] args) {
        int t[][];
        boolean simetrica;
        int i, j;

        t = new int[4][4];
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("Introduzca elemento [" + i + "][" + j + "]: ");
                t[i][j] = Entrada.entero();
            }
        }

        simetrica = true; // Suponemos que la matriz es simétrica
        
        // Se examina solo la zona inferior a la diagonal principal para evitar revisiones dobles
        i = 0;
        while (i < 4 && simetrica == true) {
            j = 0;
            while (j < i && simetrica == true) {
                if (t[i][j] != t[j][i]) {
                    simetrica = false;
                }
                j++;
            }
            i++;
        }

        if (simetrica) {
            System.out.println("SIMETRICA");
        } else {
            System.out.println("NO ES SIMETRICA");
        }
    }
}

