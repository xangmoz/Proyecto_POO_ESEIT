import java.util.ArrayList;

public class User {
    public String name, address;
    public int id;

    ArrayList<User> userList;

    // Contructor usuario
    public User(){
        userList = new ArrayList<>();
    }

    public void addUser(Admin user){
        userList.add(user);
    }


}
