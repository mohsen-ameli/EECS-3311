public class ParkingSpace {
    private String parkingSpaceID;
    private String parkingLotID;
    private boolean isOccupied;
    private boolean isDisabled;
    private String status;
    
    public ParkingSpace(String parkingSpaceID, String parkingLotID, int spaceNumber) {
        this.parkingSpaceID = parkingSpaceID;
        this.parkingLotID = parkingLotID;
        this.isOccupied = false;
        this.isDisabled = false;
        this.status = "Available";
    }
    
    public void enable() {
        //imblement logic here
    }
    
    public void disable() {
        //imblement logic here
    }
    
    public void resever() {
        //imblement logic here
    }
    
    public void updateStatus(String status) {
        //imblement logic here
    }
    
    // Getters and setters
    // ...
}

