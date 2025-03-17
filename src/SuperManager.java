public class SuperManager extends Manager {
    private static SuperManager instance;

    private SuperManager(String username, String password, String userType, String firstName, String lastName,
            String email) {
        super(username, password, userType, firstName, lastName, email);
    }

    // Singleton pattern implementation
    public static SuperManager getInstance(String username, String password, String userType, String firstName,
            String lastName,
            String email) {
        if (instance == null) {
            instance = new SuperManager(username, password, userType, firstName, lastName, email);
        }
        return instance;
    }

    private Manager generateAccount() {
        // Generate manager account logic
        return null;
    }

}
