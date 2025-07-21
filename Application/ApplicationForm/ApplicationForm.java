package Application.ApplicationForm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import GUI.*;
import Application.Application;

 
public class ApplicationForm extends JFrame implements ActionListener {
	Font titleFont = new Font("Cambria",Font.BOLD,30);
	Font font15 = new Font("Cambria",Font.BOLD,15);
	
	JTextField nameTextField,birthDateTextField,eMailTextField,
	phoneNumTextField,gurdiansPhoneNumber,
	collegeNameTextField,hscResultTextField,rollNumTextField,
	hscBackgroundTextField,passDateTextField,pemanentTextField,
	presentTextField, hobbyTextField;
  
	
	JButton applyButton , backBtn;
	
	
	Application application;
	
	public ApplicationForm(Application application){
		super("Application Form");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(940,650); //width, height
		super.setLocation(170,0); //X, Y
		super.getContentPane().setBackground(new Color(0,255,255));
		super.setLayout(null);//responsive design 
        this.application = application;
		
		//============= Title ===========
		JLabel title = new JLabel("Application Form for Admission");
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
		
		
		//============Birth Date Entry  ===========
		JLabel birthDateLabel = new JLabel("Birth Date");
		birthDateLabel.setBounds(20,top+=gap,200,30); //X,Y,W,H
		birthDateLabel.setFont(font15);
		
		birthDateTextField = new JTextField();
		birthDateTextField.setBounds(20,top+=gap,200,30); //X,Y,W,H
		birthDateTextField.setFont(font15);
		super.add(birthDateLabel);
		super.add(birthDateTextField);
		
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
		
		
		//============Gurdian's  Phone Number   ===========
		JLabel gurdiansPhoneNumberLabel = new JLabel("Gurdian's Number");
		gurdiansPhoneNumberLabel.setBounds(20,top+=gap,200,30); //X,Y,W,H
		gurdiansPhoneNumberLabel.setFont(font15);
		
		
		gurdiansPhoneNumber = new JTextField();
		gurdiansPhoneNumber.setBounds(20,top+=gap,200,30); //X,Y,W,H
		gurdiansPhoneNumber.setFont(font15);
		super.add(gurdiansPhoneNumberLabel);
		super.add(gurdiansPhoneNumber);
		
		
		 
		//////////////////////////////////////////////////////////////////////////////
		//------------------------ CENTER COMPONENTS -------------------------------//
		//////////////////////////////////////////////////////////////////////////////
		 
	    int cTop=150;
		//============Education Info   ===========
		JLabel eduLabel = new JLabel("Education Background ");
		eduLabel.setBounds(350,cTop-30,200,30); //X,Y,W,H
		eduLabel.setFont(font15);
		super.add(eduLabel);
		
		JLabel collegeNameLabel = new JLabel("College Name");
		collegeNameLabel.setBounds(350,cTop,200,30); //X,Y,W,H
		collegeNameLabel.setFont(font15);
		
		collegeNameTextField = new JTextField();
		collegeNameTextField.setBounds(350,cTop+=gap,200,30); //X,Y,W,H
		collegeNameTextField.setFont(font15);
		
		super.add(collegeNameLabel);
		super.add(collegeNameTextField);
		
		
		//============Hsc Result Entry  ===========
		JLabel hscResultLabel = new JLabel("HSC Result");
		hscResultLabel.setBounds(350,cTop+=gap,200,30); //X,Y,W,H
		hscResultLabel.setFont(font15);
		
		hscResultTextField = new JTextField();
		hscResultTextField.setBounds(350,cTop+=gap,200,30); //X,Y,W,H
		hscResultTextField.setFont(font15);
		super.add(hscResultLabel);
		super.add(hscResultTextField);
		
		//============HSC Roll Number Entry  ===========
		JLabel hscRollnumLabel = new JLabel("HSC Roll Number  ");
		hscRollnumLabel.setBounds(350,cTop+=gap,200,30); //X,Y,W,H
		hscRollnumLabel.setFont(font15);
		
		rollNumTextField = new JTextField();
		rollNumTextField.setBounds(350,cTop+=gap,200,30); //X,Y,W,H
		rollNumTextField.setFont(font15);
		super.add(hscRollnumLabel);
		super.add(rollNumTextField);
		
		//============Hsc Background   ===========
		JLabel hscBackgroundLabel = new JLabel("Hsc Background");
		hscBackgroundLabel.setBounds(350,cTop+=gap,200,30); //X,Y,W,H
		hscBackgroundLabel.setFont(font15);
		
		hscBackgroundTextField = new JTextField();
		hscBackgroundTextField.setBounds(350,cTop+=gap,200,30); //X,Y,W,H
		hscBackgroundTextField.setFont(font15);
		super.add(hscBackgroundLabel);
		super.add(hscBackgroundTextField);
		
		
		//============Passing date  Phone Number   ===========
		JLabel passDateLabel = new JLabel("Passing date ");
		passDateLabel.setBounds(350,cTop+=gap,200,30); //X,Y,W,H
		passDateLabel.setFont(font15);
		
		
		passDateTextField = new JTextField();
		passDateTextField.setBounds(350,cTop+=gap,200,30); //X,Y,W,H
		passDateTextField.setFont(font15);
		super.add(passDateLabel);
		super.add(passDateTextField);
		
		
		//////////////////////////////////////////////////////////////////////////////
		//--------------------- RIGHT SIDE COMPONENTS ------------------------------//
		//////////////////////////////////////////////////////////////////////////////
		int rTop=150;
		//============Adress Info   ===========
		JLabel adressLabel = new JLabel("Adress");
		adressLabel.setBounds(700,rTop-30,200,30); //X,Y,W,H
		adressLabel.setFont(font15);
		super.add(adressLabel);
		
		JLabel pemanentLabel = new JLabel("Parmanent Adress");
		pemanentLabel.setBounds(700,rTop,200,30); //X,Y,W,H
		pemanentLabel.setFont(font15);
		
		pemanentTextField = new JTextField();
		pemanentTextField.setBounds(700,rTop+=gap,200,30); //X,Y,W,H
		pemanentTextField.setFont(font15);
		
		super.add(pemanentLabel);
		super.add(pemanentTextField);
		
		
		//============Present Adress Entry  ===========
		JLabel presentLabel = new JLabel("Present Adress");
		presentLabel.setBounds(700,rTop+=gap,200,30); //X,Y,W,H
		presentLabel.setFont(font15);
		
		presentTextField = new JTextField();
		presentTextField.setBounds(700,rTop+=gap,200,30); //X,Y,W,H
		presentTextField.setFont(font15);
		super.add(presentLabel);
		super.add(presentTextField);
		// Extra info 
		JLabel extraInfoLabel = new JLabel("Extra Information");
		extraInfoLabel.setBounds(700,rTop+=gap,200,30); //X,Y,W,H
		extraInfoLabel.setFont(font15);
		super.add(extraInfoLabel);
		
		//============Hobby Entry  ===========
		JLabel hobbyLabel = new JLabel("Hobby");
		hobbyLabel.setBounds(700,rTop+=gap,200,30); //X,Y,W,H
		hobbyLabel.setFont(font15);
		
		hobbyTextField = new JTextField();
		hobbyTextField.setBounds(700,rTop+=gap,200,30); //X,Y,W,H
		hobbyTextField.setFont(font15);
		super.add(hobbyLabel);
		super.add(hobbyTextField);
		 
		 
		
		///////////////// Clear Screen ///////////////
		
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