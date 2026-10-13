import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarea011_15 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy\nHH:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Fecha y hora actuales:\n" + dtf.format(now));
    }
}