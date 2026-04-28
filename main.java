public class main {

     static void main(String[] args){

       Admin Jose = new Admin("Jose", 12345, "La casa", new Inventario());

       Jose.imprimirRol();

       Jose.añadirProducto();

       Jose.realizarVenta("lentejas", 7);

    }

}

