public class UserFactory {
    public static User createUser(String username, String password, String userType, String firstName, String lastName,
            String email) throws IllegalArgumentException {
        switch (userType.toLowerCase()) {
            case "student":
                return new Student(username, password, userType, firstName, lastName, email);
            case "faculty":
                return new FacultyMember(username, password, userType, firstName, lastName, email);
            case "non faculty staff":
                return new NonFacultyStaff(username, password, userType, firstName, lastName, email);
            case "manager":
                return new Manager(username, password, userType, firstName, lastName, email);
            case "super manager":
                return SuperManager.getInstance(username, password, userType, firstName, lastName, email);
            case "visitor":
                return new Visitor(username, password, userType, firstName, lastName, email);
            default:
                throw new IllegalArgumentException("Invalid user type");
        }

    }

}
