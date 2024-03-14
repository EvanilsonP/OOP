import java.util.ArrayList;

public class OOP {
    public static void main(String[] args) {
        // User u = new User("Caleb", "Silver");
        User u = new User();

        User.admins = new ArrayList<User>();

        User.admins.add(new User("Caleb"));
        User.admins.add(new User("Maria"));
        User.admins.add(new User("Sally"));

        for(int i = 0; i < User.admins.size(); i++) {
            System.out.println(User.admins.get(i).get_name());
        }

        // or

        for(User user : User.admins) {
            System.out.println(user.get_name());
        }

        System.out.println(User.admins.get(0).get_name());

        // System.out.println(u.toString()); //  method overring is printing Caleb and Silver
        // System.out.println(u.get_name());
        // System.out.println(u.get_membership());
    }
}