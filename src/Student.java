public class Student extends RegisteredUser {
    private String studentID;
    
    public Student(String firstName, String lastName, String email, String password, String studentID) {
        super(firstName, lastName, email, password, "Student");
        this.studentID = studentID;

    }
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
