package student_mannagement_system_sagar_pawar;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class teachertimetable extends Frame implements ActionListener {
    private Label nameLabel, dayLabel, timeLabel;
    private TextField nameField, timeField;
    private Choice dayChoice;
    private Button submitButton, showButton;
    private TextArea timetableArea;
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public teachertimetable() {
        setTitle("Teacher Class Timetable");
        setLayout(new FlowLayout());
        setSize(400, 300);
        setResizable(false);

        nameLabel = new Label("Name:");
        add(nameLabel);
        nameField = new TextField(20);
        add(nameField);

        dayLabel = new Label("Day:");
        add(dayLabel);
        dayChoice = new Choice();
        dayChoice.add("Monday");
        dayChoice.add("Tuesday");
        dayChoice.add("Wednesday");
        dayChoice.add("Thursday");
        dayChoice.add("Friday");
        add(dayChoice);

        timeLabel = new Label("Time:");
        add(timeLabel);
        timeField = new TextField(10);
        add(timeField);

        submitButton = new Button("Submit");
        add(submitButton);
        submitButton.addActionListener(this);

        showButton = new Button("Show Timetable");
        add(showButton);
        showButton.addActionListener(this);

        timetableArea = new TextArea(10, 30);
        add(timetableArea);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submitButton) {
            String name = nameField.getText();
            String day = dayChoice.getSelectedItem();
            String time = timeField.getText();
            teachers.add(new Teacher(name, day, time));
            nameField.setText("");
            timeField.setText("");
        } else if (ae.getSource() == showButton) {
            displayTimetable();
        }
    }

    private void displayTimetable() {
        StringBuilder timetable = new StringBuilder();
        for (Teacher teacher : teachers) {
            timetable.append(teacher).append("\n");
        }
        timetableArea.setText(timetable.toString());
    }

    public static void main(String[] args) {
        new teachertimetable();
    }
}

class Teacher {
    private String name;
    private String day;
    private String time;

    public Teacher(String name, String day, String time) {
        this.name = name;
        this.day = day;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Day: " + day + ", Time: " + time;
    }
}
