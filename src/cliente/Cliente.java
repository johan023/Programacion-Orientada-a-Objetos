package cliente;

import interfaz.IMostrable;

public class Cliente implements IMostrable{

    private String correo;
    private String nombre;
    private String apellidos;
    private String direccion;

    // Constructor
    public Cliente(String correo, String nombre, String apellidos, String direccion) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    // Getters y setters
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    // Interfaz IMostrable
    public String dameCadena() {
        return "Cliente: " + nombre + " " + apellidos + " - Correo: " + correo;
    }

}
