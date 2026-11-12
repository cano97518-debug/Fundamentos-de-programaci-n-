package a2261330031_puntoventa2;

public class menuInventario {
	public static void menuInventario() {
        String[] opciones = {"1.-Listado", "2.-Agregar", "3.-Salida"};
        String opcion;
        
        do {
            opcion = desplegarMenu("Opciones de Inventarios", opciones);
            
            switch (opcion) {
                case "1":
                    System.out.println("Listado de Inventario");
                    break;
                case "2":
                    System.out.println("Agregar Inventario");
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
