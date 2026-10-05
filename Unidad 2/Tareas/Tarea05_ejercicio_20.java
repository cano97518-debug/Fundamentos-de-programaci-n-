import java.util.Scanner;

public class Tarea05_ejercicio_20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int h, m, s;

        System.out.print("Hora: "); h = entrada.nextInt();
        System.out.print("Minutos: "); m = entrada.nextInt();
        System.out.print("Segundos: "); s = entrada.nextInt();

        s++;
        if (s == 60) {
            s = 0;
            m++;
            if (m == 60) {
                m = 0;
                h++;
                if (h == 24) {
                    h = 0;
                }
            }
        }

        System.out.println("Hora siguiente: " + h + ":" + m + ":" + s);

        entrada.close();
    }
}