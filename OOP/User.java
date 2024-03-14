class User {
    private String name;
    String membership;

    // Setter
    void set_name(String name) {
        System.out.println("Logging to log file...");
        this.name = name;
    }

    // Getter
    String get_name() {
        return name;
    }
}