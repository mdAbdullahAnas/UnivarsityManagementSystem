package GUI;
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*; 
import Entity.*;
import EntityList.*;
import File.*;

public class AddUpdatePage extends JFrame implements ActionListener{
	Font titleFont = new Font("Cambria",Font.BOLD,30);
	Font font15 = new Font("Cambria",Font.BOLD,15);
	 
	JTextField searchTextField,deleteTextField,idTextField,nameTextField,phoneNumberTextField,emailTextField,
departmentTextField,course1TextField,course2TextField,course3TextField,
creditTextField, cgpaTextField;
	
	JButton  updateButton,addButton,backBtn;
	
	JTextArea textArea;
	
	StudentList studentList;
	AddUpdateGUI addUpdateGUI;
	public AddUpdatePage(StudentList studentList,AddUpdateGUI addUpdateGUI){
		
		// Intialization of Frame  
		super("Student");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(940,650); //width, height
		super.setLocation(170,0); //X, Y
		super.getContentPane().setBackground(new Color(50,212,32));
		super.setLayout(null);//responsive design 
		
		this.studentList = studentList;
		this.addUpdateGUI = addUpdateGUI;
		
		
		// Frame Components  
		// Title 
		JLabel title = new JLabel("Welcome to view details");
		title.setBounds(230,10,500,50); //X,Y,W,H
		title.setFont(titleFont);
		this.add(title); 
		
		//  Sub Title 
		JLabel subTitle = new JLabel("Students Details");
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
		int mid = 370;
        //============Student Department Entry  ===========
        JLabel departmentLabel = new JLabel("Student Department");
        departmentLabel.setBounds(mid, Mtop , 200, 30);
        departmentLabel.setFont(font15);

        departmentTextField = new JTextField();
        departmentTextField.setBounds(mid, Mtop += gap, 200, 30);
        departmentTextField.setFont(font15);
        add(departmentLabel);
        add(departmentTextField);

        JLabel course1Label = new JLabel("Course 1");
        course1Label.setBounds(mid, Mtop += gap, 200, 30);
        course1Label.setFont(font15);

        course1TextField = new JTextField();
        course1TextField.setBounds(mid, Mtop += gap, 200, 30);
        course1TextField.setFont(font15);
        add(course1Label);
        add(course1TextField);

        JLabel course2Label = new JLabel("Course 2");
        course2Label.setBounds(mid, Mtop += gap, 200, 30);
        course2Label.setFont(font15);


        course2TextField = new JTextField();
        course2TextField.setBounds(mid, Mtop += gap, 200, 30);
        course2TextField.setFont(font15);
        add(course2Label);
        add(course2TextField);

        JLabel course3Label = new JLabel("Course 3");
        course3Label.setBounds(mid, Mtop += gap, 200, 30);
        course3Label.setFont(font15);

        course3TextField = new JTextField();
        course3TextField.setBounds(mid, Mtop += gap, 200, 30);
        course3TextField.setFont(font15);
        add(course3Label);
        add(course3TextField);
		
		

//============Right Entry  ===========
        int Rtop= 150;
		int right=680;
        JLabel creditLabel = new JLabel("Credit Compplete");
        creditLabel.setBounds(right, Rtop, 200, 30);
        creditLabel.setFont(font15);
		
        creditTextField = new JTextField();
        creditTextField.setBounds(right, Rtop += gap, 200, 30);
        creditTextField.setFont(font15);
        
        add(creditLabel);
		add(creditTextField);
		
		 
        JLabel cgpaLabel = new JLabel("CGPA");
        cgpaLabel.setBounds(right, Rtop += gap, 200, 30);
        cgpaLabel.setFont(font15);
        cgpaTextField = new JTextField();
        cgpaTextField.setBounds(right, Rtop += gap, 200, 30);
        cgpaTextField.setFont(font15);
		
        
        add(cgpaLabel);
		add(cgpaTextField);
		
		
		
		
		
		
		
		
		
		
		
		
		// Get All student Button  
		addButton = new JButton("ADD");
		addButton.setBounds(700,520,200,30); //X,Y,W,H
		addButton.setBackground(Color.BLUE);
		addButton.setForeground(Color.WHITE);
		addButton.setFont(font15);
		addButton.addActionListener(this);  
		this.add(addButton);
		// Clear Button 
		updateButton = new JButton("Update");
		updateButton.setBounds(700,560,200,30); //X,Y,W,H
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
			System.out.println("ADD CLICKED");
			
			if(
				!idTextField.getText().isEmpty() &&
				!nameTextField.getText().isEmpty() &&
				!phoneNumberTextField.getText().isEmpty() &&
				!emailTextField.getText().isEmpty() &&
				!departmentTextField.getText().isEmpty()&&
				!course1TextField.getText().isEmpty()&&
				!course2TextField.getText().isEmpty()&&
				!course3TextField.getText().isEmpty()&&
				!creditTextField.getText().isEmpty()&&
				!cgpaTextField.getText().isEmpty()
				
			){

				if( studentList.getById(idTextField.getText()) == null){
					
					Student b = new Student(
							idTextField.getText(),
							nameTextField.getText(),
							phoneNumberTextField.getText(),
							emailTextField.getText(),
							departmentTextField.getText() ,
							course1TextField.getText(),
							course2TextField.getText(),
							course3TextField.getText(),
							Integer.parseInt( creditTextField.getText()),
							Double.parseDouble(cgpaTextField.getText())
						);
					
					studentList.insert(b);
					FileIO.writeStudentInFile(b);
					
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
			System.out.println("Update Clicked" );
			 
		}else if(backBtn == e.getSource()){
			addUpdateGUI.setVisible(true);
			this.dispose();
		}
	}
	
	 
}
