package student_mannagement_system_sagar_pawar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class stud_teaherloginpage extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel statusLabel;
    private String userType;

    public stud_teaherloginpage() {
        setTitle("Login System");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        statusLabel = new JLabel();

        add(new JLabel("Username:"));
        add(usernameField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(loginButton);
        add(statusLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("student") && password.equals("student123")) {
            userType = "Student";
            statusLabel.setText("Login successful as Student");
            openDashboard();
        } else if (username.equals("teacher") && password.equals("teacher123")) {
            userType = "Teacher";
            statusLabel.setText("Login successful as Teacher");
            openDashboard();
        } else {
            statusLabel.setText("Invalid username or password");
        }
    }

    private void openDashboard() {
        JFrame dashboard = new JFrame("Dashboard");
        dashboard.setSize(300, 200);
        dashboard.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel welcomeLabel = new JLabel("Welcome, " + userType + "!");
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dashboard.add(welcomeLabel);

        dashboard.setVisible(true);
        setVisible(false);
    }

    public static void main(String[] args) {
        stud_teaherloginpage loginSystem = new stud_teaherloginpage();
        loginSystem.setVisible(true);
    }
}

