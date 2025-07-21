package GUI;
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*; 
import Entity.*;
import EntityList.*;
import File.*;

public class AddUpdatePageStaff extends JFrame implements ActionListener{
	Font titleFont = new Font("Cambria",Font.BOLD,30);
	Font font15 = new Font("Cambria",Font.BOLD,15);
	 
	JTextField searchTextField,deleteTextField,idTextField,nameTextField,phoneNumberTextField,emailTextField,
departmentTextField,joiningTextField,roomTextField,workingTextField;
	
	JButton  updateButton,addButton,backBtn;
	
	JTextArea textArea;
	
	StaffList staffList;
	AddUpdateGUI addUpdateGUI;
	public AddUpdatePageStaff(StaffList staffList,AddUpdateGUI addUpdateGUI){
		
		// Intialization of Frame  
		super("Staff");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(940,650); //width, height
		super.setLocation(170,0); //X, Y
		super.getContentPane().setBackground(new Color(50,212,32));
		super.setLayout(null);//responsive design 
		
		this.staffList = staffList;
		this.addUpdateGUI = addUpdateGUI;
		
		
		// Frame Components  
		// Title 
		JLabel title = new JLabel("Welcome to view details");
		title.setBounds(230,10,500,50); //X,Y,W,H
		title.setFont(titleFont);
		this.add(title); 
		
		//  Sub Title 
		JLabel subTitle = new JLabel("Staff Details");
		subTitle.setBounds(300,60,320,50); //X,Y,W,H
		subTitle.setFont(new Font("Cambria",Font.BOLD,25));
		this.add(subTitle);
 
		
		int top = 150;
        int gap = 40;
        int left = 50; 
//============ID Entry  ===========
         JLabel idLabel = new JLabel("ID");
         idLabel.setBounds(left, top, 200, 30);
         idLabel.setFont(font15);

         idTextField = new JTextField();
         idTextField.setBounds(left, top += gap, 200, 30);
         idTextField.setFont(font15);
         add(idLabel);
         add(idTextField);
//============Name Entry  ===========      
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(left, top += gap, 200, 30);
        nameLabel.setFont(font15);

        nameTextField = new JTextField();
        nameTextField.setBounds(left, top += gap, 200, 30);
        nameTextField.setFont(font15);
        add(nameLabel);
        add(nameTextField);
//============Phone Number Entry  ===========
        JLabel phoneNumberLabel = new JLabel("Phone Number");
        phoneNumberLabel.setBounds(left, top += gap, 200, 30);
        phoneNumberLabel.setFont(font15);

        phoneNumberTextField = new JTextField();
        phoneNumberTextField.setBounds(left, top += gap, 200, 30);
        phoneNumberTextField.setFont(font15);
        add(phoneNumberLabel);
        add(phoneNumberTextField);

//============Email Address Entry  ===========
        JLabel emailLabel = new JLabel("Email Address");
        emailLabel.setBounds(left, top += gap, 200, 30);
        emailLabel.setFont(font15);

        emailTextField = new JTextField();
        emailTextField.setBounds(left, top += gap, 200, 30);
        emailTextField.setFont(font15);
        add(emailLabel);
        add(emailTextField);

//============Middle  Entries  ===========
        int Mtop=150;
		int mid = 670;
        //============Student Department Entry  ===========
        

        JLabel joiningLabel = new JLabel("Joining Date");
        joiningLabel.setBounds(mid, Mtop , 200, 30);
        joiningLabel.setFont(font15);

        joiningTextField = new JTextField();
        joiningTextField.setBounds(mid, Mtop += gap, 200, 30);
        joiningTextField.setFont(font15);
        add(joiningLabel);
        add(joiningTextField);
		
        JLabel departmentLabel = new JLabel("Department");
        departmentLabel.setBounds(mid,Mtop += gap, 200, 30);
        departmentLabel.setFont(font15);

        departmentTextField = new JTextField();
        departmentTextField.setBounds(mid, Mtop += gap, 200, 30);
        departmentTextField.setFont(font15);
        add(departmentLabel);
        add(departmentTextField);
        JLabel roomLabel  = new JLabel("Room Number");
        roomLabel .setBounds(mid, Mtop += gap, 200, 30);
        roomLabel .setFont(font15);


        roomTextField = new JTextField();
        roomTextField.setBounds(mid, Mtop += gap, 200, 30);
        roomTextField.setFont(font15);
        add(roomLabel );
        add(roomTextField);

        JLabel workingLabel = new JLabel("Working Hour");
        workingLabel.setBounds(mid, Mtop += gap, 200, 30);
        workingLabel.setFont(font15);

        workingTextField = new JTextField();
        workingTextField.setBounds(mid, Mtop += gap, 200, 30);
        workingTextField.setFont(font15);
        add(workingLabel);
        add(workingTextField);
		
		  
		// Get All student Button  
		addButton = new JButton("ADD");
		addButton.setBounds(400,520,200,30); //X,Y,W,H
		addButton.setBackground(Color.BLUE);
		addButton.setForeground(Color.WHITE);
		addButton.setFont(font15);
		addButton.addActionListener(this);  
		this.add(addButton);
		// Clear Button 
		updateButton = new JButton("Update");
		updateButton.setBounds(400,560,200,30); //X,Y,W,H
		updateButton.setBackground(Color.DARK_GRAY);
		updateButton.setForeground(Color.WHITE);
		updateButton.setFont(font15);
		updateButton.addActionListener(this);
		
		this.add(updateButton);
  
	 
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
 
		 
		if(addButton == e.getSource()){
			
			if(addButton == e.getSource()){
			//showAllstudentInScreen();
			
			if(
				!idTextField.getText().isEmpty()&&
				!nameTextField.getText().isEmpty()&&
				!phoneNumberTextField.getText().isEmpty()&&
				!emailTextField.getText().isEmpty()&&
				!joiningTextField.getText().isEmpty()&&
				!departmentTextField.getText().isEmpty()&&
				!roomTextField.getText().isEmpty()&&
				!workingTextField.getText().isEmpty()
				
			){

				if( staffList.getById(idTextField.getText()) == null){
					
					Staff b = new Staff(
							idTextField.getText(),
							nameTextField.getText(),
							phoneNumberTextField.getText(),
							emailTextField.getText(),
							joiningTextField.getText(),
							departmentTextField.getText(),
							roomTextField.getText(),
							workingTextField.getText()
							 
						);
					
					staffList.insert(b);
					FileStaffIO.writeStaffInFile(b);
					
					//reloadAllBooks();
				}
				else{
					JOptionPane.showMessageDialog(this,"This ID is Already in use, Provide Another ID","Provide Unique ID",JOptionPane.ERROR_MESSAGE);
				}
				
			}
			else{
				JOptionPane.showMessageDialog(this,"Please Provide all Information for the Book","Missing Information",JOptionPane.ERROR_MESSAGE);
			}
			
		}
		 
		}
		else if(updateButton == e.getSource()){
			System.out.println("Clear Clicked" );
			
			 
			 
		}else if(backBtn == e.getSource()){
			addUpdateGUI.setVisible(true);
			this.dispose();
		}
	}
	
	 
}