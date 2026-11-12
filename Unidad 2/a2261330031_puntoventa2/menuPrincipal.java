package a2261330031_puntoventa2;

public class menuPrincipal {
	public static void menuPrincipal() {
        String[] opciones = {"1.-Productos", "2.-Punto de Venta", "3.-Inventario", "4.-Ventas", "5.-Salida"};
        String opcion;
        
        do {
            opcion = desplegarMenu("Menu de Punto de Tienda de Abarrotes la Pequeña (Matrícula: a2261330031)", opciones);
            
            if (opcion == null || opcion.isEmpty()) {
                System.out.println("Opcion incorrecta");
            } else {
                switch (opcion) {
                    case "1":
                        menuProductos();
                        break;
                    case "2":
                        menuPuntoVenta(ultimoIdTicket);
                        break;
                    case "3":
                        menuInventario();
                        break;
                    case "4":
                        System.out.println("Ventas");
                        break;
                    case "5":
                        System.out.println("Salida del Sistema");
                        break;
                    default:
                        System.out.println("No existe esta opcion");
                        break;
                }
            }
        } while (!opcion.equals("5"));
    }

}
