package pago;

public class PayPal extends MetodoPago {

	private String codigoUsuario;
    private String fechaAlta;

    public PayPal(String descripcion, String codigoUsuario, String fechaAlta) {
        super(descripcion);
        this.codigoUsuario = codigoUsuario;
        this.fechaAlta = fechaAlta;
    }

    
    // Getters y setters
    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

}