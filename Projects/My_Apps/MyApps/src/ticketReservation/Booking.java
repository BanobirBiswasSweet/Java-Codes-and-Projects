package ticketReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Booking implements ActionListener {
	
	private JFrame window=new JFrame();
	private JTextField name=new JTextField("");
	private JTextField address=new JTextField("");
	private JTextField phone=new JTextField("");
	private JTextField email=new JTextField("");
	private JTextField seat=new JTextField("");
	
	private JButton con=new JButton("Continue");
	private JButton back=new JButton("Back");
	private JButton ex=new JButton("Exit");
	
	private int count;
	private String fare;
	private String nm=name.getText();
	private String st;
	
	public Booking(){
		
		
	}
	
	public Booking(int count, String st, String fare, String nm){
		
		this.count=count;
		this.fare=fare;
		this.nm=nm;
		this.st=st;
	}
	
	public void initWindow(){
		
		JLabel nameF=new JLabel("Enter Your Name: ");
		JLabel addressF=new JLabel("Enter Your Address: ");
		JLabel phoneF=new JLabel("Enter Your Phone Number: ");
		JLabel emailF=new JLabel("Enter Your Email: ");
		JLabel seatF=new JLabel("Selected Seats: ");
		
		GridLayout gl=new GridLayout(13, 0, 0, 0);
		window.setLayout(gl);
		
		window.add(nameF);
		window.add(name);
		
		window.add(addressF);
		window.add(address);
		
		window.add(phoneF);
		window.add(phone);
		
		window.add(emailF);
		window.add(email);
		
		window.add(seatF);
		window.add(seat);
		seat.setText(st);
		seat.setEditable(false);
		
		window.add(con);
		window.add(back);
		window.add(ex);
		
		con.addActionListener(this);
		back.addActionListener(this);
		ex.addActionListener(this);
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Reserve Your Seats");
		window.setSize(800, 500);
		window.setLocation(500, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==con){
			
		Double fare=Double.parseDouble(this.fare);
		fare=fare*count;
		
		
		Payment p=new Payment(fare, nm);
		p.showWindow();
		window.dispose();
		
	   }
	   else if(e.getSource()==back){
		
		Seat st=new Seat();
		st.showWindow();
		window.dispose();
	  }
	  else if(e.getSource()==ex){
		
		System.exit(0);
		
	 }
   }
}
	
