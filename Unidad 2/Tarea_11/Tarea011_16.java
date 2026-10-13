import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Tarea011_16 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena: ");
        String str = reader.readLine();

        byte[] byteArray = str.getBytes();
        System.out.println("El arreglo de bytes es: " + Arrays.toString(byteArray));
    }
}