import java.sql.Date;

public class Booking {
    private String bookingID;
    private User user;
    private ParkingSpace space;
    private Date startDate;
    private Date endDate;
    private boolean isPaid;
    private Payment payment;

    public Booking(String bookingID, User user, ParkingSpace space, Date startDate, Date endDate) {
        this.bookingID = bookingID;
        this.user = user;
        this.space = space;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isPaid = false;
    }

    // Getters and setters
    // ...

    private boolean createBooking(String licensePlate) {
        // To be implemented
        return false;
    }

    private Payment makePayment() {
        // To be implemented
        return null;
    }

    private boolean cancelBooking() {
        // To be implemented
        return false;
    }

    private boolean editBooking() {
        // To be implemented
        return false;
    } 

    private double extendBooking(Date time) {
        // To be implemented
        return 0.0;
    }

    private void changeBookingtime(Date time) {
        // To be implemented
    }

    private void changeBookingLocation(ParkingSpace space) {
        // To be implemented
    }


}