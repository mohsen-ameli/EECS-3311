public class Visitor extends User {
    public Visitor(String username, String password, String userType, String firstName, String lastName,
            String email) {
        super(username, password, "Visitor", firstName, lastName, email);
    }
}
