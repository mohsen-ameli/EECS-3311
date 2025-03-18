public class NonFacultyStaff extends RegisteredUser {

    public NonFacultyStaff(String username, String password, String userType, String firstName, String lastName,
            String email) {
        super(username, password, "Non Faculty Staff", firstName, lastName, email);
    }

}
