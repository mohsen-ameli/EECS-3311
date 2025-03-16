public class RegisteredUser extends User {
    private PaymentMethod[] paymentMethod;
    private Booking[] bookings;
    
    public RegisteredUser(String firstName, String lastName, String email, String password, String userType) {
        super(firstName, lastName, email, password, userType);
        this.paymentMethod = new PaymentMethod[5];
        this.bookings = new Booking[10];
    }
    
    public Booking[] getBookings() {
        return bookings;
    }

    public void bookParkingSpace(ParkingSpace space) {
        // Book parking space logic
    }

    public void extendParkingTime() {
        // Extend parking time logic
    }

    public void makePayment() {
        // Cancel booking logic
    }
}
