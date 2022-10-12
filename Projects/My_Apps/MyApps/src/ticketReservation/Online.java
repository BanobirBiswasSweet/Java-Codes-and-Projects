package ticketReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Online implements ActionListener {
	
	private JFrame window=new JFrame();
	
	private JTextField name=new JTextField("");
	private JTextField no=new JTextField("");
	private JTextField ex=new JTextField("");
	
	private JButton con=new JButton("Continue");
	private JButton back=new JButton("Back");
	private JButton exit=new JButton("Exit");
	private String nm;
	
	public Online(){
		
		
	}
	
	public Online(String nm){
		
		this.nm=nm;
	}
	
	public void initWindow(){
		
		JLabel nameF=new JLabel("Enter Card Holder's Name: ");
		JLabel noF=new JLabel("Enter Card Number: ");
		JLabel exF=new JLabel("Enter Expire Date: ");
		
		GridLayout gl=new GridLayout(9, 0, 0, 0);
		window.setLayout(gl);
		
		window.add(nameF);
		window.add(name);
		
		window.add(noF);
		window.add(no);
		
		window.add(exF);
		window.add(ex);
		
		window.add(con);
		window.add(back);
		window.add(exit);
		
		con.addActionListener(this);
		back.addActionListener(this);
		exit.addActionListener(this);
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Onilne Payment");
		window.setSize(800, 500);
		window.setLocation(500, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==con){
			
			JOptionPane.showMessageDialog(null,  "Your ticket has been reserved and just relax. "
					                     + "Thank You"+"\n"+"Have a nice and safe journey");
		}
		else if(e.getSource()==back){
			
			Payment p=new Payment();
			p.showWindow();
			window.dispose();
		}
		else if(e.getSource()==exit){
			
			System.exit(0);
		}
	}

}
