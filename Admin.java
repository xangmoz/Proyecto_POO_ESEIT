import java.util.Scanner;

public class Admin extends Usuario {

    private Inventario inventario;
    private Scanner teclado;

    public Admin(String nombre, int id, String direccion, Inventario inv){
        super(nombre, id, direccion);
        this.inventario = inv;
        this.teclado = new Scanner(System.in);
    }

    @Override
    public void imprimirRol(){
        System.out.println("Has iniciado como adminsitrador" + nombre);
    }

    public void realizarVenta(String nombreProd, int cantidad){
        System.out.println("Admin " + this.nombre + " procesando venta...");

        inventario.actualizarStock(nombreProd, cantidad);
    }

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
}
