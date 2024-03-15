public class Teacher extends User{
    void verify() {
        System.out.println("Verifying thru phone.");
        set_verified(true);
    }
}
