public class Visitor extends User {
    public Visitor(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);
        this.userType = "Visitor";
    }

    @Override
    public boolean register() {
        return false;
    }

    @Override
    public boolean login() {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}
