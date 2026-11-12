package a2261330031_puntoventa2;

	import java.util.Scanner;
	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;

	public class AmatriculaPuntoVenta2 {

	    private static Scanner scanner = new Scanner(System.in);
	    private static int ultimoIdTicket = 0; // Para llevar el control del folio

	    // ==========================================
	    // FUNCIONES DE APOYO (Capítulo 3)
	    // ==========================================

	    public static String idTicketSiguiente(int idActual) {
	        int siguiente = idActual + 1;
	        ultimoIdTicket = siguiente;
	        // Formatea el número con ceros a la izquierda (ej. 001)
	        return String.format("%03d", siguiente);
	    }

	    public static String fechaActual() {
	        LocalDate fecha = LocalDate.now();
	        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        return fecha.format(formato);
	    }

	    public static String desplegarMenu(String titulo, String[] opciones) {
	        System.out.println("========================================");
	        System.out.println(titulo);
	        System.out.println("========================================");
	        for (String op : opciones) {
	            System.out.println(op);
	        }
	        System.out.println("----------------------------------------");
	        System.out.print("Elige una opcion: ");
	        return scanner.nextLine();
	    }

	    // ==========================================
	    // SUBMENÚS Y MENÚ PRINCIPAL (Capítulo 4)
	    // ==========================================

}
