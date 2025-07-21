package LoginPage;
import javax.swing.*;
import java.awt.*;
import GUI.*;
import java.awt.event.*;
import Entity.*;
import EntityList.*;
import File.*;

public class LoginPage extends JFrame implements ActionListener{
	JTextField nameTextField;
	JPasswordField passField;
	
	JButton loginButton;
	
	Font font = new Font("Cambria",Font.BOLD,20);
	
	public LoginPage(){
		
		super("Log in ");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    // int width = (int) screenSize.getWidth();
	    // int height = (int) screenSize.getHeight();
		super.setSize(1040,650); //width, height
		super.setLocation(170,0); //X, Y
		super.getContentPane().setBackground(new Color(173,216,230));
		super.setLayout(null);//responsive design 
		
 
		
		JLabel nameLabel = new JLabel("User Name");
		nameLabel.setFont(font);
		nameLabel.setBounds(250,250,200,40);
		this.add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setFont(font);
		nameTextField.setBounds(250+130,250,200,40);
		this.add(nameTextField);
		
		JLabel passLabel = new JLabel( new ImageIcon("./Resources/Icon/passKeyIcon.jpg") );
		passLabel.setFont(font);
		passLabel.setBounds(250,300,50,40);
		this.add(passLabel);
		
		passField = new JPasswordField();
		passField.setFont(font);
		passField.setBounds(250+130,300,200,40);
		passField.setEchoChar('*');
		this.add(passField);
		
		loginButton = new JButton("Login");
		loginButton.setFont(font);
		loginButton.setBounds(250+130+100,350,100,30);
		loginButton.addActionListener(this);
		this.add(loginButton);
		
		 ImageIcon icon = new ImageIcon("./Resources/Icon/L.png");
         this.setIconImage(icon.getImage()); // Set the image as the icon for this JFrame

        JLabel label = new JLabel("Icon Changed!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(label, BorderLayout.CENTER); // Adding a label to visualize the icon change

		this.setVisible(true);
	} 
	
	//@Override
	public void actionPerformed(ActionEvent e){
			
			String userName = nameTextField.getText();
			String userPass = new String(passField.getPassword());
			
			if(loginButton == e.getSource()){
				if(FileIO.checkUserFromFile(userName,userPass)){
					JOptionPane.showMessageDialog(this,"Login Successfull");
					
					 ManagementGUI management = new ManagementGUI();
			          
             
			         this.setVisible(false);
					
				}
				else{
					JOptionPane.showMessageDialog(this,"Login Failed");
				}
			}
			
	}
}