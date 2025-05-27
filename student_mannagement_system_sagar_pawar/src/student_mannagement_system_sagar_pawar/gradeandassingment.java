package student_mannagement_system_sagar_pawar;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gradeandassingment extends JFrame implements ActionListener {
    
	private static final long serialVersionUID = 1L;
	private JTextField nameField, gradeField;
    private JTextArea displayArea;

    public gradeandassingment() {
        setTitle("Grade Assignment");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Student Name:");
        nameField = new JTextField();
        JLabel gradeLabel = new JLabel("Grade:");
        gradeField = new JTextField();
        JButton assignButton = new JButton("Assign Grade");
        assignButton.addActionListener(this);

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(gradeLabel);
        inputPanel.add(gradeField);
        inputPanel.add(assignButton);

        displayArea = new JTextArea();
        displayArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(displayArea);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(inputPanel, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String grade = gradeField.getText();

        if (name.isEmpty() || grade.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both student name and grade.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        displayArea.append(name + ": " + grade + "\n");

        nameField.setText("");
        gradeField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new gradeandassingment().setVisible(true);
            }
        });
    }
}
