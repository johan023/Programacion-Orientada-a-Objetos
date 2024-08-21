package cliente;

import java.util.ArrayList;

public class ClienteRegistrado extends Cliente {
	
	private String usuario;
	private String contrasena;
    private ArrayList<String> formasDePago;
    private ArrayList<String> direccionesEnvio;

    public ClienteRegistrado(String correo, String nombre, String apellidos, String direccion, String usuario, String contrasena) {
        super(correo, nombre, apellidos, direccion);
        this.contrasena = contrasena;
        this.formasDePago = new ArrayList<>();
        this.direccionesEnvio = new ArrayList<>();
    }
    
    // Para almacenar algunos clientes registrados
    public static ArrayList<ClienteRegistrado> obtenerElementos() {
        ArrayList<ClienteRegistrado> array = new ArrayList<ClienteRegistrado>();

        array.add(new ClienteRegistrado("pepe.martinez@hotmail.com", "Pepe", "Martinez", "C/Arca, 2", "popepe", "p0p3p3tripleP"));
        array.add(new ClienteRegistrado("merygomez@gmail.com", "Maria", "Gomez", "Av. Salamanca, 137", "merygomez", "meryxula123"));
        array.add(new ClienteRegistrado("juan.perez@outlook.com", "Juan", "Perez", "C/Alicante, 12", "juanpe", "juANpeREZ@"));
        array.add(new ClienteRegistrado("laura.lofish@gmail.com", "Laura", "Lopez", "C/Vicente Ferrer, 14", "lauralofish", "zepol,@,@"));
        array.add(new ClienteRegistrado("carlos.rodriguez@gmail.com", "Carlos", "Rodriguez", "Av. Novelda, 40", "carlosrodri", "usu5carlitos"));
        array.add(new ClienteRegistrado("sofia.cruz@gmail.com", "Sofia", "Cruz", "C/Gran Via, 23", "sofiacruz", "s0fia123x"));
        array.add(new ClienteRegistrado("david.garcia@hotmail.com", "David", "Garcia", "C/Alcantarilla, 8", "davidgarcia", "Dav!d01234"));
        array.add(new ClienteRegistrado("ana.lopez@gmail.com", "Ana", "Lopez", "C/Ceuta, 15", "analopez", "anita789#"));
  
        return array;
    }

    
    // Getters y setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena; 
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList<String> getFormasDePago() {
        return formasDePago;
    }

    public void agregarFormaDePago(String formaDePago) {
        this.formasDePago.add(formaDePago);
    }

    public ArrayList<String> getDireccionesEnvio() {
        return direccionesEnvio;
    }

    public void agregarDireccionEnvio(String direccionEnvio) {
        this.direccionesEnvio.add(direccionEnvio);
    }

    

}