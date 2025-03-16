public class NonFacultyStaff extends RegisteredUser {
    private String staffID;
    
    public NonFacultyStaff(String firstName, String lastName, String email, String password, 
                           String staffID) {
        super(firstName, lastName, email, password, "NonFacultyStaff");
        this.staffID = staffID;
        
    }
    
    public String getStaffID() {
        return staffID;
    }

}
