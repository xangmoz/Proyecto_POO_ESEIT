package Parcial2;

public class Pedido {
    // 1 Atributos
    private int idPedido;
    private Cliente cliente; 
    private String nombrePedido;
    private int cantidad;
    
    // Asociación dirigida hacia Producto
    private Producto producto; 

    // 2 Constructor
    public Pedido(int idPedido, Cliente cliente, String nombrePedido, int cantidad, Producto producto) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.nombrePedido = nombrePedido;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    // 3 Métodos
    
    public int agregarCarrito() {
        // TODO: Implementar la lógica para agregar al carrito
        return 0; 
    }

    public void crearPedido() {
        // TODO: Implementar la lógica para confirmar o inicializar el pedido
    }

    public void eliminarPedido() {
        // TODO: Implementar la lógica para anular o borrar este pedido
    }

    // 4. Getters y Setters

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombrePedido() {
        return nombrePedido;
    }

    public void setNombrePedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}