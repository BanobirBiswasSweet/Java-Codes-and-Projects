package ticketReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Scanner;

public class Find_Transport implements ActionListener{
	
	private JFrame window=new JFrame();
	private JComboBox b;
	private String from;
	private String to;
	private String fare;
	private String name;
	String nm;
	
	private JButton con=new JButton("Confirm");
	private JButton back=new JButton("Back");
	private JButton ex=new JButton("Exit");
	
	
	public Find_Transport(String from, String to){
		
		this.from=from;
		this.to=to;
	}
	
	public void initWindow(){
		
		GridLayout gl=new GridLayout(4, 0, 0, 0);
		window.setLayout(gl);
		
		if(to.equals("Sylhet")){
			String [] trans = {"Kalni","Ena"};
			b = new JComboBox(trans);
			}
		else if(to.equals("Rajshahi")){
			String [] trans = {"Silk","Padma"};
			b = new JComboBox(trans);
			
		}
		else if(to.equals("Khulna")){
			String [] trans = {"Tisha","Shohag"};
			b = new JComboBox(trans);
			
		}
		
		else if(to.equals("Barisal")){
			String [] trans = {"Dhansiri","Shamoli"};
			b = new JComboBox(trans);
			
		}
		else if(to.equals("Chittagong")){
			String [] trans = {"Agrabad","Kornofuli"};
			b = new JComboBox(trans);
			
		}
		else if(to.equals("Rangpur")){
			String [] trans = {"GreenLine","Hanif"};
			b = new JComboBox(trans);
			
		}
		
		window.add(b);
		window.add(con);
		window.add(back);
		window.add(ex);
		
		con.addActionListener(this);
		back.addActionListener(this);
		ex.addActionListener(this);
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Select Transport");
		window.setSize(800, 500);
		window.setLocation(500, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==con){
			String fare="0";
			String name = b.getSelectedItem().toString();
			
			
			try{
				File f = new File("bus.txt");
				Bus [] b = new Bus [20];
				
				
				int index = 0;
				Scanner s = new Scanner(f);
				while(s.hasNextLine()){
				
					b[index] = new Bus(s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),Integer.parseInt(s.nextLine()));
					//System.out.println(b[index]);
					index++;
				}
				
				for(int i = 0;i<b.length;i++){
					if(b[i]!=null && b[i].getName().equals(name)){
						fare = ( b[i].getFare());
						//System.out.println("from FInd "+name+ "= " +fare);
					}
					
				}

				
				
			}
				catch(Exception ex){
					System.out.println(ex.getMessage());
				}
			
			Seat st=new Seat(fare, nm);
			st.showWindow();
			window.dispose();
		}
		else if(e.getSource()==back){
			
			Destinations dst=new Destinations();
			dst.showWindow();
			window.dispose();
		}
		else if(e.getSource()==ex){
			
			System.exit(0);
		}
	}
	

}
