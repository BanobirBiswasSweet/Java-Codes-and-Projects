package gui001;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Names implements ActionListener {
	
	JFrame window=new JFrame();
	
	JButton show=new JButton("Show Fullname");
	JButton exit=new JButton("Exit");
	
	JTextField first_Name= new JTextField();
	JTextField middle_Name=new JTextField();
	JTextField last_Name=new JTextField();
	JTextField show_Name=new JTextField();

	
	
	public void initWindow(){
		
		JLabel firstNameLabel=new JLabel("First Name: ");
		JLabel lastNameLabel=new JLabel("Last Name: ");
		JLabel middleNameLabel=new JLabel("Middle Name: ");
		JLabel showNameLabel=new JLabel("Fullname");
		
		
		show.addActionListener(this);
		exit.addActionListener(this);
		
		GridLayout gl = new GridLayout(5,2,10,10);
		window.setLayout(gl);
		
		window.add(firstNameLabel);
		window.add(first_Name);
		
		window.add(middleNameLabel);
		window.add(middle_Name);
		
		window.add(lastNameLabel);
		window.add(last_Name);
		
		window.add(showNameLabel);
		window.add(show_Name);
		show_Name.setEditable(false);
		
		window.add(show);
		window.add(exit);
		
		
	}
	
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Names");
		window.setSize(400, 200);
		window.setLocation(300, 300);
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
			
			show_Name.setText(f+" "+" "+m+" "+l+"");
		}
		
	}

}
