import java.util.List;

class User {

    private String name;
    private String membership = "Bronze";

    // Static methods
    public static void print_name_admins() {
        for(User user : User.admins) {
            System.out.println(user);
        }
    }

    // Static data members
    public static List<User> admins;
    
    // Method overriding
    public String toString() {
        return get_name() + " " + get_membership();
    }

    public User() {

    }
    // Generic List
    public User(String name) {
        set_name(name);
    }

    public User(String name, String membership) {
        set_name(name);
        set_membership(membership);
    }

    // Setter
    void set_name(String name) {
        this.name = name;
    }

    // Getter
    String get_name() {
        return name;
    }

    void set_membership(String membership) {
        this.membership = membership;
    }

    void set_membership(Membership membership) {
        // name() returns the name of the enum constant
        this.membership = membership.name();
    }

    public enum Membership {
        Bronze, Silver, Gold
    }
    

    String get_membership() {
        return membership;
    }

}