package ticketReservation;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Destinations implements ActionListener{
	
	private JFrame window=new JFrame();
	
	private String[] frm={"From", "Dhaka"};
	private JComboBox from=new JComboBox(frm);
	
	private String[] t={"To", "Rajshahi", "Khulna", "Syleht", "Chittagong", "Jessore", "Barishal", "Rangpur"};
	private JComboBox to=new JComboBox(t);
	
	private String[] dt={"Avaiable Dates", "05-08-2015", "06-08-2015"};
	private JComboBox date=new JComboBox(dt);
	
	private JButton find=new JButton("Find Transport");
	private JButton can=new JButton("Cancel");
	
	public Destinations(){
		
		
	}
	
	public void initWindow(){
		
		GridLayout gl=new GridLayout(5, 0, 0, 0);
		window.setLayout(gl);
		
		window.add(from);
		window.add(to);
		window.add(date);
		
		window.add(find);
		window.add(can);
		
		find.addActionListener(this);
		can.addActionListener(this);
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Destinations");
		window.setSize(500, 250);
		window.setLocation(500, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	
	Info ic=new Info();
	
	public Destinations(Info info){
		ic=info;
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==can){
			
			System.exit(0);
		}
		
		else if(e.getSource()==find){
			
			String From = from.getSelectedItem().toString();
			String To = to.getSelectedItem().toString();
			
			Find_Transport ft=new Find_Transport(From, To);
			ft.showWindow();
			window.dispose();
		}
	}

}
