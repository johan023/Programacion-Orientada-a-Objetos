package cliente;

import java.util.ArrayList;

public class GestorUsuarios {
	private ArrayList<ClienteRegistrado> listaUsuariosRegistrados;

    public GestorUsuarios() {
        this.listaUsuariosRegistrados = new ArrayList<>();
        cargarUsuariosRegistrados();
    }
    
    private void cargarUsuariosRegistrados() {
        ArrayList<ClienteRegistrado> usuariosRegistrados = ClienteRegistrado.obtenerElementos();
        for (ClienteRegistrado usuario : usuariosRegistrados) {
            agregarUsuario(usuario);
        }
    }

    // Añadimos un nuevo usuario registrado
    public void agregarUsuario(ClienteRegistrado usuario) {
        listaUsuariosRegistrados.add(usuario);
    }

    public boolean validarCredenciales(String correo, String password) {
        for (ClienteRegistrado usuario : listaUsuariosRegistrados) {
            if (usuario.getCorreo().equals(correo) && usuario.getContrasena().equals(password)) {
                return true; 
            }
        }
        return false; 
    }
    
    public String obtenerNombreUsuario(String correo) {
    	for (ClienteRegistrado usuario : listaUsuariosRegistrados) {
            if (usuario.getCorreo().equals(correo)) {
                return usuario.getUsuario(); 
            }
        }
        return null; 
    }
}