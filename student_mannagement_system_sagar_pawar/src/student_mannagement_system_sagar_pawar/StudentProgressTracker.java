package student_mannagement_system_sagar_pawar;

import java.awt.*;
import java.awt.event.*;

import java.awt.*;
import java.awt.event.*;

public class StudentProgressTracker extends Frame {
    private List studentList;

    public StudentProgressTracker() {
        setTitle("Student Progress Tracking");
        setSize(300, 200);

        studentList = new List();
        studentList.add("John - Roll No: 101");
        studentList.add("Emily - Roll No: 102");
        studentList.add("Michael - Roll No: 103");

        add(studentList, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        StudentProgressTracker app = new StudentProgressTracker();
        app.setVisible(true);
    }
}
