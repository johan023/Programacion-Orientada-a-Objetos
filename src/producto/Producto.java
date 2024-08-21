package producto;

import java.text.DecimalFormat;

import interfaz.IMostrable;

public class Producto implements IMostrable {
	private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioNeto;
    private double porcentajeImpuesto;
    private Categoria categoria;
    
    private static final double IMPUESTO_ALIMENTACION = 4.00;
    private static final double IMPUESTO_LIBRO = 10.00;
    private static final double IMPUESTO_DISCO = 21.00;

    public Producto(String codigo, String descripcion, double precioNeto, Categoria categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioNeto = precioNeto;
        this.categoria = categoria;
        // Porcentaje de impuesto predeterminado según la categoría
        this.porcentajeImpuesto = obtenerPorcentajeImpuesto(categoria);
    }

    // Métodos para obtener y establecer los atributos

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(double precioNeto) {
        this.precioNeto = precioNeto;
    }

    public double getPorcentajeImpuesto() {
        return porcentajeImpuesto;
    }

    public void setPorcentajeImpuesto(double porcentajeImpuesto) {
        this.porcentajeImpuesto = porcentajeImpuesto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Aquí implementamos la interfaz IMostrable
    public String dameCadena() {
        DecimalFormat formatoDecimal = new DecimalFormat("0.00");
        double precioFinal = calcularPrecioProducto();
        return codigo + " " + descripcion +
               " " + formatoDecimal.format(precioNeto) + " EUR" +
               " " + formatoDecimal.format(precioNeto * porcentajeImpuesto/100) + " EUR" +
               " " + formatoDecimal.format(precioFinal) + " EUR";
    }

    public double calcularPrecioProducto() {
        return precioNeto * (1 + porcentajeImpuesto/100);
    }

    private double obtenerPorcentajeImpuesto(Categoria categoria) {
        switch (categoria) {
            case ALIMENTACION:
                return IMPUESTO_ALIMENTACION;
            case LIBRO:
                return IMPUESTO_LIBRO;
            case DISCO:
                return IMPUESTO_DISCO;
            default:
                return 21.00;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
