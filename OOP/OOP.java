
public class OOP {
    public static void main(String[] args) {
        User u = new User();
        u.name = "Caleb";
        u.membership = "Gold";

        User u2 =  new User();
        u2.name = "Sally";
        u2.membership = "Silver";

        System.out.println(u.name);
        System.out.println(u2.name);
    }
}