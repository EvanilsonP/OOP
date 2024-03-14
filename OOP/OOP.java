import java.util.ArrayList;

public class OOP {
    public static void main(String[] args) {
        // User u = new User("Caleb", "Silver");
        User u = new User();

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Caleb"));
        users.add(new User("Maria"));
        users.add(new User("Sally"));

        for(int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).get_name());
        }

        // or
        
        for(User user : users) {
            System.out.println(user.get_name());
        }

        System.out.println(users.get(0).get_name());

        // System.out.println(u.toString()); //  method overring is printing Caleb and Silver
        // System.out.println(u.get_name());
        // System.out.println(u.get_membership());
    }
}