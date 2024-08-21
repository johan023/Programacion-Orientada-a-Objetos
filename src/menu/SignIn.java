package menu;

import java.util.Scanner;

import cliente.ClienteRegistrado;
import cliente.GestorUsuarios;
import excepciones.ContrasenaCortaException;

public class SignIn {
	private static final String NOMBRE = "¿Cómo te llamas?\n";
	private static final String APELLIDOS = "¿Cuáles son tus apellidos?\n";
	private static final String DIRECCION = "¿Cual es tu direccion?\n";
	private static final String USUARIO = "¿Cual va a ser tu nombre de usuario?\n";
	private static final String CORREO = "¿Cual va a ser tu nombre de usuario?\n";
	
    public static void Nombre() {
        System.out.println(NOMBRE);
    }
    public static void Apellidos() {
        System.out.println(APELLIDOS);
    }
    public static void Direccion() {
        System.out.println(DIRECCION);
    }
    public static void Usuario() {
        System.out.println(USUARIO);
    }
    public static void Correo() {
        System.out.println(CORREO);
    }
	
	public static void Alta(GestorUsuarios gestorUsuarios, Scanner scanner) {
		Nombre();
        String nombre = scanner.nextLine();
        
        Apellidos();
        String apellidos = scanner.nextLine();
        
        Direccion();
        String direccion = scanner.nextLine();

        Usuario();
        String usuario = scanner.nextLine();
        
        Correo();
        String correo = scanner.nextLine();
        

        try {
            System.out.println("Contraseña (mínimo 8 caracteres): ");
            String contrasena = scanner.nextLine();
            
            if (contrasena.length() < 8) {
                throw new ContrasenaCortaException("ERROR: La contraseña debe tener al menos 8 caracteres.");
            }
            
            // Aquí se puede añadir a un nuevo cliente
            ClienteRegistrado nuevoUsuario = new ClienteRegistrado(correo, nombre, apellidos, direccion, usuario, contrasena);
            gestorUsuarios.agregarUsuario(nuevoUsuario);
            
            System.out.println("Registro exitoso!");
        } 
        catch (ContrasenaCortaException e) {
            System.out.println(e.getMessage());
        }
    }
}
