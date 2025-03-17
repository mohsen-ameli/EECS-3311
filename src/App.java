import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App {
    private JFrame frame;
    private JPanel mainPanel;
    private CardLayout cardLayout;

    public static void main(String[] args) {
        App a = new App();
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
        JTextField password = new JTextField(15);

        JButton registerButton = new JButton("Sign Up");
        JButton goToLogin = new JButton("Already have an account? Login");
        goToLogin.addActionListener(e -> cardLayout.show(mainPanel, "login"));

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
        JButton registerButton = new JButton("Don't have an account? Register");
        registerButton.addActionListener(e -> cardLayout.show(mainPanel, "register"));

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

        mainPanel.add(login, "login");
    }

    public App() {
        frame = new JFrame("YorkU Parking System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        loginPage();
        registerPage();

        frame.add(mainPanel);
        frame.setSize(500, 600);
        frame.setVisible(true);
    }
}
