import java.util.Scanner;

public class Tarea05_ejercicio_68 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[][] tablero = new char[3][3];

        // Inicializar tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }

        int jugada = 0;
        while (jugada < 9) {
            char ficha = (jugada % 2 == 0) ? 'X' : 'O';
            System.out.println("\nTurno de Jugador (" + ficha + "):");
            System.out.print("Fila (0-2): ");
            int f = entrada.nextInt();
            System.out.print("Columna (0-2): ");
            int c = entrada.nextInt();

            if (f >= 0 && f < 3 && c >= 0 && c < 3 && tablero[f][c] == '-') {
                tablero[f][c] = ficha;
                jugada++;
            } else {
                System.out.println("¡Casilla inválida u ocupada! Intente de nuevo.");
            }

            // Imprimir tablero
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
        }
        entrada.close();
    }
}