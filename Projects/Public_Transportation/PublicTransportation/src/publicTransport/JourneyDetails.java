package publicTransport;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Scanner;

public class JourneyDetails implements ActionListener {

	private JFrame window = new JFrame();
	
	private JTextField bus = new JTextField();
	private JTextField From = new JTextField();
	private JTextField To = new JTextField();
	private JTextField Date = new JTextField();
	private JTextField busType = new JTextField();
	private JTextField Dep = new JTextField();
	private JTextField Arri = new JTextField();
	// JButton back = new JButton("back");
	private JButton ok = new JButton("Ok");
	private String n;
	
	public JourneyDetails(String name){
		this.n = name;
		
	}
	
	public void initWindow()
	{
		GridLayout g1 = new GridLayout(9, 0, 5, 5);
		window.setLayout(g1);

	
	}
	
	public void showWindow()
	{
        initWindow();
        String from = "";
		String to= "";
		String d = "";
		String a = "";
		String date =" ";
		String type = "";
		
		
		window.setSize(500,600);
		window.setLocation(400,70);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		try{
			File f = new File("Bus.txt");
			Bus [] b = new Bus [20];
			
			
			int index = 0;
			Scanner s = new Scanner(f);
			while(s.hasNextLine()){
			
				b[index] = new Bus(s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),Integer.parseInt(s.nextLine()));
				//System.out.println(b[index]);
				index++;
			}
			
			for(int i = 0;i<b.length;i++){
				if(b[i]!=null && b[i].getName().equals(n)){
					from = b[i].getFrom();
					to = b[i].getTo();
			        date = b[i].getDate();
			        d = b[i].getDeparture_Time();
			        a = b[i].getArrival_Time();
			        type = b[i].getType();
					
					
					
				}
				
				
				
			}
		}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		window.add(bus);
		window.add(busType);
		window.add(From);
		window.add(To);
		window.add(Date);
		window.add(Dep);
		window.add(Arri);
		window.add(new JLabel());
		//window.add (back);
		//back.addActionListener(this);
		window.add(ok);
		ok.addActionListener(this);
		From.setText(" Start From: "+from);
		From.setEditable(false);
		To.setText("End to: "+to);
		To.setEditable(false);
		Date.setText("Journey Date: "+date);
		Date.setEditable(false);
		bus.setText("Bus name :"+n);
		bus.setEditable(false);
		busType.setText("Bus Type : "+type);
		busType.setEditable(false);
		Arri.setText("Arrival Time: "+a);
		Arri.setEditable(false);
		Dep.setText("Deparature Time : "+d);
		Dep.setEditable(false);
		
		window.setTitle("JOURNEY DETAILS");

		window.setVisible(true);
		
		
	}
	
	

	public void actionPerformed(ActionEvent e) {
		
	     if(e.getSource()==ok){
			
			JOptionPane.showMessageDialog(null, "Thank you for choosing our system."+"\n"+"Have a nice and safe journey.");
			window.dispose();
		}
		
	}
	
	
}
