import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_102 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese un número entero en texto: ");
            String sInt = reader.readLine();
            int iVal = Integer.parseInt(sInt);
            Integer IVal = Integer.valueOf(sInt);
            System.out.println("\"" + sInt + "\" como int es " + iVal + " y como Integer es " + IVal);

            System.out.print("Ingrese un número long en texto: ");
            String sLong = reader.readLine();
            long lVal = Long.parseLong(sLong);
            Long LVal = Long.valueOf(sLong);
            System.out.println("\"" + sLong + "\" tan largo como " + lVal + " y tan largo como " + LVal);

            System.out.print("Ingrese un número float en texto: ");
            String sFloat = reader.readLine();
            float fVal = Float.parseFloat(sFloat);
            Float FVal = Float.valueOf(sFloat);
            System.out.println("\"" + sFloat + "\" como flotador es " + fVal + " y como flotador es " + FVal);

            System.out.print("Ingrese un número double en texto: ");
            String sDouble = reader.readLine();
            double dVal = Double.parseDouble(sDouble);
            Double DVal = Double.valueOf(sDouble);
            System.out.println("\"" + sDouble + "\" como doble es " + dVal + " y como doble es " + DVal);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}