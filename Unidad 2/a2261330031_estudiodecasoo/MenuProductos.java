package a2261330031_estudiodecasoo;

public class MenuProductos {
	public static void MenuProductos(String[][] vproductos) throws IOException {
	    String[] datosmenuproductos = { "1.-Modificar ", "2.-Listado ", "3.-Salida " };
	    String opcion = "0";
	    do {
	        opcion = DesplegarMenu("Opciones de Productos", datosmenuproductos);
	        if (opcion == null)
	            System.out.println("opcion incorrecta ");
	        else
	            switch (opcion) {
	                case "1":
	                    ModificarProducto(vproductos);
	                    break;
	                case "2":
	                    System.out.println(MostrarLista(vproductos));
	                    break;
	                case "3":
	                    System.out.println("Salida del Sistema ");
	                    break;
	                default:
	                    System.out.println("No existe esta opcion ");
	                    break;
	            }
	    } while (opcion.compareTo("3") != 0);
	}

}
