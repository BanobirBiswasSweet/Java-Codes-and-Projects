package ticketReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LogIn implements ActionListener{
	
	private JFrame window=new JFrame();
	
	private JTextField name=new JTextField("");
	private JPasswordField pass=new JPasswordField("");
	private Info sendInfo;
	
	private JButton con=new JButton("Continue");
	private JButton back=new JButton("Back");
	private JButton ex=new JButton("Exit");
	
	public LogIn(){
		
		
	}
	
	public void initWindow(){
		
		JLabel nameF=new JLabel("Name");
		JLabel passF=new JLabel("Password");
		
		GridLayout gl=new GridLayout(7, 0, 0, 0);
		window.setLayout(gl);
		
		window.add(nameF);
		window.add(name);
		
		window.add(passF);
		window.add(pass);
		
		window.add(con);
		window.add(back);
		window.add(ex);
		
		con.addActionListener(this);
		back.addActionListener(this);
		ex.addActionListener(this);
		
	}
	
	public void setSendInfo(Info sendInfo) {
		this.sendInfo = sendInfo;
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Log In");
		window.setSize(500, 250);
		window.setLocation(500, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	public boolean checkInfo(String name,String pass){
		
		Info b=new Info();
		Info[] ic=new Info[1000];
		
		ic=b.getFileInfo();
		int n = b.getCount();

		
		for(int i=0;i<n;i++){
			
			String username=ic[i].getName();
		    String password=ic[i].getPass();
			
			
			if(name.equals(username) && pass.equals(password) ){
				setSendInfo(new Info(ic[i].getName(),ic[i].getPhone(),ic[i].getEmail(), ic[i].getPass(), ic[i].getConPass())); 
				return true;
				
			}
				
		}
		
		return false;	
		
	}
	
	public void actionPerformed(ActionEvent e){
		String name=this.name.getText();
		String pass=this.pass.getText();
		
		if(e.getSource()==con){	

			boolean b=checkInfo(name,pass);
			if(b){
				
				Destinations de= new Destinations(sendInfo);
				de.showWindow();
				
				window.dispose();
			}
				
			else {
				
				JOptionPane.showMessageDialog(null, "Wrong Username or Password");
			}
			
		}
		
		if(e.getSource()==ex){
			System.exit(0);
		}
		
		else if(e.getSource()==back){
			
			FirstWindow fw=new FirstWindow();
			fw.showWindow();
			window.dispose();
		}
	}

}
