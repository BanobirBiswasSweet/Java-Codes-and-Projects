package gui001;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Names implements ActionListener{
	
	private JFrame window=new JFrame();
	
	private JButton show=new JButton("Show Fullname");
	private JButton exit=new JButton("Exit");
	
	
	JTextField first_Name=new JTextField();
	JTextField middle_Name=new JTextField();
	JTextField last_Name=new JTextField();
	JTextField show_Name=new JTextField();
	
	
	public void initWindow(){
		
		JLabel firstNameLabel=new JLabel("First Name: ");
		JLabel middleNameLabel=new JLabel("Middle Name: ");
		JLabel lastNameLabel=new JLabel("Last Name: ");
		JLabel showNameLabel=new JLabel("Fullname: ");
		
		GridLayout gl=new GridLayout(5, 2, 10, 10);
		window.setLayout(gl);
		
		show.addActionListener(this);
		exit.addActionListener(this);
		
		window.add(firstNameLabel);
		window.add(first_Name);
		
		window.add(middleNameLabel);
		window.add(middle_Name);
		
		window.add(lastNameLabel);
		window.add(last_Name);
		
		window.add(showNameLabel);
		window.add(show_Name);
		
		window.add(show);
		window.add(exit);
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Name");
		window.setSize(500, 250);
		window.setLocation(300, 250);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		
        if(e.getSource()==exit){
			
			window.dispose();
		}
		
        else if(e.getSource()==show){
			
			String f=first_Name.getText();
			String m=middle_Name.getText();
			String l=last_Name.getText();
			
			show_Name.setText(f+" "+m+" "+l);
			
		}
	
	}

}
