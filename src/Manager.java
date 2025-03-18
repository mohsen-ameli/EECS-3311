public class Manager extends User {

    public Manager(String username, String password, String userType, String firstName, String lastName,
            String email) {
        super(username, password, "Manager", firstName, lastName, email);
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
