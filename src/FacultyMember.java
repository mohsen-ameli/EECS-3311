public class FacultyMember extends RegisteredUser {
    
    public FacultyMember(String firstName, String lastName, String email, String password, 
                         String facultyID, String department) {
        super(firstName, lastName, email, password);
        this.userType = "Faculty";
    }

}
