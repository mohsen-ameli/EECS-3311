import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
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
    public User(String firstName, String lastName, String email, String password, String userType, String userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.userID = generateUserID(); // Method to generate unique ID
    }

    // Getters
    public String getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static User register(String firstName, String lastName, String email, String password) {
        String fileName = "users.csv";
        try {
            FileReader r = new FileReader(fileName);
            System.out.println(r.read());
            // while (r.) {

            // }
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " was not found!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        // try (CSVReader reader = new CSVReader()) {
        // List<String[]> r = reader.readAll();
        // r.forEach(x -> System.out.println(Arrays.toString(x)));
        // }

        User user = new User(firstName, lastName, email, password);
        return user; // Placeholder return value
    }

    public static boolean login() {
        // Implement login logic here
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
