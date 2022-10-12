package travelGuide;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class desc extends JFrame implements ActionListener{
	private JButton button1 = new JButton("Book Package1");
	private JButton button2 = new JButton("Book Package2");
	private JButton button3 = new JButton("Book Package3");
	
	private JScrollPane s1;
	private JScrollPane s2;
	private JScrollPane s3;
	private JScrollPane s4;
	
	private JTextArea label1;
	private JTextArea label2;
	private JTextArea label3;
	private JLabel descName;
	private JTextArea desc;
	
	private JPanel p1= new JPanel();
	private JPanel p2 = new JPanel();
	private JPanel p3 = new JPanel();
	private JPanel p4 = new JPanel();
	
	private String place;
	private String[] fullInfo= new String[18]; 
	private String[] fullInfo1= new String[6]; 
	private String[] fullInfo2= new String[6]; 
	private String[] fullInfo3= new String[6]; 
	private Info ic;
	
	public desc(String p, Info ic1) {
		ic=ic1;
		place=p;
		readDesc();
		
	}
	
public void showWindow(){
		
		GridLayout gl = new GridLayout(4,0,0,0);
		GridLayout gl2 = new GridLayout(7,0,0,0);
		BorderLayout b= new BorderLayout();
		BorderLayout b1= new BorderLayout();
		BorderLayout b2= new BorderLayout();
		BorderLayout b3= new BorderLayout();
		
		label1.setEditable(false);
		label2.setEditable(false);
		label3.setEditable(false);
		desc.setEditable(false);
		
		s1= new JScrollPane(label1);
		s2= new JScrollPane(label2);
		s3= new JScrollPane(label3);
		s4= new JScrollPane(desc);
		
		p1.setSize(450, 100);
		p2.setSize(450, 150);
		p3.setSize(450, 150);
		p4.setSize(450, 150);
		
		
		setLayout(gl);
		p1.setLayout(b);
		p2.setLayout(b1);
		p3.setLayout(b2);
		p4.setLayout(b3);
		p1.add(descName, b.NORTH);
		p1.add(s4,b.CENTER);
		
		p2.add(s1,b1.CENTER);
		p2.add(button1,b1.SOUTH);
		
		p3.add(s2,b2.CENTER);
		p3.add(button2,b2.SOUTH);
		
		p4.add(s3,b3.CENTER);
		p4.add(button3, b3.SOUTH);
		
		
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		setTitle("Packages");
		setSize(450,550);
		setLocation(300,100);
		setVisible(true);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
		
	}

	public void readDesc(){
		File file=new File(place +".txt");
		
		int i=0;
		try{
				Scanner scan=new Scanner(file);
				String d = scan.nextLine();
				
				while(scan.hasNextLine()==true){
					fullInfo[i] = scan.nextLine();
					
					i++;
				}
				System.out.println();
				scan.close();	
				desc= new JTextArea(d);
				label1= new JTextArea(fullInfo[0] + "\n" + fullInfo[1] + "\n" + fullInfo[2]+ "\n" + fullInfo[3]+ "\n" + fullInfo[4]+ "\n" + fullInfo[5]);
				label2= new JTextArea(fullInfo[6] + "\n" + fullInfo[7]+ "\n"  + fullInfo[8]+ "\n"  + fullInfo[9]+ "\n"  + fullInfo[10]+ "\n"  + fullInfo[11]);
				label3= new JTextArea(fullInfo[12]+ "\n" + fullInfo[13] + "\n" + fullInfo[14]+ "\n"  + fullInfo[15]+ "\n"  + fullInfo[16]+ "\n"  + fullInfo[17]);
				descName =new JLabel("\t\t\t"+place);
				
				for(int j=0; j< 6; j++){
					fullInfo1[j]=fullInfo[j];
					fullInfo2[j]= fullInfo[j+6];
					fullInfo3[j]=fullInfo[j+12];
				}
				
		}
		catch(Exception e){
			System.out.println("Problem while getting info from file");
		}
	}
	


	public void actionPerformed(ActionEvent e){
		Booking b;
		if(e.getSource()== button1){
			b= new Booking(ic,fullInfo1);
			b.showWindow();
		}
		else if(e.getSource()== button2){
			b= new Booking(ic,fullInfo2);
			b.showWindow();
		}
		else if(e.getSource()== button3){
			b= new Booking(ic,fullInfo3);
			b.showWindow();
		}
	}
	
}
