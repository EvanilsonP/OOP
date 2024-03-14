public class OOP {
    public static void main(String[] args) {
        User u = new User("Caleb", "Silver");

        System.out.println(u.toString()); //  method overring is printing Caleb and Silver

        // System.out.println(u.get_name());
        // System.out.println(u.get_membership());

        
        // System.out.println(u2.get_name()); // null
        // System.out.println(u2.get_membership()); // Bronze
    }
}