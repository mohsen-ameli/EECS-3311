public class Manager extends User {
    
    public Manager(String firstName, String lastName, String email, String password, String userID) {
        super(firstName, lastName, email, password, "Manager", userID);
       
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
