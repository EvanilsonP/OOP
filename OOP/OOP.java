public class OOP {
    public static void main(String[] args) {
        User u = new User("Caleb", "Gold");
        User u2 = new User();

        System.out.println(u.get_name());
        System.out.println(u.get_membership());

        
        System.out.println(u2.get_name()); // null
        System.out.println(u2.get_membership()); // Bronze
    }
}