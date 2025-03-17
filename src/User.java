import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;

public class User implements UserInterface {
    protected String userID;
    protected String firstName;
    protected String lastName;
    protected String username;
    protected String email;
    protected String password;
    protected String userType;
    static final String USERS_DB_FILENAME = "users.csv";

    // Constructor
    public User(String username, String password, String userType, String firstName, String lastName, String email) {
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    private static User userLookup(String username, String email) {
        User user = null;
        try {
            File myObj = new File(USERS_DB_FILENAME);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] cols = data.split(",");
                if (username.equals(cols[0]) || email.equals(cols[5])) {
                    user = UserFactory.createUser(cols[0], cols[1], cols[2], cols[3], cols[4], cols[5]);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("There are no registered users!");
        } catch (IllegalArgumentException e) {
            System.out.println("User type is invalid!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        return user;
    }

    public static User register(String username, String password, String userType, String firstName, String lastName,
            String email) throws IllegalArgumentException {
        if (username.equals("") || password.equals("") || userType.equals("") || firstName.equals("")
                || lastName.equals("") || email.equals("")) {
            throw new IllegalArgumentException("Please provide values for all fields!");
        }
        User user = userLookup(username, email);
        if (user != null) {
            throw new IllegalArgumentException("User already exists!");
        }

        try {
            FileWriter myWriter = new FileWriter(USERS_DB_FILENAME, true);
            user = UserFactory.createUser(username, password, userType, firstName, lastName, email);
            System.out.println("created user" + user);
            myWriter.write(
                    "\n" + username + "," + password + "," + userType + "," + firstName + "," + lastName + "," + email);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        } catch (IllegalArgumentException e) {
            System.out.println("User type is invalid!");
            throw new IllegalArgumentException(e.getMessage());
        }

        return user;
    }

    public static User login(String username, String password) throws Error {
        User user = null;

        try {
            File myObj = new File(USERS_DB_FILENAME);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] cols = data.split(",");
                if (username.equals(cols[0]) && password.equals(cols[1])) {
                    user = UserFactory.createUser(cols[0], cols[1], cols[2], cols[3], cols[4], cols[5]);
                    myReader.close();
                    return user;
                }
            }
            myReader.close();
            throw new Error("Username or password is wrong!");
        } catch (FileNotFoundException e) {
            System.out.println("There are no registered users!");
        } catch (IllegalArgumentException e) {
            System.out.println("User type is invalid!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }

        return user;
    }

    private String generateUserID() {
        return UUID.randomUUID().toString();
    }

    public String toString() {
        return userType + " with username: " + username + ", name: " + firstName + " " + lastName;
    }
}
