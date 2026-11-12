package a2261330031_puntoventa2;

public class menuProductos {
	public static void menuProductos() {
        String[] opciones = {"1.-Modificar", "2.-Listado", "3.-Salida"};
        String opcion;
        
        do {
            opcion = desplegarMenu("Opciones de Productos", opciones);
            
            switch (opcion) {
                case "1":
                    System.out.println("Modificar Precio Producto");
                    break;
                case "2":
                    System.out.println("Listado Producto");
                    break;
                case "3":
                    System.out.println("Salida del Sistema");
                    break;
                default:
                    System.out.println("No existe esta opcion");
                    break;
            }
        } while (!opcion.equals("3"));
    }

}
