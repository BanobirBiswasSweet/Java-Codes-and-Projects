package ticketReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;

public class Registration implements ActionListener{
	
	private JFrame window=new JFrame();
	
	private JTextField name=new JTextField("");
	private JTextField phone=new JTextField("");
	private JTextField email=new JTextField("");
	private JPasswordField pass=new JPasswordField();
	private JPasswordField con_Pass=new JPasswordField();
	private JTextField age=new JTextField("");
	
	private String[] gen={"Gender", "Male", "Female"};
	private JComboBox gender= new JComboBox(gen);
	
	private JButton con=new JButton("Confirm");
	private JButton back=new JButton("Back");
	private JButton ex=new JButton("Exit");
	
	public static int count;
	
	public Registration(){
		
		
	}
	
	public void initWindow(){
		
		JLabel nameF=new JLabel("Enter Name");
		JLabel phoneF=new JLabel("Enter Phone Number");
		JLabel emailF=new JLabel("Enter Email Address");
		JLabel passF=new JLabel("Choose Password");
		JLabel con_PassF=new JLabel("Confirm Password");
		JLabel ageF=new JLabel("Enter Your Age");
		
		GridLayout gl=new GridLayout(16, 0, 0, 0);
		window.setLayout(gl);
		
	    window.add(nameF);
	    window.add(name);
	    
	    window.add(phoneF);
	    window.add(phone);
	    
	    window.add(emailF);
	    window.add(email);
	    
	    window.add(passF);
	    window.add(pass);
	    
	    window.add(con_PassF);
	    window.add(con_Pass);
	    
	    window.add(ageF);
	    window.add(age);
	    
	    window.add(gender);
	    
	    window.add(con);
	    window.add(back);
	    window.add(ex);
	    
	    con.addActionListener(this);
	    back.addActionListener(this);
	    ex.addActionListener(this);
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Create A New Profile");
		window.setSize(800, 500);
		window.setLocation(400, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	

	public static int getCount()
	{
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

			fw.write(name.getText()+"\n");
			fw.write(phone.getText()+"\n");
			fw.write(email.getText()+"\n");
			fw.write(pass.getText()+"\n");
			fw.write(con_Pass.getText()+"\n");
			
			
			
			fw.close();
			count++;
			
		}
			catch(Exception x){
				System.out.println("Problem with registration");
			}
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		String p=pass.getText();
		String cp=con_Pass.getText();
		
		if(e.getSource()==ex){
			
			System.exit(0);
		}
		
		else if(e.getSource()==back){
			
			FirstWindow lg=new FirstWindow();
			lg.showWindow();
			window.dispose();
		}
		else if(e.getSource()==con && p.equals(cp)){
			
			fileWrite();
			Proceed pro=new Proceed();
			pro.showWindow();
			window.dispose();
		}
		else{
			
			JOptionPane.showMessageDialog(null, "Passwords didn't match. Try Again Accurately.");
		}
	}

}
