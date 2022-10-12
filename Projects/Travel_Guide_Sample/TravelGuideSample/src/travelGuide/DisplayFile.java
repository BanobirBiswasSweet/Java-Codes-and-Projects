package travelGuide;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.*;
import java.awt.*;


public class DisplayFile extends JFrame implements ActionListener{
		
		private JButton dhaka = new JButton("Dhaka");
		private JButton chittagong = new JButton("Chittagong");
		private JButton khulna = new JButton("Khulna");
		private JButton syleht = new JButton("Syleht");
		private JButton rangpur = new JButton("Rangpur");
		private JButton rajshahi = new JButton("Rajshahi");
		private JButton borishal = new JButton("Borishal");
	
		Info ic=new Info();
	
		public DisplayFile(Info info){
			ic=info;
		}
		
		public void initGUI(){
			
			GridLayout gl=new GridLayout(7,0);			
			setLayout(gl);
			
			add(dhaka);
			add(chittagong);
			add(khulna);
			add(syleht);
			add(rangpur);
			add(rajshahi);
			add(borishal);
			
			dhaka.addActionListener(this);
			chittagong.addActionListener(this);
			khulna.addActionListener(this);
			syleht.addActionListener(this);
			rangpur.addActionListener(this);
			
			rajshahi.addActionListener(this);
			borishal.addActionListener(this);
			
			
			
		}
		
		public void showWindow(){
			
			initGUI();
			setSize(300,500);
			setLocation(500,150);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
					
		}
		
		public void actionPerformed(ActionEvent e){
			desc d;
			if(e.getSource()== dhaka){
				d = new desc("DHAKA",ic);
				d.showWindow();
				dispose();
			}
			else if(e.getSource()== chittagong){
				d = new desc("CHITTAGONG",ic);
				d.showWindow();
				dispose();
			}
			else if(e.getSource()== khulna){
				d = new desc("KHULNA",ic);
				d.showWindow();
				dispose();
			}
			else if(e.getSource()== syleht){
				d = new desc("SYLEHT",ic);
				d.showWindow();
				dispose();
			}
			else if(e.getSource()== rangpur){
				d = new desc("RANGPUR",ic);
				d.showWindow();
				dispose();
			}
			else if(e.getSource()== rajshahi){
				d = new desc("RAJSHAHI",ic);
				d.showWindow();
				dispose();
			}
			else if(e.getSource()== borishal){
				d = new desc("BORISHAL",ic);
				d.showWindow();
				dispose();
			}
		}
		

	
}
