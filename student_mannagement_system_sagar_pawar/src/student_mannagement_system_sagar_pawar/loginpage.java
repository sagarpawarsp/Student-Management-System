package student_mannagement_system_sagar_pawar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loginpage extends JFrame implements ActionListener {
 
	private static final long serialVersionUID = 1L;
	private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton submitButton;

    public loginpage() {
        setTitle("Login Page");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        panel.add(usernameLabel);

        usernameField = new JTextField();
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        panel.add(submitButton);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Here you can add your authentication logic
        // For simplicity, let's assume the username is "admin" and password is "password"
        if (username.equals("sagar") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
            // Open the next page after successful login
            new welcomepage();
            dispose(); // Close the login page
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password!");
        }
    }

    public static void main(String[] args) {
        new loginpage();
    }
}
