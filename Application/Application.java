package Application;
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*; 
import GUI.ManagementGUI;
import Application.ApplicationForm.*;
import Application.ApplicationForm.EntityList.*;
public class Application extends JFrame implements ActionListener {
	Font titleFont = new Font("Cambria",Font.BOLD,30);
	Font font15 = new Font("Cambria",Font.BOLD,15);
	 
	 
	
	JButton  applicationNew,applicationLeave ,viewAllAplication , backBtn;  
 
	 
	
	ManagementGUI managementGUI;
	AppliEntityList appliEntityList;
	public Application(AppliEntityList appliEntityList, ManagementGUI managementGUI ){
		
		// Intialization of Frame  
		super("Application");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(940,650); //width, height
		super.setLocation(170,0); //X, Y
		super.getContentPane().setBackground(new Color(0,255,255));
		super.setLayout(null);//responsive design 
        this.appliEntityList = appliEntityList;
        this.managementGUI = managementGUI;
		 
		
		
		// Frame Components  
		// Title 
		JLabel title = new JLabel("Welcome to Apply Application");
		title.setBounds(230,10,500,50); //X,Y,W,H
		title.setFont(titleFont);
		this.add(title); 
		
		//  Sub Title 
		JLabel subTitle = new JLabel("Choose a option");
		subTitle.setBounds(300,60,320,50); //X,Y,W,H
		subTitle.setFont(new Font("Cambria",Font.BOLD,25));
		this.add(subTitle);
	 
  
 
		// applicationNew  
 
		applicationNew = new JButton("New Application ");
		applicationNew.setBounds(375,250,200,30); //X,Y,W,H
		applicationNew.setBackground(Color.YELLOW); 
		applicationNew.setFont(font15);
		applicationNew.addActionListener(this);
		 
		this.add(applicationNew);
        this.setVisible(true);
		
		//  applicationLeave  
		 
		applicationLeave = new JButton("Leave Application");
		applicationLeave.setBounds(375,300,200,30); //X,Y,W,H
		applicationLeave.setBackground(Color.RED);
		applicationLeave.setForeground(Color.WHITE);
		applicationLeave.setFont(font15);
		applicationLeave.addActionListener(this);
 
		this.add(applicationLeave);
		
		//  staff Button  
		 
		viewAllAplication = new JButton("View All Application");
		viewAllAplication.setBounds(375,350,200,30); //X,Y,W,H
		viewAllAplication.setBackground(Color.BLUE);
		viewAllAplication.setForeground(Color.WHITE);
		viewAllAplication.setFont(font15);
		viewAllAplication.addActionListener(this);
		this.add(viewAllAplication);
		
		
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
        if (applicationNew == e.getSource()) {
            System.out.println("New application Button Clicked");
            
             ApplicationForm newApplicationForm = new ApplicationForm(this);
             
             this.setVisible(false);
             
        } else if (applicationLeave == e.getSource()) {
			
            System.out.println("Leave Application Button Clicked");
			 LeaveApplicationForm newApplicationForm = new LeaveApplicationForm (this);
             
             this.setVisible(false);
		     
			 
		}
		else if (viewAllAplication == e.getSource()) {
            System.out.println("Application Button Clicked");
             ViewApplication viewAppli = new ViewApplication(appliEntityList, this);
             
             this.setVisible(false);
             
        }else if(backBtn == e.getSource()){
			managementGUI.setVisible(true);
			this.dispose();
		}
    }
	  
	}
 
