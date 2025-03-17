public class Student extends RegisteredUser {
    
    public Student(String firstName, String lastName, String email, String password, String userID) {
        super(firstName, lastName, email, password, "Student", userID);

    }
}
