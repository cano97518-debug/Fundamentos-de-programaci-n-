package a2261330031_puntoventa2;

public class menuPuntoVenta {
	public static void menuPuntoVenta(int idticketActual) {
        String idticket = idTicketSiguiente(idticketActual);
        String fechadia = fechaActual();
        String membrete = "Fecha del Dia " + fechadia + " Ticket No " + idticket;
        
        String[] opciones = {"1.-Agregar", "2.-Eliminar", "3.-Listado", "4.-Pagar", "5.-Salida"};
        String opcion;
        
        do {
            opcion = desplegarMenu(membrete + "\nMenu de Punto de Venta", opciones);
            
            switch (opcion) {
                case "1":
                    System.out.println("Agregar Articulo al Ticket");
                    break;
                case "2":
                    System.out.println("Eliminar Articulo del Ticket");
                    break;
                case "3":
                    System.out.println("Listado de Articulos del Ticket");
                    break;
                case "4":
                    System.out.println("Pagar Ticket y salir");
                    opcion = "5";
                    break;
                case "5":
                    System.out.println("Salida del Ventas");
                    break;
                default:
                    System.out.println("No existe esta opcion");
                    break;
            }
        } while (!opcion.equals("5"));
    }

}
