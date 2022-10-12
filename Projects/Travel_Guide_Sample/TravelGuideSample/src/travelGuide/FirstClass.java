package travelGuide;

import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
public class FirstClass extends JFrame implements  ActionListener{
	
	 private JButton login = new JButton("Existing Profile");
	 private JButton cancel = new JButton("Cancel");
	 private JButton register = new JButton("New profile");
	 
		public FirstClass(){
			GridLayout gl=new GridLayout(3,0,0,5);
			setLayout(gl);
			
			add(login);
			add(register);
			add(cancel);
			
			setSize(300,300);
			setLocation(500,200);
			setVisible(true);
			
			login.addActionListener(this);
			register.addActionListener(this);
			cancel.addActionListener(this);
			
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==login){
				Login LC =new Login();
				LC.showWindow();
				dispose();
			}
			
			else if(e.getSource()==register){
				NewProfile RC =new NewProfile();
				RC.showWindow();
				dispose();
			}
			else if(e.getSource()==cancel){
				System.exit(0);
			}
		}
}
