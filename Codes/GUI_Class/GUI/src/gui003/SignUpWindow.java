package gui003;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class SignUpWindow implements ActionListener {
	
	JFrame window=new JFrame();
	JButton signUp=new JButton("Sign Up");
	JButton can=new JButton("Cancel");
	
	JTextField first_Name=new JTextField();
	JTextField middle_Name=new JTextField();
	JTextField last_Name=new JTextField();
	JTextField bday=new JTextField();
	JPasswordField pass=new JPasswordField();
	JPasswordField con_Pass=new JPasswordField();
	
	public void initWindow(){
		
		JLabel firstNameLabel=new JLabel("First Name: ");
		JLabel middleNameLabel=new JLabel("Middle Name: ");
		JLabel lastNameLabel=new JLabel("Last Name: ");
		JLabel bdayLabel=new JLabel("Birth Date: ");
		JLabel passLabel=new JLabel("Enter Your Password: ");
		JLabel conPassLabel=new JLabel("Confirm Password: ");
		
		signUp.addActionListener(this);
		can.addActionListener(this);
		
		GridLayout gl=new GridLayout(7, 2, 10, 10);
		window.setLayout(gl);
		
		window.add(firstNameLabel);
		window.add(first_Name);
		
		window.add(middleNameLabel);
		window.add(middle_Name);
		
		window.add(lastNameLabel);
		window.add(last_Name);
		
		window.add(bdayLabel);
		window.add(bday);
		
		window.add(passLabel);
		window.add(pass);
		
		window.add(conPassLabel);
		window.add(con_Pass);
		
		window.add(signUp);
		window.add(can);
		
		
	}
	
	public void showWindow(){
		initWindow();
		
		window.setTitle("Sign UP Form");
		window.setSize(550, 300);
		window.setLocation(300, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==can){
			
			window.dispose();
		}
		
		else if(e.getSource()==signUp){
			
			String f=first_Name.getText();
			String m=middle_Name.getText();
			String l=last_Name.getText();
			String bd=bday.getText();
			String p=pass.getText();
			String cp=con_Pass.getText();
			
			if(p.equals(cp)){
			
			JOptionPane.showMessageDialog(null, "First Name: "+f+"\n"+"Middle Name: "+m+"\n"+"Last Name: "+l+"\n"+
			                               "Full Name: "+f+" "+m+" "+l+"\n"+"Birth Date: "+bd+"\n"+"Sign Up Successful");
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "Password Incorrect!! Try Again.");
				
			}
		}
	}
	

}
