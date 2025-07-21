package GUI;
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*; 
import Entity.*;
import EntityList.*;
import GUI.*;
import File.*;

public class DetailsOpenGUI extends JFrame implements ActionListener {
	Font titleFont = new Font("Cambria",Font.BOLD,30);
	Font font15 = new Font("Cambria",Font.BOLD,15);
	 
	 
	
	JButton  teacherButton,studentButton ,staffButton , backBtn;  
 
	
	JTextArea textArea;
	
	 StudentList studentList;
	 TeacherList teacherList; 
	 StaffList staffList;
	 ManagementGUI managementGUI;
	
	public DetailsOpenGUI(StudentList studentList, TeacherList teacherList, 
	                      StaffList staffList,ManagementGUI managementGUI){
		
		// Intialization of Frame  
		super("View Details");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(940,650); //width, height
		super.setLocation(170,0); //X, Y
		super.getContentPane().setBackground(new Color(50,212,32));
		super.setLayout(null);//responsive design 
		this.studentList = studentList;
		this.teacherList = teacherList;
		this.staffList = staffList; 
		this.managementGUI = managementGUI;
 
		
		
		// Frame Components  
		// Title 
		JLabel title = new JLabel("Welcome to view details");
		title.setBounds(270,10,500,50); //X,Y,W,H
		title.setFont(titleFont);
		this.add(title); 
		
		//  Sub Title 
		JLabel subTitle = new JLabel("Which Details");
		subTitle.setBounds(350,60,520,50); //X,Y,W,H
		subTitle.setFont(new Font("Cambria",Font.BOLD,25));
		this.add(subTitle);
	 
  
 
		// teacherButton  
 
		teacherButton = new JButton("Teacher ");
		teacherButton.setBounds(375,250,200,30); //X,Y,W,H
		teacherButton.setBackground(Color.YELLOW); 
		teacherButton.setFont(font15);
		teacherButton.addActionListener(this);
		 
		this.add(teacherButton);
        this.setVisible(true);
		
		//  studentButton  
		 
		studentButton = new JButton("Student");
		studentButton.setBounds(375,300,200,30); //X,Y,W,H
		studentButton.setBackground(Color.RED);
		studentButton.setForeground(Color.WHITE);
		studentButton.setFont(font15);
		studentButton.addActionListener(this);
 
		this.add(studentButton);
		
		//  staff Button  
		 
		staffButton = new JButton("Staff");
		staffButton.setBounds(375,350,200,30); //X,Y,W,H
		staffButton.setBackground(Color.BLUE);
		staffButton.setForeground(Color.WHITE);
		staffButton.setFont(font15);
		staffButton.addActionListener(this);
		this.add(staffButton);
		
		 // Back Button 
		backBtn = new JButton("Back");
		backBtn.setBounds(10,20,100,30); //X,Y,W,H
		backBtn.setBackground(Color.RED);
		backBtn.setForeground(Color.WHITE);
		backBtn.setFont(font15);
		backBtn.addActionListener(this);
		this.add(backBtn);
 
		ImageIcon icon = new ImageIcon("./Resources/Icon/L.png");
         this.setIconImage(icon.getImage()); // Set the image as the icon for this JFrame

        JLabel label = new JLabel("Icon Changed!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(label, BorderLayout.CENTER); // Adding a label to visualize the icon change
		 
		this.setVisible(true);
		
	}
	
	
  
 
	public void actionPerformed(ActionEvent e) {
        if (studentButton == e.getSource()) {
			
            System.out.println("Student Button Clicked");
			 
		    ManagementStudent studentManagement = new ManagementStudent(studentList,this);
			FileIO.loadFromFile(studentList);
             
			this.setVisible(false);
			
        } else if (teacherButton == e.getSource()) {
            System.out.println("Teacher Button Clicked");
            ManagementTeacher teacherManagement = new ManagementTeacher(teacherList,this);
            FileTeacherIO.loadFromFile(teacherList);
            this.setVisible(false);
        }
		else if (staffButton == e.getSource()) {
            System.out.println("Staff Button Clicked");
            ManagementStaff teacherManagement = new ManagementStaff(staffList,this);
            FileStaffIO.loadFromFile(staffList);
            this.setVisible(false);
        }else if(backBtn == e.getSource()){
			managementGUI.setVisible(true);
			this.dispose();
		}
    }
		 
		 
		 
		 
	}
	 

 
