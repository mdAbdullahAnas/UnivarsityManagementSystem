package GUI;
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*; 
import Entity.*;
import EntityList.*;
import GUI.*;
import File.*;
import Application.ExStudent.FamousExStudents;
import Application.*;
import Application.ApplicationForm.EntityList.*; 

public class ManagementGUI extends JFrame implements ActionListener {
	Font titleFont = new Font("Cambria",Font.BOLD,30);
	Font font15 = new Font("Cambria",Font.BOLD,15);
	 
	 
	
	JButton  newInfoButton,viewDetailsButton ,applicationButton, 
	                    exSutdentButton,aboutButton,exitButton;
 
	public ManagementGUI( ){
		
		// Intialization of Frame  
		super("Univarsity Management ");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(940,650); //width, height
		super.setLocation(170,0); //X, Y
		super.getContentPane().setBackground(new Color(0,255,127));
		super.setLayout(null);//responsive design 
		 
 
		
		
		// Frame Components  
		// Title 
		JLabel title = new JLabel("Welcome to Our Univarsity Management System");
		title.setBounds(120,10,900,50); //X,Y,W,H
		title.setFont(titleFont);
		this.add(title); 
		
		//  Sub Title 
		JLabel subTitle = new JLabel("What do you wnat");
		subTitle.setBounds(350,60,320,50); //X,Y,W,H
		subTitle.setFont(new Font("Cambria",Font.BOLD,25));
		this.add(subTitle);
	 
  
 
		// newInfoButton  
       
		newInfoButton = new JButton("New Information ");
		newInfoButton.setBounds(200,250,200,40); //X,Y,W,H
		newInfoButton.setBackground(Color.YELLOW); 
		newInfoButton.setFont(font15);
		newInfoButton.addActionListener(this);
		 
		this.add(newInfoButton);
        this.setVisible(true);
		
		//  viewDetailsButton  
		 
		viewDetailsButton = new JButton("View Details ");
		viewDetailsButton.setBounds(200,310,200,40); //X,Y,W,H
		viewDetailsButton.setBackground(Color.RED);
		viewDetailsButton.setForeground(Color.WHITE);
		viewDetailsButton.setFont(font15);
		viewDetailsButton.addActionListener(this);
 
		this.add(viewDetailsButton);
		
		//  Application Button  
		 
		applicationButton = new JButton("Application");
		applicationButton.setBounds(200,370,200,40); //X,Y,W,H
		applicationButton.setBackground(Color.BLUE);
		applicationButton.setForeground(Color.WHITE);
		applicationButton.setFont(font15);
		applicationButton.addActionListener(this);
 
		this.add(applicationButton);
		
		exSutdentButton = new JButton("Ex Students ");
		exSutdentButton.setBounds(540,250,200,40); //X,Y,W,H
		exSutdentButton.setBackground(Color.YELLOW); 
		exSutdentButton.setFont(font15);
		exSutdentButton.addActionListener(this);
		 
		this.add(exSutdentButton);
		 
		
		aboutButton = new JButton("About ");
		aboutButton.setBounds(540,310,200,40); //X,Y,W,H
		aboutButton.setBackground(Color.RED);
		aboutButton.setForeground(Color.WHITE);
		aboutButton.setFont(font15);
		aboutButton.addActionListener(this);
		 
		this.add(aboutButton);
		
		exitButton = new JButton("Exit");
		exitButton.setBounds(540,370,200,40); //X,Y,W,H
		exitButton.setBackground(Color.BLUE);
		exitButton.setForeground(Color.WHITE);
		exitButton.setFont(font15);
		exitButton.addActionListener(this);
		 
		this.add(exitButton);
		
		ImageIcon icon = new ImageIcon("./Resources/Icon/L.png");
         this.setIconImage(icon.getImage()); // Set the image as the icon for this JFrame

        JLabel label = new JLabel("Icon Changed!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(label, BorderLayout.CENTER); // Adding a label to visualize the icon change
		 
		this.setVisible(true);
		
	}
	
	
  
 
	public void actionPerformed(ActionEvent e) {
        if (newInfoButton == e.getSource()) {
			
            System.out.println("Student Button Clicked");
            
             StudentList studentList = new StudentList(100);
		      TeacherList teacherList = new TeacherList(100);
			   StaffList staffList = new StaffList(100);
              FileIO.loadFromFile(studentList);
		      FileTeacherIO.loadFromFile(teacherList);
		      FileStaffIO.loadFromFile(staffList);
              AddUpdateGUI gui = new AddUpdateGUI(studentList,teacherList,staffList,this);
              //gui.setVisible(true);
			  this.setVisible(false);
			  
        } else if (viewDetailsButton == e.getSource()) {
            System.out.println("Teacher Button Clicked");
			StudentList studentList = new StudentList(100);
		      TeacherList teacherList = new TeacherList(100);
              StaffList staffList = new StaffList(100);
		
              FileIO.loadFromFile(studentList);
		      FileTeacherIO.loadFromFile(teacherList);
	          FileStaffIO.loadFromFile(staffList);
		   
              DetailsOpenGUI gui = new DetailsOpenGUI(studentList, teacherList,staffList,this);
              //gui.setVisible(true);
			  this.setVisible(false);
             
        }
		else if (applicationButton == e.getSource()) {
            System.out.println("application Button Button Clicked");
             Application GUI = new Application(new AppliEntityList(), this);
              GUI.setVisible(true);
			  this.setVisible(false);
             
        }else if (exSutdentButton == e.getSource()) {
            System.out.println("ex Sutdent Button Button Clicked");
             FamousExStudents famousStu = new FamousExStudents(this);
              famousStu.setVisible(true);
			  this.setVisible(false);
        }else if (aboutButton == e.getSource()) {
            System.out.println("about Button Clicked");
             About about = new About(this);
              about.setVisible(true);
			  this.setVisible(false);
        }else if (exitButton == e.getSource()) {
            System.out.println("exit Button Clicked");
              System.exit(0);
        }
    }
		 
		 
  
		 
	}
	 
 
 
