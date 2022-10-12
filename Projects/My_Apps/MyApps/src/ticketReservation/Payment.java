package ticketReservation;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Payment implements ActionListener{
	
	private JFrame window=new JFrame();
	
	//private JTextField amnt=new JTextField("You have to pay: ");
	
	private String[] mbl={"Pay By Mobile", "bkash", "ucash"};
	private JComboBox mobile=new JComboBox(mbl);
	private String[] onln={"Pay Online", "Visa", "Master Card"};
	private JComboBox online=new JComboBox(onln);
	private JButton cash=new JButton("Cash On Delivery");
	
	private JButton con=new JButton("Continue");
	private JButton back=new JButton("Back");
	private JButton ex=new JButton("Exit");
	
	private double f;
	private String fString;
	private String name;
	
	public Payment(){
		
		
	}
	
	public Payment(double fare, String name){
		
		this.f=fare;
		this.fString=Double.toString(f);
		this.name=name;
	}
	
	public void initWindow(){
		
		JLabel amnt=new JLabel("You have to pay: "+fString+ " BDT Only.");
		
		GridLayout gl=new GridLayout(7, 0, 0, 0);
		window.setLayout(gl);
		
		window.add(amnt);
		//amnt.setText(" "+fr+"BDT Only");
		//amnt.setEditable(false);
		
		window.add(mobile);
		window.add(online);
		window.add(cash);
		
		window.add(con);
		window.add(back);
		window.add(ex);
		
		cash.addActionListener(this);
		con.addActionListener(this);
		back.addActionListener(this);
		ex.addActionListener(this);
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Payment");
		window.setSize(800, 500);
		window.setLocation(500, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		String mbl=mobile.getSelectedItem().toString();
		String onln=online.getSelectedItem().toString();
		
		if(e.getSource()==mbl){
			
			Mobile mb=new Mobile(name);
			mb.showWindow();
			window.dispose();
		}
		else if(e.getSource()==onln){
			
			JOptionPane.showMessageDialog(null, "Mr. "+name+" You would be redirected to a third party payment gateway where "+"\n"
				    + " you can pay with your credit or debit card.Your payment transaction are 100% secure.On"+"\n"
				    + " successful payment, you will get a confirmation message.");
			
			Online on=new Online(name);
			on.showWindow();
			window.dispose();
		}
		else if(e.getSource()==cash){
			
			Cash c=new Cash(name);
			c.showWindow();
			window.dispose();
			
		}
		else if(e.getSource()==back){
			
			Booking book=new Booking();
			book.showWindow();
			window.dispose();
		}
		else if(e.getSource()==ex){
			
			System.exit(0);
		}
		
	}
	
}
