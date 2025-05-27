package student_mannagement_system_sagar_pawar;

import java.awt.*;
import java.awt.event.*;

public class TeacherPage extends Frame {
   
	private static final long serialVersionUID = 1L;
	Label subjectLabel;
    Label teacherLabel;
    TextArea displayArea;

    String[] subjects = {"Mathematics", "Physics", "Chemistry", "Biology"};
    String[] teachers = {"Mr. Smith", "Ms. Johnson", "Mr. Lee", "Dr. Patel"};

    public TeacherPage() {
        setTitle("Teacher Information");
        setSize(400, 300);
        setLayout(new BorderLayout());

        subjectLabel = new Label("Select a subject:");
        teacherLabel = new Label("Teachers:");
        displayArea = new TextArea();
        displayArea.setEditable(false);

        Panel topPanel = new Panel(new FlowLayout());
        topPanel.add(subjectLabel);
        Choice subjectChoice = new Choice();
        for (String subject : subjects) {
            subjectChoice.add(subject);
        }
        topPanel.add(subjectChoice);

        subjectChoice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int index = subjectChoice.getSelectedIndex();
                String selectedSubject = subjects[index];
                displayTeachers(selectedSubject);
            }
        });

        add(topPanel, BorderLayout.NORTH);

        Panel centerPanel = new Panel(new BorderLayout());
        centerPanel.add(teacherLabel, BorderLayout.NORTH);
        centerPanel.add(displayArea, BorderLayout.CENTER);

        add(centerPanel, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    private void displayTeachers(String selectedSubject) {
        displayArea.setText("");
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].equals(selectedSubject)) {
                displayArea.append(teachers[i] + "\n");
            }
        }
    }

    public static void main(String[] args) {
        new TeacherPage();
    }
}
