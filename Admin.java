import java.util.Scanner;

public class Admin extends Usuario {

    private Inventario inventario;
    Scanner teclado;

    public Admin(String nombre, int id, String direccion, Inventario inv){
        super(nombre, id, direccion);
        this.inventario = inv;
        this.teclado = new Scanner(System.in);
    }

    @Override
    public void imprimirRol(){
        System.out.println("Has iniciado como adminsitrador" + nombre);
    }

    // Metodo para añadir prodcuto
    public void añadirProducto() {
        System.out.println("--- Registro de Nuevo Producto ---");
        System.out.print("Nombre: ");
        String nom = teclado.nextLine();
        System.out.print("Tipo: ");
        String tipo = teclado.nextLine();
        System.out.print("Stock inicial: ");
        int stock = teclado.nextInt();
        System.out.print("Precio: ");
        double precio = teclado.nextDouble();
        teclado.nextLine(); // Limpiar el buffer

        // Crea el objeto de Producto
        Producto nuevo = new Producto(nom, tipo, stock, precio);
        // Entrega el producto al inventario
        inventario.añadirProducto(nuevo);
    }

    // Metodo para actualizar el inventario
    public void abastecerTienda(){
        System.out.println("Nombre del producto a reabastecer: ");
        String nombre = teclado.nextLine();
        Producto producto = inventario.buscarProducto(nombre);

        if(producto != null){
            System.out.println("Stock actual: "  + producto.getStock());
            System.out.println("¿Cuantas unidades?: ");
            int cantidad = teclado.nextInt();
            teclado.nextLine(); // Limpiamos el buffer

            if(producto.getStock() >= cantidad){
                producto.setStock(producto.getStock() - cantidad);
                System.out.println("Venta reazlizada con éxito.");
            }else {
                System.out.println("No hay suficiente stock.");
            }
        }else {
            System.out.println("No existe el producto: " + nombre);
        }
    }

    public void eliminarProducto(){
        System.out.println("Que elemento deseas elimnar");
        System.out.println("Nombre: ");
        String nom = teclado.nextLine();

        inventario.eliminarProducto(nom);
    }

    public void realizarVenta(){
        System.out.println("Producto a vender: ");
        String nombre = teclado.nextLine();
        Producto producto = inventario.buscarProducto(nombre);

        if(producto != null){
            System.out.println("Cantidad a vender: ");
            int cantidad = teclado.nextInt();
            teclado.nextLine(); // Limpiamos el buffer

            if(producto.getStock() >= cantidad){
                DetalleVenta detalle = new DetalleVenta(producto, cantidad);
                Pedido nuevoPedido = new Pedido(1);
                nuevoPedido.agregarCarrito(detalle);

                producto.setStock(producto.getStock() - cantidad); // Resta del inventario
                // Confirmar Venta
                Vender cajero = new Vender();
                cajero.confirmarVenta(nuevoPedido);
            }else {
                System.out.println("No hay suficiente stock.");
            }
        } else {
            System.out.println("No existe el producto: " + nombre + " no existe.");
        }

    }

    public void consultarPedidos(){
        inventario.listarProductos();
    }

}
