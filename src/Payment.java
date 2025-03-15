public class Payment {
    private String paymentID;
    private String clientID;
    private double amount;
    private PaymentMethod paymentMethod;
    private String status; 
    
    public Payment(String clientID, double amount, PaymentMethod paymentMethod) {
        this.paymentID = generatePaymentID();
        this.clientID = clientID;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = "pending";
    }
    
    public boolean processPayment() {
        // Process payment logic based on payment method type
        
        return false;
    }
    
    public boolean refundPayment() {
        // Refund payment logic
        
        return false;
    }
    
    public boolean forfeitPayment() {
        // Forfeit payment logic (for no-show cases)
        if (status.equals("pending") || status.equals("completed")) {
            status = "forfeited";
            return true;
        }
        return false;
    }
    
    private String generatePaymentID() {
        // Generate unique payment ID.. maybe use a auto-incrementing counter?? idk
        return "place holder value";
    }
    
    // Getters and setters
    // ...
}