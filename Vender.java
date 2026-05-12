public class Vender {
    public void confirmarVenta(Pedido pedido) {
        double totalFinal = 0;

        System.out.println("### Procesando venta ###");

        for(DetalleVenta detalle : pedido.getListaDetalle()) {
            totalFinal += detalle.getSubtotal();
        }
        System.out.println("Venta confirmda por un total de: $" + totalFinal);
        System.out.println("¡Gracias por su compra!");
    }
}
