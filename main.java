import java.lang.classfile.instruction.SwitchCase;

public class main {

     static void main(String[] args){
        Inventario tienda = new Inventario();
        Admin jefe = new Admin("Jose", 123, "direccion", tienda);

        int opcion = 0;
        while (opcion != 4) {
            TaskListCustomer task = new TaskListCustomer();
            task.taskList();

            int op = jefe.teclado.nextInt();
            jefe.teclado.nextLine(); // Limpiamos el buffer

            switch (op){
                case 1: jefe.añadirProducto(); break;
                case 2: tienda.listarProductos(); break;
                case 3: jefe.realizarVenta(); break;
                case 4: opcion = 4; break;
                default: System.out.println("Opción no valida.");
            }
        }

    }

}

