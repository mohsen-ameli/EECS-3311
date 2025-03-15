public class NonFacultyStaff extends RegisteredUser {
    private String staffID;
    private String department;
    private double hourlyRate = 10.0;
    
    public NonFacultyStaff(String firstName, String lastName, String email, String password, 
                           String staffID, String department) {
        super(firstName, lastName, email, password);
        this.staffID = staffID;
        this.department = department;
        this.userType = "Staff";
    }
    
    public String getStaffID() {
        return staffID;
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
