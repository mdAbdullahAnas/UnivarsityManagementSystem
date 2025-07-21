package Application.ApplicationForm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import GUI.*;
import Application.Application;

 
public class LeaveApplicationForm extends JFrame implements ActionListener {
	Font titleFont = new Font("Cambria",Font.BOLD,30);
	Font font15 = new Font("Cambria",Font.BOLD,15);
	
	JTextField nameTextField,idTextField,leaveDateTextField,eMailTextField,
	phoneNumTextField, 
	completeTextField,cgpaTextField,
	reasonTextField ;
  
	
	JButton applyButton , backBtn;
	
	
	Application application;
	
	public LeaveApplicationForm(Application application){
		super("Leave Application Form");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(940,650); //width, height
		super.setLocation(170,0); //X, Y
		super.getContentPane().setBackground(new Color(0,255,255));
		super.setLayout(null);//responsive design 
        this.application = application;
		
		//============= Title ===========
		JLabel title = new JLabel("Leave Application Form");
		title.setBounds(230,10,500,50); //X,Y,W,H
		title.setFont(titleFont);
		//=========== Sub Title ==========
		JLabel subTitle = new JLabel("Enter All the information");
		subTitle.setBounds(300,60,320,50); //X,Y,W,H
		subTitle.setFont(new Font("Cambria",Font.BOLD,25));
		super.add(title);
		super.add(subTitle);
		
		//////////////////////////////////////////////////////////////////////////////
		//---------------------- LEFT SIDE COMPONENTS ------------------------------//
		//////////////////////////////////////////////////////////////////////////////
		
		//============Book Entry Form ===========
		int top = 150;
		int gap = 40;
	 
		//============Personal Info   ===========
		JLabel personalInfoLabel = new JLabel("Personal Information");
		personalInfoLabel.setBounds(20,top-30,200,30); //X,Y,W,H
		personalInfoLabel.setFont(font15);
		super.add(personalInfoLabel);
		JLabel nameLabel = new JLabel("Full Name");
		nameLabel.setBounds(20,top,200,30); //X,Y,W,H
		nameLabel.setFont(font15);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(20,top+=gap,200,30); //X,Y,W,H
		nameTextField.setFont(font15);
		
		super.add(nameLabel);
		super.add(nameTextField);
		 //============ Number Entry  ===========
		JLabel idLabel = new JLabel("Id ");
		idLabel.setBounds(20, top+=gap,200,30); //X,Y,W,H
		idLabel.setFont(font15);
		
		idTextField = new JTextField();
		idTextField.setBounds(20,top+=gap,200,30); //X,Y,W,H
		idTextField.setFont(font15);
		super.add(idLabel);
		super.add(idTextField);
		
		//============Leave Date Entry  ===========
		JLabel leaveDate = new JLabel("Leave Date");
		leaveDate.setBounds(20,top+=gap,200,30); //X,Y,W,H
		leaveDate.setFont(font15);
		
		leaveDateTextField = new JTextField();
		leaveDateTextField.setBounds(20,top+=gap,200,30); //X,Y,W,H
		leaveDateTextField.setFont(font15);
		super.add(leaveDate);
		super.add(leaveDateTextField);
		
		//============Email Adress Entry  ===========
		JLabel eMailLabel = new JLabel("E-mail ");
		eMailLabel.setBounds(20,top+=gap,200,30); //X,Y,W,H
		eMailLabel.setFont(font15);
		
		eMailTextField = new JTextField();
		eMailTextField.setBounds(20,top+=gap,200,30); //X,Y,W,H
		eMailTextField.setFont(font15);
		super.add(eMailLabel);
		super.add(eMailTextField);
		
		//============Phone Number   ===========
		JLabel phoneNumLabel = new JLabel("Your Phone Number ");
		phoneNumLabel.setBounds(20,top+=gap,200,30); //X,Y,W,H
		phoneNumLabel.setFont(font15);
		
		phoneNumTextField = new JTextField();
		phoneNumTextField.setBounds(20,top+=gap,200,30); //X,Y,W,H
		phoneNumTextField.setFont(font15);
		super.add(phoneNumLabel);
		super.add(phoneNumTextField);
		
		
		 
		 
		//////////////////////////////////////////////////////////////////////////////
		//------------------------ CENTER COMPONENTS -------------------------------//
		//////////////////////////////////////////////////////////////////////////////
		 
	    int cTop=150;
		//============Education Info   ===========
		JLabel eduLabel = new JLabel("Education Information ");
		eduLabel.setBounds(550,cTop-30,200,30); //X,Y,W,H
		eduLabel.setFont(font15);
		super.add(eduLabel);
		
		JLabel creditLabel = new JLabel("Complete Credit");
		creditLabel.setBounds(550,cTop,200,30); //X,Y,W,H
		creditLabel.setFont(font15);
		
		completeTextField = new JTextField();
		completeTextField.setBounds(550,cTop+=gap,200,30); //X,Y,W,H
		completeTextField.setFont(font15);
		
		super.add(creditLabel);
		super.add(completeTextField);
		
		
		//============ Result Entry  ===========
		JLabel cgpaLabel = new JLabel("CGPA");
		cgpaLabel.setBounds(550,cTop+=gap,200,30); //X,Y,W,H
		cgpaLabel.setFont(font15);
		
		cgpaTextField = new JTextField();
		cgpaTextField.setBounds(550,cTop+=gap,200,30); //X,Y,W,H
		cgpaTextField.setFont(font15);
		super.add(cgpaLabel);
		super.add(cgpaTextField);
		
		
		
		//============Hsc Background   ===========
		JLabel reasonLabel = new JLabel("Reason For Leave ");
		reasonLabel.setBounds(550,cTop+=gap,200,30); //X,Y,W,H
		reasonLabel.setFont(font15);
		
		reasonTextField = new JTextField();
		reasonTextField.setBounds(550,cTop+=gap,200,90); //X,Y,W,H
		reasonTextField.setFont(font15);
		super.add(reasonLabel);
		super.add(reasonTextField);
		
	  
		///////////////// Apply  ///////////////
		
		applyButton = new JButton("Apply");
		applyButton.setBounds(700,550,200,30); //X,Y,W,H
		applyButton.setBackground(Color.DARK_GRAY);
		applyButton.setForeground(Color.WHITE);
		applyButton.setFont(font15);
		//applyButton.addActionListener(this);
		super.add(applyButton);
		
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
		//================= ADD ALL THE COMPONENTS TO CONTAINER ======================//
		
		 
		 
		//================= DISPLAY THE FRAME ======================//
		super.setVisible(true);
		
	}
 
public void actionPerformed(ActionEvent e){
		 
		 
		if(applyButton == e.getSource()){
			System.out.println("CLEAR CLICKED");
			 
		}else if (backBtn == e.getSource()) {
          application.setVisible(true);
          this.dispose();
        }
	}
	
}