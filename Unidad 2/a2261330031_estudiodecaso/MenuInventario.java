package a2261330031_estudiodecaso;

public class MenuInventario {
	public static void MenuInventario() throws IOException 
	{ 
	    String[] datosmenuinventario = { "1.-Listado ", "2.-Agregar ", "3.-Salida " }; 
	    String opcion = "0"; 
	    do {
	        opcion = DesplegarMenu("Opciones de Inventarios", datosmenuinventario); 
	        if (opcion == null) 
	            System.out.println("opcion incorrecta ");
	        else 
	            switch (opcion) 
	            { 
	                case "1": System.out.println ("Listado de Inventario "); break; 
	                case "2": System.out.println ("Agregar Inventario "); break; 
	                case "3": System.out.println("Salida del Sistema "); break; 
	                default: System.out.println("No existe esta opcion "); break; 
	            } 
	    } 
	    while (opcion.compareTo("3") != 0); 
	}

}
