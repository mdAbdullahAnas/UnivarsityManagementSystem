package Application.ApplicationForm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import GUI.*;
import Application.ApplicationForm.Entity.*;
import Application.ApplicationForm.EntityList.*;
import Application.ApplicationForm.FileIO.*;
import Application.Application;
import Application.ApplicationForm.GUI2.*;


 
public class ViewApplication extends JFrame implements ActionListener {
	Font titleFont = new Font("Cambria",Font.BOLD,30);
	Font font15 = new Font("Cambria",Font.BOLD,15);
	
 
	
	JButton leaveApplyButton ,newApplyButton, backBtn;
	
	AppliEntityList appliEntityList;
	Application application;
	
	public ViewApplication(AppliEntityList appliEntityList,Application application){
		super("View Application Form");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(940,650); //width, height
		super.setLocation(170,0); //X, Y
		super.getContentPane().setBackground(new Color(0,255,255));
		super.setLayout(null);//responsive design
        this.appliEntityList = appliEntityList;		
        this.application = application;
		
		//============= Title ===========
		JLabel title = new JLabel(" Application Form");
		title.setBounds(330,10,500,50); //X,Y,W,H
		title.setFont(titleFont);
		 
		
		newApplyButton = new JButton("New Application");
		newApplyButton.setBounds(375,300,200,30); //X,Y,W,H
		newApplyButton.setBackground(Color.RED);
		newApplyButton.setForeground(Color.WHITE);
		newApplyButton.setFont(font15);
		newApplyButton.addActionListener(this);
		super.add(newApplyButton);
		 
		 
	  
		///////////////// Apply  ///////////////
		
		leaveApplyButton = new JButton("Leave Application");
		leaveApplyButton.setBounds(375,350,200,30); //X,Y,W,H
		leaveApplyButton.setBackground(Color.RED);
		leaveApplyButton.setForeground(Color.WHITE);
		leaveApplyButton.setFont(font15);
		//leaveApplyButton.addActionListener(this);
		super.add(leaveApplyButton);
		
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
		super.setVisible(true);
		
	}
 
public void actionPerformed(ActionEvent e){
		 
		 
		if(leaveApplyButton == e.getSource()){
			System.out.println("CLEAR CLICKED");
			 
		}else if (newApplyButton== e.getSource()) {
          System.out.println("CLEAR CLICKED");
		  ViewAllAppliGUI viewAllAppli = new ViewAllAppliGUI(appliEntityList, this);
             FileIOAppli.loadFromFile(appliEntityList);
             this.setVisible(false);
        }
		else if (backBtn == e.getSource()) {
          application.setVisible(true);
          this.dispose();
        }
	}
	
}