package producto;

import interfaz.IMostrable;

public class Alimentacion extends Producto {
	private String fechaCaducidad;

    public Alimentacion(String codigo, String descripcion, double precioNeto, String fechaCaducidad) {
        super(codigo, descripcion, precioNeto, Categoria.ALIMENTACION);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}

