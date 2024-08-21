package otros;

import java.text.DecimalFormat;
import java.util.ArrayList;

import pago.MetodoPago;
import producto.Producto;

public class Pedido {
	private static final String PRODUCTO_AGREGADO = "Producto agregado al pedido.\n";
    private static final String PEDIDO_VACIADO = "Pedido vaciado.\n";
    private static final String PEDIDO_TOTAL = 
    		"-----------------------------------\n" + 
    		"Listado de productos seleccionados:\n" +
    		"-----------------------------------\n" +
    		"CODIGO DESCRIPCION PRECIO_NETO CANTIDAD IMPUESTO PRECIO_PRODUCTO TOTAL\n";

    
    public static void producto_agregado() {
    	System.out.println(PRODUCTO_AGREGADO);
    }
    public static void pedido_vaciado() {
    	System.out.println(PEDIDO_VACIADO);
    }
    public static void pedido_total() {
    	System.out.println(PEDIDO_TOTAL);
    }
    
	
	private int contadorPedidos = 0;

    private int numeroPedido;
    private ArrayList<Producto> productos;
    private MetodoPago metodoPago;
    private String direccionEnvio;
    private FormaEnvio formaEnvio;

    public Pedido(ArrayList<Producto> productos, MetodoPago metodoPago, String direccionEnvio, FormaEnvio formaEnvio) {
        this.productos = productos;
        this.metodoPago = metodoPago;
        this.direccionEnvio = direccionEnvio;
        this.formaEnvio = formaEnvio;
        this.numeroPedido = ++contadorPedidos;
        
        productos = new ArrayList<>();
    }
    
    // Getters y setters
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public FormaEnvio getFormaEnvio() {
        return formaEnvio;
    }

    public void setFormaEnvio(FormaEnvio formaEnvio) {
        this.formaEnvio = formaEnvio;
    }

    
    // Métodos para cálculo del total del pedido

    public double calcularTotalNeto() {
        double totalNeto = 0;
        for (Producto producto : productos) {
            totalNeto += producto.getPrecioNeto();
        }
        return totalNeto;
    }

    public double calcularTotalImpuestos() {
        double totalImpuestos = 0;

        for (Producto producto : productos) {
            double impuesto = producto.getPrecioNeto() * producto.getPorcentajeImpuesto() / 100;
            totalImpuestos += impuesto;
        }

        return totalImpuestos;
    }

    public double calcularCostoEnvio() {
        return formaEnvio.getCostoEnvio();
    }

    public double calcularTotalPedido() {
        double totalPedido = 0;

        for (Producto producto : productos) {
            double impuesto = producto.getPrecioNeto() * producto.getPorcentajeImpuesto() / 100;
            double totalProducto = (producto.getPrecioNeto() + impuesto) * producto.getCantidad();
            totalPedido += totalProducto;
        }

        return totalPedido;
    }
    
    public double calcularTotalPedidoMasEnvio() {
        return calcularTotalPedido() + calcularCostoEnvio();
    }
    
    public void mostrarProductosEnPedido() {
    	DecimalFormat df = new DecimalFormat("#.##");

    	pedido_total();
        double totalPedido = 0.00;

        for (Producto producto : productos) {
            double impuesto = producto.getPrecioNeto() * producto.getPorcentajeImpuesto() / 100;
            double totalProducto = (producto.getPrecioNeto() + impuesto) * producto.getCantidad();
            totalPedido += totalProducto;

            String impuestoFormateado = df.format(impuesto);
            String totalProductoFormateado = df.format(totalProducto);

            System.out.println(
                producto.getCodigo() + " " +
                producto.getDescripcion() + " " +
                df.format(producto.getPrecioNeto()) + " " +
                producto.getCantidad() + " " +
                impuestoFormateado + " " +
                df.format(producto.getPrecioNeto() + impuesto) + " " +
                totalProductoFormateado
            );
        }
        
        String totalPedidoFormateado = df.format(totalPedido);

        System.out.println("-----------------------------------");
        System.out.println("IMPORTE TOTAL: " + totalPedidoFormateado + " EUR");
        System.out.println("-----------------------------------");
    }
    
    
    
    public void agregarProducto (Producto producto, int cantidad) {
    	producto.setCantidad(cantidad);
        productos.add(producto);
        producto_agregado();
        mostrarProductosEnPedido();
    }
    
    public void vaciarPedido() {
        productos.clear();
        pedido_vaciado();
    }
     
    
}
