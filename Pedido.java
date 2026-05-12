import java.util.ArrayList;

public class Pedido {
    // 1 Atributos
    private int idPedido;
    private ArrayList<DetalleVenta> listaDetalles;

    // Asociación dirigida hacia Producto
    private Producto producto;

    // 2 Constructor
    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        this.listaDetalles = new ArrayList<>();
    }

    // 3 Métodos

    public int agregarCarrito(DetalleVenta detalle) {
        listaDetalles.add(detalle);
        System.out.println("Prodcuto agrega al carrito");
        return 0;
    }

    public void mostrarPedido() {
        System.out.println("----- Pedido #" + idPedido + " -----");
        for (DetalleVenta detalle : listaDetalles) {
            detalle.detalleVenta();
        }
    }

    public ArrayList<DetalleVenta> getListaDetalle() {
        return listaDetalles;
    }
}