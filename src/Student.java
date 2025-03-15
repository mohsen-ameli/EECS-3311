public class Student extends RegisteredUser {
    private String studentID;
    private double hourlyRate = 5.0;
    
    public Student(String firstName, String lastName, String email, String password, String studentID) {
        super(firstName, lastName, email, password);
        this.studentID = studentID;
        this.userType = "Student";
    }
    
    public String getStudentID() {
        return studentID;
    }
    
    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public boolean login() {
        // TODO Auto-generated method stub
        return false;

    }

    @Override
    public boolean logout() {
        // TODO Auto-generated method stub
        return false;
    }
}
