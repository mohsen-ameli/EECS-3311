import java.util.UUID;

public class Student extends RegisteredUser {
    private String studentID;
    
    public Student(String firstName, String lastName, String email, String password, String studentID) {
        super(firstName, lastName, email, password);
        this.studentID = studentID;
        this.userType = "Student";
    }
    
    public String getStudentID() {
        return UUID.randomUUID().toString();
    }
}
