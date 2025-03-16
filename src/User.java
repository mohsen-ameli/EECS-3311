
import java.util.UUID;

public class User implements UserInterface {
    protected String userID;
    protected String firstName;
    protected String lastName;
    protected String username;
    protected String email;
    protected String password;
    protected String userType;

    // Constructor
    public User(String firstName, String lastName, String email, String password, String userType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.userID = generateUserID(); // Method to generate unique ID
    }

    // Getters
    @Override
    public String getUserID() {
        return userID;
    }
    @Override
    public String getFirstName() {
        return firstName;
    }
    @Override
    public String getLastName() {
        return lastName;
    }
    @Override
    public String getUsername() {
        return username;
    }
    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public String getUserType() { return userType; }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setUsername(String username) { this.username = username; }
    public void setEmail(String email) { this.email = email; }

    public static boolean register() {
        // Implement registration logic here
        return true; // Placeholder return value
    }
    public static boolean login() {
        // Implement login logic here
        //return db.validateUser(username, password);
        return true; // Placeholder return value
    }
    public static User logout() {
        // Implement logout logic here
        return null; // Placeholder return value
    }

    private String generateUserID() {
        return UUID.randomUUID().toString();
    }
}
