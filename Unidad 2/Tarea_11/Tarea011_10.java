import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena: ");
        String str = reader.readLine();

        System.out.print("Introduce el texto del búfer: ");
        StringBuffer sb = new StringBuffer(reader.readLine());

        boolean result = str.contentEquals(sb);
        System.out.println("Comparando " + str + " y " + sb + ": " + result);
    }
}