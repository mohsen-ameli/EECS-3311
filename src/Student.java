public class Student extends RegisteredUser {    
    public Student(String firstName, String lastName, String email, String password, String studentID) {
        super(firstName, lastName, email, password);
        this.userType = "Student";
    }
}
