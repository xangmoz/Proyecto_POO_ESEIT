import java.util.ArrayList;

public abstract class Usuario {
    protected String nombre;
    protected int idUsuario;
    protected int rol;
    protected String direccion;


    // Contructor usuario
    public Usuario(String nombre, int id, String direccion){
        this.nombre = nombre;
        this.idUsuario = id;
        this.direccion = direccion;
    }

    public abstract void imprimirRol();

}
