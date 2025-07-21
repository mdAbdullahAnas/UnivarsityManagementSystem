package Application.ApplicationForm.GUI2;
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*; 
import Application.ApplicationForm.Entity.*; 
import Application.ApplicationForm.EntityList.*;
import Application.ApplicationForm.*;


public class ViewAllAppliGUI extends JFrame implements ActionListener{
	Font titleFont = new Font("Cambria",Font.BOLD,30);
	Font font15 = new Font("Cambria",Font.BOLD,15);
	 
	 
	
	JButton   showAllButton,backBtn;
	
	JTextArea textArea;
	
	AppliEntityList appliEntityList;
	ViewApplication viewApplication;
	public ViewAllAppliGUI(AppliEntityList appliEntityList,ViewApplication viewApplication){
		
		// Intialization of Frame  
		super("View All Applivation");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(940,650); //width, height
		super.setLocation(170,0); //X, Y
		super.getContentPane().setBackground(new Color(50,212,32));
		super.setLayout(null);//responsive design 
		
		this.appliEntityList = appliEntityList;
		this.viewApplication = viewApplication;
		
		// Frame Components  
		// Title 
		JLabel title = new JLabel("Welcome to view All Applicaton");
		title.setBounds(230,10,500,50); //X,Y,W,H
		title.setFont(titleFont);
		this.add(title); 
		
		//  Sub Title 
		JLabel subTitle = new JLabel("Application Details");
		subTitle.setBounds(300,60,320,50); //X,Y,W,H
		subTitle.setFont(new Font("Cambria",Font.BOLD,25));
		this.add(subTitle);
	 
 
 
		// Staff INFORMATION DISPLAY  AREA  
		textArea = new JTextArea();
		textArea.setFont(font15);
		textArea.setEditable(false); 
		showAllAppliInScreen();
				
		JScrollPane jsp = new JScrollPane(textArea);
		jsp.setBounds(80,140,750,350);
		super.add(jsp);
		
		 
		
		// Get All Staff Button  
		showAllButton = new JButton("Show ALL Application");
		showAllButton.setBounds(700,520,200,30); //X,Y,W,H
		showAllButton.setBackground(Color.BLUE);
		showAllButton.setForeground(Color.WHITE);
		showAllButton.setFont(font15);
		showAllButton.addActionListener(this);  
		this.add(showAllButton);
		// Clear Button 
		 

		
		 
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
	
 
       public void actionPerformed(ActionEvent e){
  
		 if(showAllButton == e.getSource()){
			showAllAppliInScreen();
		}
         else if(backBtn == e.getSource()){
			 viewApplication.setVisible(true);
			this.dispose();
		}
	}
	
	public void showAllAppliInScreen(){
		 
		textArea.setText(appliEntityList.getAll());
	}
}
