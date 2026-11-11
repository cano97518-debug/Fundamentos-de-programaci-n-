package a2261330031_estudiodecaso;

public class MenuPrincipal {
	public static void MenuPrincipal() throws IOException 
	{ 
	    String[] datosmenuprincipal = { "1.-Productos ", "2.-Punto de Venta ", "3.-Inventario ", "4.-Salida ", "5.-Salida " }; 
	    String opcion = "0"; 
	    do
	    {
	        opcion = DesplegarMenu("Menu de Punto de Tienda de Abarrotes la Pequeña", datosmenuprincipal); 
	        if (opcion == null) 
	            System.out.println("opcion incorrecta ");
	        else
	            switch (opcion) 
	            { 
	                case "1": System.out.println (" Menu de Productos "); break; 
	                case "2": System.out.println (" Menu de Punto de Venta "); break; 
	                case "3": System.out.println (" Menu de Inventario "); break; 
	                case "4": System.out.println (" Ventas "); break; 
	                case "5": System.out.println("Salida del Sistema "); break; 
	                default: System.out.println("No existe esta opcion "); break; 
	            } 
	    } 
	    while (opcion.compareTo("5") != 0); 
	}

}
