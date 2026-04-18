import java.util.ArrayList;

public class Inventory {

    // Lista de prodcutos
    ArrayList<Product> productList;
    int counter;

    // Constructor
    public Inventory() {
       productList = new ArrayList<>();
    }

    // Agregando un objeto o producto a la lista
    public void addProduct(Product element) {

        productList.add(element);
    }

    public void queryProduct(){
        // Usamos .size() en lugar de counter
        for(int i = 0; i < productList.size(); i++){
            System.out.println(i);
            // Usamos .get(i) para obtener el objeto
            Product p = productList.get(i);
            System.out.println(p.productName);
            System.out.println(p.productType);
            System.out.println(p.productPrice);
            System.out.println(p.quantity);
            System.out.println();
        }
    }

//    public void deleteProduct() {
//        productList.remove();
//    }

//    public void setQuantity(int id, int quantity) {
//
//        this.quantity = quantity;
//    }

}

