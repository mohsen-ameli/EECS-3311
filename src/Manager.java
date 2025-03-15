public class Manager extends User {
    // private String managerID; -- should we have this???
    
    public Manager(String firstName, String lastName, String email, String password, String managerID) {
        super(firstName, lastName, email, password);
        // this.managerID = managerID; ??? should we have this???
        this.userType = "Manager";
    }
    
    @Override
    public boolean register() {
        // Manager registration - handled by SuperManager
        return false;
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