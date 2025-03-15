public class PaymentMethod {
    private String cardNumber;
    private String cardName;
    private String expirationDate;
    private String cvv;
    private String type;  // "credit", "debit", "mobile"
    
    public PaymentMethod(String cardNumber, String cardName, String expirationDate, String cvv, String type) {
        if (!type.equals("credit") && !type.equals("debit") && !type.equals("mobile")) {
            throw new IllegalArgumentException("Invalid payment type. Must be 'credit', 'debit', or 'mobile'.");
        }
        if (!cardNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Card number must be all digits.");
        }
        if (!cvv.matches("\\d+")) {
            throw new IllegalArgumentException("CVV must be all digits.");
        }
        // Additional checks for expirationDate and cardName can be added here if needed
        
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.type = type;
    }
    
    public boolean payByCredit() {
        // Credit payment logic
        return type.equals("credit");
    }
    
    public boolean payByDebit() {
        // Debit payment logic
        return type.equals("debit");
    }
    
    public boolean payByMobile() {
        // Mobile payment logic
        return type.equals("mobile");
    }
    
    // Getters and setters
    // ...
}
