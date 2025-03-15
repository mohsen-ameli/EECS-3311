public class ParkingLot {
    private static int NO_OF_SPACES = 100;
    private int capacity;
    private String location;
    private boolean status;
    private String parkingLotID;
    
    
    public ParkingLot(String parkingLotID, String location) {
        this.parkingLotID = parkingLotID;
        this.location = location;
    }
    
    private void disable() {
        // Disable parking lot
    }

    private void enable() {
        // enable parking lot
    }
    
    // Getters and setters
    // ...
}
