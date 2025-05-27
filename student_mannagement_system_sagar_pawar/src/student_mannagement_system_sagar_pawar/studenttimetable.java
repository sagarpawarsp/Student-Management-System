package student_mannagement_system_sagar_pawar;

import java.awt.*;
import javax.swing.*;

public class studenttimetable extends JFrame {
   
	private static final long serialVersionUID = 1L;
	private JLabel[][] timetableLabels;

    public studenttimetable() {
        setTitle("Student Timetable");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null); // Center the frame
        setLayout(new GridLayout(7, 7)); // 7 rows (days) and 7 columns (time + 6 lectures)

        // Initialize timetableLabels array
        timetableLabels = new JLabel[7][7];

        // Days of the week
        String[] days = {"Time", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Times for lectures
        String[] times = {"9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM"};

        // Sample subjects for each lecture slot
        String[][] subjects = {
            {"Math", "English", "Physics", "Chemistry", "Biology", "History"},
            {"Physics", "Chemistry", "Biology", "History", "Math", "English"},
            {"Biology", "History", "Math", "English", "Physics", "Chemistry"},
            {"History", "Math", "English", "Physics", "Chemistry", "Biology"},
            {"English", "Physics", "Chemistry", "Biology", "History", "Math"},
            {"Chemistry", "Biology", "History", "Math", "English", "Physics"},
            {"History", "Math", "English", "Physics", "Chemistry", "Biology"}
        };

        // Populate the timetableLabels array with JLabels
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0) {
                    // Display days
                    timetableLabels[i][j] = new JLabel(days[j], SwingConstants.CENTER);
                } else if (j == 0) {
                    // Display times
                    timetableLabels[i][j] = new JLabel(times[i - 1], SwingConstants.CENTER);
                } else {
                    // Display subjects for each lecture slot
                    timetableLabels[i][j] = new JLabel(subjects[i - 1][j - 1], SwingConstants.CENTER);
                }
                add(timetableLabels[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	studenttimetable timetable = new studenttimetable();
            timetable.setVisible(true);
        });
    }
}
