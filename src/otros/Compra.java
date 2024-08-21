package otros;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cliente.GestorUsuarios;
import menu.MenuCompra;
import menu.MenuEnvio;
import pago.Envio;
import pago.MetodoPago;
import producto.Alimentacion;
import producto.AlmacenarProductos;
import producto.Disco;
import producto.Libro;
import producto.Producto;
import otros.Pedido;


public class Compra {
	public static void menuCompra() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			boolean salir = false;
			GestorUsuarios gestorUsuarios = new GestorUsuarios();
	        
	        MetodoPago metodoPago = null;
	        FormaEnvio formaEnvio = null;
	        String direccionEnvio = null;
	        
	        Pedido pedido = new Pedido(new ArrayList<>(), metodoPago, direccionEnvio, formaEnvio);
	        AlmacenarProductos productosDisponibles = new AlmacenarProductos();
	        
			MenuCompra.InicioCompra();

            String opcionUsuarioRegistrado = scanner.next().toUpperCase();
            
            switch (opcionUsuarioRegistrado) {
                case "L":
                    // Mostrar el contenido del carrito
                	ArrayList<Producto> productosEnPedido = pedido.getProductos();
                	
                	pedido.mostrarProductosEnPedido();
                	MenuCompra.Acciones();

                    String opcionListadoProductos = scanner.next().toUpperCase();

                    switch (opcionListadoProductos) {
                        case "F":
                            MenuEnvio.paso1();

                            String opcionEnvio = scanner.next().toUpperCase();

                            switch (opcionEnvio) {
                            case "1":
                            	//double costoEnvioHoy = 9.99; 
                            	//totalPedido += costoEnvioHoy; 
                            	
                            	Envio.procesoDeEnvio();
                                
                                break;
                            case "2":
                            	//double costoEnvio1Dia = 5.00; 
                               // totalPedido += costoEnvio1Dia;
                                
                                Envio.procesoDeEnvio();
                                
                                break;
                            case "3":
                            	//double costoEnvioExpress = 3.45;
                                //totalPedido += costoEnvioExpress;
                                
                                Envio.procesoDeEnvio();
                                
                                break;
                            case "4":
                            	Envio.procesoDeEnvio();
                            	
                                break;
                            case "V":
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                            }
                            break;
                        case "R":
                            break;
                        case "V":
                            break;
                        default:
                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                            break;
                    }
                    
                    break;
                    
                case "B":
                	while (true) {
                        MenuCompra.Categorias();

                        String opcionCategoria = scanner.next().toUpperCase();

                        switch (opcionCategoria) {
                            case "A":           	
                            	ArrayList<Producto> productosAlimentacion = AlmacenarProductos.obtenerProductosAlimentacion();
                                
                            	MenuCompra.DetallesProducto();
                            	
                                for (int i = 0; i < productosAlimentacion.size(); i++) {
                                    System.out.println((i + 1) + " " + productosAlimentacion.get(i).dameCadena());
                                }

                                while (true) {
                                	MenuCompra.Agregar();
    	                            
    	                            String opcionProducto = scanner.next().toUpperCase();

                                    switch (opcionProducto) {
                                        case "A":
                                        	System.out.print("Indique la línea del pedido: ");
                                            int lineaPedido = scanner.nextInt();

                                            Producto productoSeleccionado = productosAlimentacion.get(lineaPedido - 1); // Restamos 1 para ajustarnos al índice de la lista

                                            System.out.print("¿Cuantas unidades desea?: ");
                                            int cantidad = scanner.nextInt();

                                            pedido.agregarProducto(productoSeleccionado, cantidad);

                                            break;
                                        case "V":
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                    if (opcionProducto.equals("V")) {
                                        break; 
                                    }
                                }
                                
                                break; 

                            case "L":
                            	ArrayList<Producto> productosLibros = AlmacenarProductos.obtenerProductosLibros();

                            	MenuCompra.DetallesProducto();
                                for (int i = 0; i < productosLibros.size(); i++) {
                                    System.out.println((i + 1) + " " + productosLibros.get(i).dameCadena());
                                }

                                while (true) {
                                    MenuCompra.Agregar();
    	                            
    	                            String opcionProducto = scanner.next().toUpperCase();

                                    switch (opcionProducto) {
                                        case "A":
                                            System.out.print("Indique la línea del pedido: ");
                                            int lineaPedido = scanner.nextInt();

                                            Producto productoSeleccionado = productosLibros.get(lineaPedido - 1); // Restamos 1 para ajustarnos al índice de la lista

                                            System.out.print("¿Cuantas unidades desea?: ");
                                            int cantidad = scanner.nextInt();

                                            pedido.agregarProducto(productoSeleccionado, cantidad);

                                            break;
                                        case "V":
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                    if (opcionProducto.equals("V")) {
                                        break; 
                                    }
                                }
                            	
                                break;
                            case "D":
                            	ArrayList<Producto> productosDiscos = AlmacenarProductos.obtenerProductosDiscos();
                            		
                            	MenuCompra.DetallesProducto();
                                for (int i = 0; i < productosDiscos.size(); i++) {
                                    System.out.println((i + 1) + " " + productosDiscos.get(i).dameCadena());
                                }

                                while (true) {
                                	MenuCompra.Agregar();
    	                            
    	                            String opcionProducto = scanner.next().toUpperCase();

                                    switch (opcionProducto) {
                                        case "A":
                                            System.out.print("Indique la línea del pedido: ");
                                            int lineaPedido = scanner.nextInt();

                                            Producto productoSeleccionado = productosDiscos.get(lineaPedido - 1); // Restamos 1 para ajustarnos al índice de la lista

                                            System.out.print("¿Cuantas unidades desea?: ");
                                            int cantidad = scanner.nextInt();

                                            pedido.agregarProducto(productoSeleccionado, cantidad);

                                            break;
                                        case "V":
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                    if (opcionProducto.equals("V")) {
                                        break;
                                    }
                                }
                            	
                                break;
                            case "V":
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                        }
                        
                        if (opcionCategoria.equals("V")) {
                            break;
                        }
                    }

                    break;
                case "S":
                	// Salir del programa
                	salir = true;
                    System.exit(0);
                    break; 
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            
            if (salir || opcionUsuarioRegistrado.equals("S")) {
                break;
            }
    	}
	}
}
