public class Admin extends Usuario {

    private Inventario inventario;

    public Admin(String nombre, int id, String direccion, Inventario inv){
        super(nombre, id, direccion);
        this.inventario = inv;
    }

    @Override
    public void imprimirRol(){
        System.out.println("Has iniciado como adminsitrador");
    }

    public void realizarVenta(String nombreProd, int cantidad){
        System.out.println("Admin " + this.nombre + " procesando venta...");
        inventario.actualizarStock(nombreProd, cantidad);
    }
}
