package ticketReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Proceed implements ActionListener {
	
	private JFrame window=new JFrame();
	
	private JTextField con=new JTextField("");
	
	private JButton pro=new JButton("Proceed");
	private JButton can=new JButton("Cancel");
	
	public Proceed(){
		
		
	}
	
	public void initWindow(){
		
		JLabel conF=new JLabel("Confirmation");
		con.setText("Your Account has been created. Have a better experience");
		con.setEditable(false);
		
		GridLayout gl=new GridLayout(4, 0, 5, 5);
		window.setLayout(gl);
		
		window.add(con);
		window.add(conF);
		
		window.add(pro);
		window.add(can);
		
		pro.addActionListener(this);
		can.addActionListener(this);
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Proceed");
		window.setSize(400, 200);
		window.setLocation(500, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==pro){
			
			FirstWindow log=new FirstWindow();
			log.showWindow();
			window.dispose();
		}
		else if(e.getSource()==can){
			
			System.exit(0);
		}
		
		
	}

}
