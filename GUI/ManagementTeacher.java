package GUI;
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*; 
import Entity.*;
import EntityList.*;


public class ManagementTeacher extends JFrame implements ActionListener{
	Font titleFont = new Font("Cambria",Font.BOLD,30);
	Font font15 = new Font("Cambria",Font.BOLD,15);
	 
	JTextField searchTextField,deleteTextField;
	
	JButton  searchButton,deleteButton,clearButton,showAllButton,backBtn;
	
	JTextArea textArea;
	
	TeacherList teacherList;
	DetailsOpenGUI detailsOpenGUI;
	public ManagementTeacher(TeacherList teacherList,DetailsOpenGUI detailsOpenGUI){
		
		// Intialization of Frame  
		super("Teacher ");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(940,650); //width, height
		super.setLocation(170,0); //X, Y
		super.getContentPane().setBackground(new Color(50,212,32));
		super.setLayout(null);//responsive design 
		
		this.teacherList = teacherList;
		this.detailsOpenGUI = detailsOpenGUI;
		
		// Frame Components  
		// Title 
		JLabel title = new JLabel("Welcome to view details");
		title.setBounds(230,10,500,50); //X,Y,W,H
		title.setFont(titleFont);
		this.add(title); 
		
		//  Sub Title 
		JLabel subTitle = new JLabel("Teachers Details");
		subTitle.setBounds(300,60,320,50); //X,Y,W,H
		subTitle.setFont(new Font("Cambria",Font.BOLD,25));
		this.add(subTitle);
	 
 
 
		// Teacher INFORMATION DISPLAY  AREA  
		textArea = new JTextArea();
		textArea.setFont(font15);
		textArea.setEditable(false); 
		showAllTeacherInScreen();
				
		JScrollPane jsp = new JScrollPane(textArea);
		jsp.setBounds(80,140,750,350);
		super.add(jsp);
		
		 
		
		// Get All Teacher Button  
		showAllButton = new JButton("Show ALL Teachers");
		showAllButton.setBounds(700,520,200,30); //X,Y,W,H
		showAllButton.setBackground(Color.BLUE);
		showAllButton.setForeground(Color.WHITE);
		showAllButton.setFont(font15);
		showAllButton.addActionListener(this);  
		this.add(showAllButton);
		// Clear Button 
		clearButton = new JButton("CLEAR SCREEN");
		clearButton.setBounds(700,560,200,30); //X,Y,W,H
		clearButton.setBackground(Color.DARK_GRAY);
		clearButton.setForeground(Color.WHITE);
		clearButton.setFont(font15);
		clearButton.addActionListener(this);
		
		this.add(clearButton);
 
		// Teacher Search  
		JLabel searchLabel = new JLabel("Search By Teacher ID");
		searchLabel.setBackground(Color.YELLOW);
		searchLabel.setBounds(375,490,200,30); //X,Y,W,H 700,560,200,30
		searchLabel.setFont(font15);
		
		searchTextField = new JTextField();
		searchTextField.setBounds(375,520,200,30); //X,Y,W,H
		searchTextField.setFont(font15);
		
		searchButton = new JButton("SEARCH");
		searchButton.setBounds(375,560,200,30); //X,Y,W,H
		searchButton.setBackground(Color.YELLOW); 
		searchButton.setFont(font15);
		searchButton.addActionListener(this);
		
		this.add(searchLabel);
		this.add(searchTextField);
		this.add(searchButton);

		
		//  Teacher Delete Entry 
		JLabel deleteLabel = new JLabel("Delete By Teacher ID");
		deleteLabel.setBounds(50,490,200,30); //X,Y,W,H
		deleteLabel.setFont(font15);
		
		deleteTextField = new JTextField();
		deleteTextField.setBounds(50,520,200,30); //X,Y,W,H
		deleteTextField.setFont(font15);
		
		deleteButton = new JButton("DELETE");
		deleteButton.setBounds(50,560,200,30); //X,Y,W,H
		deleteButton.setBackground(Color.RED);
		deleteButton.setForeground(Color.WHITE);
		deleteButton.setFont(font15);
		deleteButton.addActionListener(this);
		this.add(deleteLabel);
		this.add(deleteTextField);
		this.add(deleteButton);
		
		//Back Button 
		
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
 
		if(searchButton == e.getSource()){
			System.out.println("Search Clicked" );
			
			//Teacher b = teacherList.getById( searchTextField.getText() );
			Teacher b = teacherList.getById(searchTextField.getText());
			if(b!=null){
				textArea.setText( b.getTeacherAcademicInfoAsString() );
			}
			else{
				JOptionPane.showMessageDialog(this,"NO Teacher FOUND","Alert",JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(deleteButton == e.getSource()){
			System.out.println("Delete Clicked" );
			Teacher b = teacherList.deleteById( deleteTextField.getText() );
			if(b!=null){
				textArea.setText( b.deleteByIdGUI() );
				textArea.setText( "Delete successful");
			}
			else{
				textArea.setText( "NO Teacher FOUND\n" );
			 
			}
			showAllTeacherInScreen();
		}
		else if(showAllButton == e.getSource()){
			showAllTeacherInScreen();
		}
		else if(clearButton == e.getSource()){
			System.out.println("Clear Clicked" );
			textArea.setText("");
		}
		else if(backBtn == e.getSource()){
			detailsOpenGUI.setVisible(true);
			this.dispose();
		}
	}
	
	public void showAllTeacherInScreen(){
		textArea.setText(teacherList.getAll());
	}
}
