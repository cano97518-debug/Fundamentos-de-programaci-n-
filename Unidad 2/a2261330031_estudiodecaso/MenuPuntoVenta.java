package a2261330031_estudiodecaso;

public class MenuPuntoVenta {
	public static void MenuPuntoVenta(String idticket) throws IOException 
	{
	    String opcion, membrete; 
	    Boolean pago = false; 
	    idticket = IdTicketSiguiente(idticket);
	    String fechadia = Fecha();
	    membrete = "Fecha del Dia " + fechadia + " Ticket No " + idticket; 
	    membrete = membrete + "\n-----------------------------------------------------\n"; 
	    String[] datosmenu = { "1.-Agregar ", "2.-Eliminar ", "3.-Listado ", "4.-Pagar ", "5.-Salida " }; 
	    do
	    { 
	        opcion = DesplegarMenu(membrete + "\n Menu de Punto de Venta", datosmenu); 
	        if (opcion == null)
	            System.out.println("dato incorrecto introducido"); 
	        else 
	            switch (opcion) 
	            { 
	                case "1": System.out.println("Agregar Articulo al Ticket "); break; 
	                case "2": System.out.println("Eliminar Articulo del Ticket "); break; 
	                case "3": System.out.println("Listado de Articulos del Ticket "); break; 
	                case "4": 
	                    System.out.println("Pagar Ticket y salir"); 
	                    opcion = "5"; 
	                    pago = true; 
	                    break;
	                case "5": 
	                    System.out.println("Salida del Ventas "); 
	                    if (!pago) 
	                    { 
	                        System.out.println("No pago el ticket ");
	                        System.out.println("eliminando tickte" + idticket); 
	                    }
	                    break; 
	                default: 
	                    System.out.println("No existe esta opcion"); 
	                    break; 
	            } 
	    } while (opcion.compareTo("5") != 0); 
	}

}
