package travelGuide;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class NewProfile extends JFrame implements ActionListener{
	private JButton register = new JButton("Sign In");
	private JButton cancel = new JButton("Cancel");
	private JTextField nameField = new JTextField();
	private JTextField emailField = new JTextField();
	private JTextField phoneField = new JTextField();
	private JTextField countryField = new JTextField();
	private JPasswordField passField = new JPasswordField();
	private static int count;
	
	
	public NewProfile (){
		
	}


	public void showWindow(){
		
		JLabel name=new JLabel("Name");
		JLabel email=new JLabel("Email");
		JLabel phone=new JLabel("Phone Number");
		JLabel password=new JLabel("Password");
		JLabel country=new JLabel("Country");;
		GridLayout gl = new GridLayout(12,0,0,0);
		setLayout(gl);
		
		add(name);
		add(nameField);
		
		add(email);
		add(emailField);
		
		add(password);
		add(passField);
		
		add(country);
		add(countryField);
		add(phone);
		add(phoneField);
	
		
		add(register);
		add(cancel);
		setTitle("Register");
		setSize(400,500);
		setLocation(400,100);
		setVisible(true);
		
		cancel.addActionListener(this);
		register.addActionListener(this);
		
	
		
	}
	public static int getCount(){
		return count;
	}
	
	public void fileWrite(){
		File file=new File("info.txt");
		Info[] ic=new Info[1000];
		Info b=new Info();
		try{
			ic=b.getFileInfo();
			
			FileWriter fw = new FileWriter(file,true);
			
			if(b.getCount()>=1){
				
				fw.write("\n");
			}

			fw.write(nameField.getText()+"\n");
			fw.write(passField.getText()+"\n");
			fw.write(emailField.getText()+"\n");
			fw.write(phoneField.getText()+"\n");
			fw.write(countryField.getText());
			
			
			fw.close();
			count++;
			
		}
			catch(Exception x){
				System.out.println("Problem with registration");
			}
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==register){	
			fileWrite();
			Login lc=new Login();
			lc.showWindow();
			dispose();
		}
		else if(e.getSource() == cancel){
			System.exit(0);	
		}
		
	
	}

}
