public class SuperManager extends Manager {
    private static SuperManager instance;
    
    private SuperManager(String firstName, String lastName, String email, String password, String managerID) {
        super(firstName, lastName, email, password, managerID);
        this.userType = "SuperManager";
    }
    
    // Singleton pattern implementation
    public static SuperManager getInstance(String firstName, String lastName, String email, 
                                           String password, String managerID) {
        if (instance == null) {
            instance = new SuperManager(firstName, lastName, email, password, managerID);
        }
        return instance;
    }

    private Manager generateAccount() {
        // Generate manager account logic
        return null;
    }

    private void assignToManager(Manager manager) {
        // the uml diagram says that we have a ManagerTeam class?? tf is that?? we dont have that bro... 
        // this is about the parameter ^^^
        // Assign manager logic
    }
    
}
