package otros;

public class FormaEnvio {
	private String descripcion;
    private double costoEnvio;
    private int plazoEntrega;
    private String descripcionDetallada;

    public FormaEnvio(String descripcion, double costoEnvio, int plazoEntrega, String descripcionDetallada) {
        this.descripcion = descripcion;
        this.costoEnvio = costoEnvio;
        this.plazoEntrega = plazoEntrega;
        this.descripcionDetallada = descripcionDetallada;
    }

    
    // Getters y setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public int getPlazoEntrega() {
        return plazoEntrega;
    }

    public void setPlazoEntrega(int plazoEntrega) {
        this.plazoEntrega = plazoEntrega;
    }

    public String getDescripcionDetallada() {
        return descripcionDetallada;
    }

    public void setDescripcionDetallada(String descripcionDetallada) {
        this.descripcionDetallada = descripcionDetallada;
    }
}
