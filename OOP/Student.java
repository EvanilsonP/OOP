public class Student extends User {
    private boolean verified = false;

    void set_verified(boolean verified) {
        this.verified = verified;
    }

    boolean get_verified() {
        return verified;
    }
}
