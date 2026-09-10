import javax.swing.JOptionPane;

public class Ejercicio04_OptionP {
    public static void main(String[] args) {
        int num, dm, um, c, d, u;
        String salida;

        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entre 0 y 99.999:"));

        u = num % 10;
        num = num / 10;

        d = num % 10;
        num = num / 10;

        c = num % 10;
        num = num / 10;

        um = num % 10;
        num = num / 10;

        dm = num;

        salida = String.valueOf(u) + " " + String.valueOf(d) + " " + String.valueOf(c);
        salida = salida + " " + String.valueOf(um) + " " + String.valueOf(dm);

        num = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;

        JOptionPane.showMessageDialog(null, salida + "\n" + num);
    }
}