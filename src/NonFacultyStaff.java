public class NonFacultyStaff extends RegisteredUser {
    private String staffID;
    
    public NonFacultyStaff(String firstName, String lastName, String email, String password, 
                           String staffID) {
        super(firstName, lastName, email, password);
        this.staffID = staffID;
        this.userType = "Staff";
    }
    
    public String getStaffID() {
        return staffID;
    }

}
