package Application.ExStudent;
import GUI.ManagementGUI;
 
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class FamousExStudents extends JFrame implements ActionListener {
    Font titleFont = new Font("Cambria", Font.BOLD, 30);
    Font font15 = new Font("Cambria", Font.BOLD, 15);

    JButton backBtn;
    JTable table;
    JScrollPane scrollPane;
	ManagementGUI managementGUI;
    String[] columnNames = {"Name", "Occupation", "Phone Number"};
    Object[][] data = {
            {"Shakib Al Hasan", "Cricketer", "0101010101"},
            {"Mahmudullah Riyad", "Cricketer", "01984298833"},
			{"Sabila Nur ", "Actor ", "01923839229"},
			{"Rifath Mahmud  ", "Teacher ", "01713837226"},
			{"Md. Abdullah Anas", "Amazon", "01521799812"},
			{"Mst Hafsa ", "Google ", "01254673822"}
            // Add more rows here if needed
    };

    public FamousExStudents(ManagementGUI managementGUI ) {
        // Initialization of Frame
        super("Ex student");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(940, 650);
        setLocation(170, 0);
        getContentPane().setBackground(new Color(50, 212, 32));
        setLayout(new BorderLayout());
		this.managementGUI = managementGUI;

        // Table creation
        table = new JTable(new DefaultTableModel(data, columnNames));
        table.setFont(new Font("Cambria", Font.PLAIN, 20));
        table.setRowHeight(30);
        scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Back Button
        backBtn = new JButton("Back");
        backBtn.setBackground(Color.RED);
        backBtn.setForeground(Color.WHITE);
        backBtn.setFont(font15);
        backBtn.addActionListener(this);
        add(backBtn, BorderLayout.NORTH);
		
		 
       
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (backBtn == e.getSource()){
			managementGUI.setVisible(true);
			 dispose();
		}
    }

    // public static void main(String[] args) {
        // SwingUtilities.invokeLater(() -> new FamousExStudents());
    // }
}
