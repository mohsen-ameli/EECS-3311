public class FacultyMember extends RegisteredUser {
    private String facultyID;
    private String department;
    private double hourlyRate = 8.0;
    
    public FacultyMember(String firstName, String lastName, String email, String password, 
                         String facultyID, String department) {
        super(firstName, lastName, email, password);
        this.facultyID = facultyID;
        this.department = department;
        this.userType = "Faculty";
    }
    
    public String getFacultyID() {
        return facultyID;
    }
    
    public String getDepartment() {
        return department;
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
