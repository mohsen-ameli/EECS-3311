public abstract class User {
    protected String userID;
    protected String firstName;
    protected String lastName;
    protected String username;
    protected String email;
    protected String password;
    protected String userType;

    // Constructor
    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userID = generateUserID(); // Method to generate unique ID
    }

    // Getters
    public String getUserID() { return userID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getUserType() { return userType; }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setUsername(String username) { this.username = username; }
    public void setEmail(String email) { this.email = email; }

    // Abstract methods
    public abstract boolean register();
    public abstract boolean login();
    public abstract boolean logout();

    // Method to generate unique user ID
    private String generateUserID() {
        // Use a static counter to generate unique IDs
        return "1"; // Placeholder value
    }

}
