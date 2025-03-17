import java.awt.*;
import javax.swing.*;

public class App {
    private JFrame frame;
    private JPanel mainPanel;
    private JPanel homePanel;
    private CardLayout cardLayout;
    private User user;

    public static void main(String[] args) {
        new App();
    }

    public void sendInfo(String text) {
        JOptionPane.showMessageDialog(null, text, "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void registerPage() {
        JPanel register = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel firstNameLabel = new JLabel("First Name");
        JTextField firstName = new JTextField(15);

        JLabel lastNameLabel = new JLabel("Last Name");
        JTextField lastName = new JTextField(15);

        JLabel usernameLabel = new JLabel("Username");
        JTextField username = new JTextField(15);

        JLabel emailLabel = new JLabel("Email");
        JTextField email = new JTextField(15);

        JLabel passwordLabel = new JLabel("Password");
        JPasswordField password = new JPasswordField(15);

        JButton registerButton = new JButton("Sign Up");
        registerButton.addActionListener(_ -> {
            try {
                user = User.register(username.getText(), String.valueOf(password.getPassword()), "Student",
                        firstName.getText(), lastName.getText(), email.getText());
                if (user != null) {
                    homePanel.removeAll();
                    homePage();
                    cardLayout.show(mainPanel, "home");
                }
            } catch (IllegalArgumentException e) {
                sendInfo(e.getMessage());
            }
        });
        JButton goToLogin = new JButton("Already have an account? Login");
        goToLogin.addActionListener(_ -> cardLayout.show(mainPanel, "login"));
        JButton goHomeButton = new JButton("Go back to home");
        goHomeButton.addActionListener(_ -> cardLayout.show(mainPanel, "home"));

        gbc.gridx = 0;
        gbc.gridy = 0;
        register.add(firstNameLabel, gbc);
        gbc.gridx = 1;
        register.add(firstName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        register.add(lastNameLabel, gbc);
        gbc.gridx = 1;
        register.add(lastName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        register.add(usernameLabel, gbc);
        gbc.gridx = 1;
        register.add(username, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        register.add(emailLabel, gbc);
        gbc.gridx = 1;
        register.add(email, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        register.add(passwordLabel, gbc);
        gbc.gridx = 1;
        register.add(password, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        register.add(registerButton, gbc);
        gbc.gridx = 1;
        register.add(goToLogin, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        register.add(goHomeButton, gbc);

        mainPanel.add(register, "register");
    }

    public void loginPage() {
        JPanel login = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField(15);

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(15);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(_ -> {
            try {
                user = User.login(userField.getText(), String.valueOf(passField.getPassword()));
                if (user != null) {
                    homePanel.removeAll();
                    homePage();
                    cardLayout.show(mainPanel, "home");
                }
            } catch (Error e) {
                sendInfo(e.getMessage());
            }
        });
        JButton registerButton = new JButton("Don't have an account? Register");
        registerButton.addActionListener(_ -> cardLayout.show(mainPanel, "register"));
        JButton goHomeButton = new JButton("Go back to home");
        goHomeButton.addActionListener(_ -> cardLayout.show(mainPanel, "home"));

        gbc.gridx = 0;
        gbc.gridy = 0;
        login.add(userLabel, gbc);
        gbc.gridx = 1;
        login.add(userField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        login.add(passLabel, gbc);
        gbc.gridx = 1;
        login.add(passField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        login.add(loginButton, gbc);
        gbc.gridx = 1;
        login.add(registerButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        login.add(goHomeButton, gbc);

        mainPanel.add(login, "login");
    }

    public void homePage() {
        homePanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel homeLabel = new JLabel("Home Page");

        JLabel userLabel = null;
        if (user == null) {
            userLabel = new JLabel("Welcome dear visitor!");

            JButton registerButton = new JButton("Register");
            registerButton.addActionListener(_ -> cardLayout.show(mainPanel, "register"));

            JButton loginButton = new JButton("Log In");
            loginButton.addActionListener(_ -> {
                cardLayout.show(mainPanel, "login");
            });

            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.gridwidth = 1;
            homePanel.add(loginButton, gbc);
            gbc.gridx = 1;
            homePanel.add(registerButton, gbc);
        } else {
            userLabel = new JLabel(user.toString());

            JButton logOutButton = new JButton("Log Out");
            logOutButton.addActionListener(_ -> {
                user = null;
                homePanel.removeAll();
                homePage();
                cardLayout.show(mainPanel, "home");
            });

            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.gridwidth = 2;
            homePanel.add(logOutButton, gbc);
        }

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        homePanel.add(homeLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        homePanel.add(userLabel, gbc);

        mainPanel.add(homePanel, "home");
    }

    public App() {
        frame = new JFrame("YorkU Parking System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        homePage();
        loginPage();
        registerPage();

        frame.add(mainPanel);
        frame.setSize(500, 600);
        frame.setVisible(true);
    }
}
