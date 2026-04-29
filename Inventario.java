import java.util.ArrayList;

public class Inventario {

    // Lista de prodcutos
    private ArrayList<Producto> listaProductos;

    // Constructor
    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    // Agregando un objeto o producto a la lista
    public void añadirProducto(Producto p) {
        listaProductos.add(p);
        System.out.println("Producto agregado");
    }

    public void eliminarProducto(String nombre) {
        for (Producto p : listaProductos) {
            if (p.getNombreProducto().equalsIgnoreCase(nombre)) {
                listaProductos.remove(p);

                System.out.println("Producto " + nombre + " eliminado");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }


    public void actualizarStock(String nombre, int nuevaCantidad) {
        for (Producto p : listaProductos) {
            if (p.getNombreProducto().equalsIgnoreCase(nombre)) {
                p.setStock(nuevaCantidad);

                System.out.println("Stock actualizado para: " + nombre);
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void listarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("--- LISTA DE INVENTARIO---");
        }

        for (Producto p : listaProductos) {
            p.consultar();
        }
    }
}
