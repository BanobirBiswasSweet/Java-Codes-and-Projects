package ticketReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstWindow implements ActionListener{
	
	private JFrame window=new JFrame();
	
	private JButton log=new JButton("Log In");
	private JButton creat=new JButton("Create A new Profile");
	private JButton ex=new JButton("Exit");
	
	public void initWindow(){
		
		GridLayout gl=new GridLayout(3, 0, 5, 5);
		window.setLayout(gl);
		
		window.add(log);
		window.add(creat);
		window.add(ex);
		
		log.addActionListener(this);
		creat.addActionListener(this);
		ex.addActionListener(this);
	}
	
	public FirstWindow(){
		
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Begining");
		window.setSize(500, 250);
		window.setLocation(500, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==ex){
			
			System.exit(0);
		}
		else if(e.getSource()==creat){
			
			Registration reg=new Registration();
			reg.showWindow();
			window.dispose();
		}
		
		else if(e.getSource()==log){
			
			LogIn lg=new LogIn();
			lg.showWindow();
			window.dispose();
		}
	}

}
