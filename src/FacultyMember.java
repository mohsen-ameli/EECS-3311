public class FacultyMember extends RegisteredUser {
    private String facultyID;
    private String department;

    public FacultyMember(String firstName, String lastName, String email, String password, 
            String facultyID) {
        super(firstName, lastName, email, password, "Faculty");
        this.facultyID = facultyID;
      
    }
    public String getFacultyID() {
        return facultyID;
    }
   

}
