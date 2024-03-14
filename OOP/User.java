class User {

    private String name;
    private String membership;

    // Setter
    void set_name(String name) {
        System.out.println("Logging to log file...");
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