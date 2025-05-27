package student_mannagement_system_sagar_pawar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class studentattendance extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> studentComboBox;
    private JLabel attendanceLabel;
    
    // Sample data for demonstration
    private String[] students = {"Student 1", "Student 2", "Student 3", "Student 4", "Student 5"};
    private boolean[] attendance = {true, false, true, true, false}; // Example attendance data
    
    public studentattendance() {
        setTitle("Student Attendance Viewer");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Create components
        studentComboBox = new JComboBox<>(students);
        attendanceLabel = new JLabel();
        JButton showAttendanceButton = new JButton("Show Attendance");
        
        // Add components to frame
        add(studentComboBox);
        add(showAttendanceButton);
        add(attendanceLabel);
        
        // Add action listener to button
        showAttendanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get selected student index
                int selectedStudentIndex = studentComboBox.getSelectedIndex();
                
                // Update attendance label
                String studentName = students[selectedStudentIndex];
                boolean isPresent = attendance[selectedStudentIndex];
                String attendanceStatus = isPresent ? "Present" : "Absent";
                attendanceLabel.setText(studentName + " is " + attendanceStatus);
            }
        });
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	studentattendance viewer = new studentattendance();
                viewer.setVisible(true);
            }
        });
    }
}
