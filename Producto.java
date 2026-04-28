public class Producto {

    private String nombreProducto;
    private String tipoProducto;
    private int stock;
    private double precioProducto;

    public Producto(String nombre, String tipo, int cantidad, double precio) {
        this.setNombreProducto(nombre);
        this.setTipoProducto(tipo);
        this.setStock(cantidad);
        this.setPrecioProducto(precio);

    }

    // --- GETTERS ---

    public String getNombreProducto() {
        return nombreProducto; // Devuelve el nombre
    }

    public String getTipoProducto() {
        return tipoProducto; // Devuelve el tipo
    }

    public int getStock() {
        return stock; // Devuelve cuántas unidades hay
    }

    public double getPrecioProducto() {
        return precioProducto; // Devuelve el precio
    }

    // --- SETTERS ---

    public void setStock(int cantidad) {
        if (cantidad >= 0) {
            this.stock = cantidad; // Solo se asigna si es 0 o más
        } else {
            System.out.println("Error: El stock no puede ser negativo. Se asignará 0.");
            this.stock = 0;
        }
    }

    public void setPrecioProducto(double precio) {
        if (precio > 0) {
            this.precioProducto = precio; // Solo se asigna si el precio es mayor a 0
        } else {
            System.out.println("Error: El precio debe ser mayor a cero.");
        }
    }

    public void setNombreProducto(String nombre) {
        // .trim() quita los espacios al inicio y al final.
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombreProducto = nombre.trim();
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
            this.nombreProducto = "PRODUCTO SIN NOMBRE"; // Valor por defecto para no romper el sistema
        }
    }

    public void setTipoProducto(String tipo) {
        if (tipo != null && !tipo.trim().isEmpty()) {
            this.tipoProducto = tipo.trim().toLowerCase();
        } else {
            System.out.println("Error: El tipo de producto es obligatorio.");
            this.tipoProducto = "general"; // Un tipo por defecto
        }
    }

        // Metodo para mostrar información

        public void consultar () {
            System.out.println("Producto: " + nombreProducto + " | Tipo: " + tipoProducto +
                    " | Stock: " + stock + " | Precio: $" + precioProducto);
        }

    }



