package travelGuide;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class Login extends JFrame implements ActionListener{
	JOptionPane jPane;
	private JButton login = new JButton("Login");
	private JButton cancel = new JButton("Cancel");
	private JButton register = new JButton("New profile");
	private JTextField userField = new JTextField();
	private JPasswordField passField = new JPasswordField();
	private Info sendInfo;
	public Login(){
		
	}
	
	
	
	public JTextField getUserField() {
		return userField;
	}

	public JPasswordField getPassField() {
		return passField;
	}
	public Info getSendInfo() {
		return sendInfo;
}



	public void setSendInfo(Info sendInfo) {
		this.sendInfo = sendInfo;
	}


	public void showWindow(){
		
		JLabel username=new JLabel("Name");
		JLabel password=new JLabel("Password");
		GridLayout gl = new GridLayout(7,1,0,1);
		
		setLayout(gl);
		
		add(username);
		add(userField);
		
		add(password);
		add(passField);
		
		add(login);
		add(register);
		add(cancel);
		setTitle("Login");
		setSize(300,230);
		setLocation(450,200);
		setVisible(true);
		
		login.addActionListener(this);
		cancel.addActionListener(this);
		register.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public boolean checkInfo(String name,String pass){
		
		Info b=new Info();
		Info[] ic=new Info[1000];
		
		ic=b.getFileInfo();
		int n = b.getCount();
	
		
		for(int i=0;i<n;i++){
		String password=ic[i].getPassword();
			String username=ic[i].getName();
			
			
			if(name.equals(username) && pass.equals(password) ){
				setSendInfo(new Info(ic[i].getName(),ic[i].getPassword(),ic[i].getEmail(), ic[i].getCountry(),ic[i].getPhone())) ; 
				return true;
				
			}
				
		}
		
		return false;	
		
	}
	
	



	public void actionPerformed(ActionEvent e){
		String name=userField.getText();
		String pass=passField.getText();
		if(e.getSource()==login){	

			boolean b=checkInfo(name,pass);
			if(b){
				
				DisplayFile dp=new DisplayFile(sendInfo);
				dp.showWindow();
				
				dispose();
			}
				
			else {
				
				jPane.showMessageDialog(null, "Wrong Username or Password");
			}
			
		}
		
		else if(e.getSource() == cancel){
			
			System.exit(0);	
		}
		else if(e.getSource()==register){
			dispose();
			NewProfile n = new NewProfile();
			n.showWindow();
			
		}
	
	}
	
	
	
}
