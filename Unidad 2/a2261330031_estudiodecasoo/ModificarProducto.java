package a2261330031_estudiodecasoo;

public class ModificarProducto {
	public static void ModificarProducto(String[][] vproductos) throws IOException {
	    String codigo, precio;
	    int posicion;
	    String info = MostrarLista(vproductos);
	    codigo = Leer(info + "\nIntroduce el codigo del producto a modificar");
	    if (codigo != null) {
	        posicion = ExisteProducto(codigo, vproductos);
	        if (posicion > -1) {
	            String[] vproducto = {
	                vproductos[posicion][0],
	                vproductos[posicion][1],
	                vproductos[posicion][2],
	                vproductos[posicion][3]
	            };
	            precio = Leer("\nIntroduce el precio de " + MostrarProducto(vproducto) + " ");
	            if (precio != null) {
	                if (EvaluarNumerico(precio, 2) || EvaluarNumerico(precio, 1))
	                    productos[posicion][2] = precio;
	                else
	                    System.out.println("no es un valor numerico");
	            } else
	                System.out.println(" dato nulo");
	        } else
	            System.out.println("no existe el codigo");
	    } else
	        System.out.println(" dato nulo");
	}

}
