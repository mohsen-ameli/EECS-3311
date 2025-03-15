public class PaymentMethod {
    private String cardNumber;
    private String cardName;
    private String expirationDate;
    private String cvv;
    private String type;  // "credit", "debit", "mobile"
    
    public PaymentMethod(String cardNumber, String cardName, String expirationDate, String cvv, String type) {
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
