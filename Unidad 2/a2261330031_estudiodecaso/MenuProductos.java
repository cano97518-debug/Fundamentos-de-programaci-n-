package a2261330031_estudiodecaso;

public class MenuProductos. {
	public static void MenuProductos() throws IOException 
	{ 
	    String[] datosmenuproductos = { "1.-Modificar ", "2.-Listado ", "3.-Salida " }; 
	    String opcion = "0"; 
	    do
	    {
	        opcion = DesplegarMenu("Opciones de Productos", datosmenuproductos); 
	        if (opcion == null) 
	            System.out.println("opcion incorrecta ");
	        else
	            switch (opcion) 
	            { 
	                case "1": System.out.println ("Modificar Precio Producto "); break; 
	                case "2": System.out.println ("Listado Producto "); break; 
	                case "3": System.out.println("Salida del Sistema "); break; 
	                default: System.out.println("No existe esta opcion "); break; 
	            } 
	    } 
	    while (opcion.compareTo("3") != 0); 
	}

}
