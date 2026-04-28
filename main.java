public class main {

     static void main(String[] args){

       Admin Jose = new Admin("Jose", 12345, "La casa", new Inventario());

       Jose.imprimirRol();

       Jose.añadirProducto();

       // Cambiar al manera de actualizar los datos
       Jose.realizarVenta("lentejas", 7);

    }

}

