import java.util.ArrayList;

public class RegisteredUser extends User {
    private ArrayList<PaymentMethod> paymentMethod;
    private ArrayList<Booking> bookings;

    public RegisteredUser(String username, String password, String userType, String firstName, String lastName,
            String email) {
        super(username, password, userType, firstName, lastName, email);
        this.paymentMethod = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public ArrayList<Booking> getBookings() {
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
