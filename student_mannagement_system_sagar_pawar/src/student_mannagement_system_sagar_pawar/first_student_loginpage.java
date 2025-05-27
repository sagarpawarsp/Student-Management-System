package student_mannagement_system_sagar_pawar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
public class first_student_loginpage extends JFrame implements ActionListener
{
  
	private static final long serialVersionUID1 = 1L;

	private static final long serialVersionUID = -1361687512890287883L;
JButton sec,tre,cancle;
  JLabel l1,l2;
  JPanel p1,p2,p3,p4;
  JMenuBar mbar;
  JMenu m;
  JMenuItem i1;
     public first_student_loginpage()
   {
  mbar=new JMenuBar();
     setJMenuBar(mbar);
     m=new JMenu("File");
     m.add(i1=new JMenuItem("Exit"));
     mbar.add(m);
   setIconImage(new ImageIcon("images/downlode.jpg").getImage());
   sec=new JButton("Student Login");
    tre=new JButton("Teacher Login");

cancle=new JButton("EXIT");
sec.setForeground(Color.red);
tre.setForeground(Color.red);
cancle.setForeground(Color.blue);
p1=new JPanel();
l1=new JLabel("WELCOME TO SP ENGGNERING COLLAGE");
l1.setFont(new Font("Old English Text MT",Font.BOLD,30));
l1.setForeground(Color.red);
l1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.black,2));
l2=new JLabel(new ImageIcon("images/c1.png"));
l2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.black,3));
l2.setFont(new Font("Palatino Linotype",Font.BOLD,22));
l2.setForeground(Color.magenta);
p1. add(l1);
add(p1);
p2=new JPanel();
p2.add(l2);
add(p2);
p3=new JPanel();
p3.add(sec);
p3.add(tre);
//p3.add(sg);
add(p3);
p3.setLayout(new FlowLayout());
p4=new JPanel();
p4.add(cancle);
add(p4);
setLayout(new GridLayout(4,1));
sec.addActionListener(this);
//sg.addActionListener(this);
tre.addActionListener(this);
cancle.addActionListener(this);
i1.addActionListener(this);
setSize(800,700);
setVisible(true);
setTitle("Welcome");
setLocation(0,0);
p1.setBackground(new Color(243,169,71));
p2.setBackground(new Color(243,169,71));
p3.setBackground(new Color(243,169,71));
p4.setBackground(new Color(243,169,71));
p3.setBackground(Color.yellow);
p4.setBackground(Color.yellow);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
  public void actionPerformed(ActionEvent ae)
{  
   String str=ae.getActionCommand();
   if(str.equals("Exit"))
    {
     dispose();
    }
  if(ae.getActionCommand()=="Student Login")
     {
        new loginpage(); 
             }
  if(ae.getActionCommand()=="Teacher Login")
     {
       new login_teacher();
              }
  
    if(ae.getActionCommand()=="EXIT")
     {
       System.exit(0);
      }
        }
  public static void main(String args[])
   {
      new first_student_loginpage();
    }
		public static long getSerialversionuid1() {
			return serialVersionUID1;
		}
}