package guiWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoginWindow implements ActionListener {
	
	JFrame window = new JFrame();
	JButton login = new JButton("Login");
	JButton cancel = new JButton("Cancel");
	
	JTextField username = new JTextField();
	JPasswordField password = new JPasswordField();
	
	public void initWindow(){
		
		JLabel userLabel = new JLabel("Username");
		
		
		JLabel passLabel = new JLabel("Password");
		
		
		login.addActionListener(this);
		cancel.addActionListener(this);
		
		GridLayout gl = new GridLayout(3,2,5,5);
		window.setLayout(gl);
		
		window.add(userLabel);
		window.add(username);
		
		window.add(passLabel);
		window.add(password);
		
		window.add(login);
		window.add(cancel);
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Login Window");
		window.setSize(300,150);
		window.setLocation(200, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		
			if(e.getSource() == cancel){
				window.dispose();
			}
			
			else if(e.getSource() == login){
				
				String u = username.getText();
				String p = password.getText();
				
				JOptionPane.showMessageDialog(null, "Username " + u + " Password " + p);
				 
			}
		
	}
	

}
