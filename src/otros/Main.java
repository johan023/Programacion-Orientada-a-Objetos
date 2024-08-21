package otros;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

import cliente.ClienteRegistrado;
import cliente.GestorUsuarios;
import excepciones.ContrasenaCortaException;
import menu.Login;
import menu.MenuBienvenida;
import menu.SignIn;
import pago.MetodoPago;
import producto.Alimentacion;
import producto.Categoria;
import producto.Disco;
import producto.Libro;
import producto.Producto;


public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        
        MetodoPago metodoPago = null;
        FormaEnvio formaEnvio = null;
        String direccionEnvio = null;
        
        Pedido pedido = new Pedido(new ArrayList<>(), metodoPago, direccionEnvio, formaEnvio);

        while (!salir) {
            MenuBienvenida.inicio();

            String opcion = scanner.nextLine().toUpperCase();

            switch (opcion) {
                case "R":
                    Login.Entrar(gestorUsuarios, scanner);
                    break;

                case "A":
                    SignIn.Alta(gestorUsuarios, scanner);
                    break;
                    
                case "I":                    
                    Compra.menuCompra();
                    break;
                    
                case "S":
                    salir = true; 
                    break; 
                    
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }
}


