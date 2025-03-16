public class Manager extends User {
    private String managerID;
    
    public Manager(String firstName, String lastName, String email, String password, String managerID) {
        super(firstName, lastName, email, password, "Manager");
        this.managerID = managerID;
    }
    public String getManagerID() {
        return managerID;
    }
    
    public void addParkingLot(ParkingLot parkingLot) {
        // Add parking lot logic
    }
    
    public void enableParkingSpace(String parkingSpaceID) {
        // Enable parking space logic
    }
    
    public void disableParkingSpace(String parkingSpaceID) {
        // Disable parking space logic
    }
    
    public void approveUserRegistration(String userID) {
        // Validate user registration logic
    }
}
