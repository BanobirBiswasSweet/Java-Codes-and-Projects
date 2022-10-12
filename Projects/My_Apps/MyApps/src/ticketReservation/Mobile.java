package ticketReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mobile implements ActionListener{
	
	private JFrame window=new JFrame();
	
	private JTextField trans=new JTextField("Transaction Number: 01845264121");
	private JButton con=new JButton("Continue");
	private JButton back=new JButton("Back");
	private JButton ex=new JButton("Exit");
	private String name;
	
	public Mobile(String name){
		
		this.name=name;
	}
	
	public void initWindow(){
		
		GridLayout gl=new GridLayout(4, 0, 0, 0);
		window.setLayout(gl);
		
		window.add(trans);
		trans.setEditable(false);
		window.add(con);
		window.add(back);
		window.add(ex);
		
		con.addActionListener(this);
		back.addActionListener(this);
		ex.addActionListener(this);
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Mobile payment");
		window.setSize(500, 250);
		window.setLocation(500, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==con){
			
			JOptionPane.showMessageDialog(null, "Mr. "+name+" Your ticket will be reserved and"+"\n" +"inactive for 60minutes from the time"
		            +"\n" +"of booking.Pay through mobile to our"+"\n"+ "transaction number"
				     +"\n" +"and confirm your transaction ID"+"\n" +"within 60 minute to get the "+"\n" +
		              "confirmation message.");
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
