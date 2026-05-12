public class DetalleVenta {
    private Producto producto;
    private int cantidad;
    private double subtotal;

    public DetalleVenta(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = producto.getPrecioProducto() * cantidad;
    }

    public void detalleVenta(){
        System.out.println(producto.getNombreProducto() +" x" +cantidad + "| Subtotal: $" + subtotal);
    }

    public double getSubtotal(){
        return subtotal;
    }
}
