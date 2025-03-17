public class UserFactory {
    public static User createUser(String userType, String firstName, String lastName, String email, String password, String userID) {
        switch (userType.toLowerCase()) {
            case "student":
                return new Student(firstName, lastName, email, password, userID);
            case "faculty":
                return new FacultyMember(firstName, lastName, email, password, userID);
            case "non-faculty staff":
                return new NonFacultyStaff(firstName, lastName, email, password, userID);
            case "manager":
                return new Manager(firstName, lastName, email, password, userID);
            case "visitor":
                return new Visitor(firstName, lastName, email, password, userID);
            default:
                throw new IllegalArgumentException("Invalid user type");
        }
        
    }
    
}
