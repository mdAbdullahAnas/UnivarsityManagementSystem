package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    Font titleFont = new Font("Cambria", Font.BOLD, 30);
    Font subTitleFont = new Font("Cambria", Font.BOLD, 25);
    Font textFont = new Font("Cambria", Font.PLAIN, 15);

    JButton backBtn;
    ManagementGUI managementGUI;

    public About(ManagementGUI managementGUI) {
        super("About");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(940, 650);
        setLocation(170, 0);
        getContentPane().setBackground(new Color(50, 212, 32));
        setLayout(null);

        this.managementGUI = managementGUI;

        JLabel title = new JLabel("Why Student Study Here");
        title.setBounds(270, 10, 500, 50);
        title.setFont(titleFont);
        add(title);

        JLabel subTitle = new JLabel("Here is the reason: ");
        subTitle.setBounds(50, 70, 820, 50);
        subTitle.setFont(subTitleFont);
        add(subTitle);

        JTextArea textArea = new JTextArea("Since its inception, AIUB has been committed to provide, maintain, and enhance an educational environment that is conducive to learning, not only for those who come to learn but also for those who impart it. For over a decade, we have been committed to provide students with an enriching undergraduate and graduate experience, with the right combination of all the essential components required for attaining excellence in learning. All our infrastructural and research facilities, along with the support of competent and compassionate faculty, make AIUB a truly dynamic learning environment, where tomorrow’s leaders are created. If you are looking for a state-of-the-art academic program and a faculty that is second to none, aiming to acquire an educational experience that will propel you towards the future, then AIUB is where you want to be. Over 10,000 students are currently pursuing their dreams, following the footsteps of nearly 25,000 graduates before them, who experienced AIUB’s high standard and excellence in education. Over the years, graduates have successfully placed themselves in every imaginable sphere of the career spectrum, both nationally and internationally, making their mark in the world, doing us and the nation proud. So, what are you waiting for? Come, join AIUB, and be a force to be reckoned with!");
        textArea.setBounds(50, 120, 820, 400);
        textArea.setFont(textFont);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        add(textArea);

        backBtn = new JButton("Back");
        backBtn.setBounds(10, 20, 100, 30);
        backBtn.setBackground(Color.RED);
        backBtn.setForeground(Color.WHITE);
        backBtn.setFont(textFont);
        backBtn.addActionListener(this);
        add(backBtn);

        ImageIcon icon = new ImageIcon("./Resources/Icon/L.png");
        setIconImage(icon.getImage());

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (backBtn == e.getSource()) {
            managementGUI.setVisible(true);
            dispose();
        }
    }
}
