import java.io.*;
import java.awt.event.*;
import javax.swing.*;

class App {
    public static void main(String[] args) {
        // Creating instance of JFrame
        JFrame frame = new JFrame();

        JLabel firstNameLabel = new JLabel("First Name");
        JLabel lastNameLabel = new JLabel("Last Name");
        JLabel usernameLabel = new JLabel("Username");
        JLabel emailLabel = new JLabel("Email");
        JLabel passwordLabel = new JLabel("Password");
        firstNameLabel.setBounds(0, 0, 200, 20);
        lastNameLabel.setBounds(0, 40, 200, 20);
        usernameLabel.setBounds(0, 80, 200, 20);
        emailLabel.setBounds(0, 120, 200, 20);
        passwordLabel.setBounds(0, 160, 200, 20);

        JTextField firstName = new JTextField();
        JTextField lastName = new JTextField();
        JTextField username = new JTextField();
        JTextField email = new JTextField();
        JTextField password = new JTextField();
        firstName.setBounds(0, 20, 200, 20);
        lastName.setBounds(0, 60, 200, 20);
        username.setBounds(0, 100, 200, 20);
        email.setBounds(0, 140, 200, 20);
        password.setBounds(0, 180, 200, 20);

        JButton signUp = new JButton("Sign Up!");
        JButton goLogin = new JButton("Go to Login!");
        signUp.setBounds(50, 220, 100, 50);
        goLogin.setBounds(200, 220, 125, 50);

        signUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(firstName.getText());
            }
        });

        // adding button in JFrame
        frame.add(firstNameLabel);
        frame.add(lastNameLabel);
        frame.add(usernameLabel);
        frame.add(emailLabel);
        frame.add(passwordLabel);

        frame.add(firstName);
        frame.add(lastName);
        frame.add(username);
        frame.add(email);
        frame.add(password);

        frame.add(signUp);
        frame.add(goLogin);

        // 400 width and 500 height
        frame.setSize(500, 600);

        // using no layout managers
        frame.setLayout(null);

        // making the frame visible
        frame.setVisible(true);
    }
}
