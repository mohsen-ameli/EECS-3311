public class FacultyMember extends RegisteredUser {
    private String facultyID;
    private String department;

    public FacultyMember(String firstName, String lastName, String email, String password, 
            String userID) {
        super(firstName, lastName, email, password, "Faculty", userID);
        
    }
   

}
