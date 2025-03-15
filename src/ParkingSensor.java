public class ParkingSensor {
    private int sensorID;
    private String parkingSpaceID;
    private boolean isOccupied;

    public ParkingSensor(int sensorID, String parkingSpaceID) {
        this.sensorID = sensorID;
        this.parkingSpaceID = parkingSpaceID;
        this.isOccupied = false;
    }

    public boolean detectCar() {
        // implement logic here
        return false;
    }
    
    public String scanLicensePlate() {
        // Simulate license plate scanning
        return "ABC-123";  // Placeholder
    }
}

