public class main {

     static void main(String[] args){

         // Agregamos productos

        Product product1 = new Product("lentejas", "comestibles", 20, 2500);
        Product product2 = new Product("res", "carnico", 20, 7000);

        Inventory inventory1 = new Inventory();
        inventory1.addProduct(product1);
        inventory1.addProduct(product2);

        // Imprimimos los productos
        inventory1.queryProduct();


        // Agregamos los usuarios
        Admin user1 = new Admin("Andres", "Calle 3 sur # 4G - 72", 1022771023);

        User usuario1 = new User();
        usuario1.addUser(user1);


    }

}

