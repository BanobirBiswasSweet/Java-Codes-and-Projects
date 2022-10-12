package ticketReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cash implements ActionListener{
	
	private JFrame window=new JFrame();
	
	private JTextArea ta=new JTextArea();
	
	private JButton ok=new JButton("Ok");
	private JButton back=new JButton("Back");
	private JButton ex=new JButton("Exit");
	
	private String name;
	
	public Cash(){
			
	}
	
	public Cash(String name){
		this.name=name;
	}
	
	public void initWindow(){
		
		GridLayout gl=new GridLayout(4, 0, 0, 0);
		window.setLayout(gl);
		
		window.add(ta);
		ta.setText("Mr. "+name+" Your ticket will be reached at your address which "+"\n"+"you will provide by our "
				    + "agent directly within a day. Please pay the due to our agent "+"\n"+"and be assured about your ticket."
				    +" Thank you. Have a safe and nice journey.");
		
		window.add(ok);
		window.add(back);
		window.add(ex);
		
		ok.addActionListener(this);
		back.addActionListener(this);
		ex.addActionListener(this);
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Cash on Delivery");
		window.setSize(800, 500);
		window.setLocation(500, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==ok){
			
			JOptionPane.showMessageDialog(null,  "Thank you for choosing our system. Have a nice and safe journey.");
		}
		else if(e.getSource()==back){
			
			Payment p=new Payment();
			p.showWindow();
			window.dispose();
		}
		else if(e.getSource()==ex){
			System.exit(0);
		}
	}

}
