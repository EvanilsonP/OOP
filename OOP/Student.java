public class Student extends User {
    void verify() {
        System.out.println("Verifying thru email.");
        set_verified(true);
    }
}
