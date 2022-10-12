package travelGuide;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;

import javax.swing.*;

public class Booking extends JFrame implements ActionListener {
	private JLabel name = new JLabel("Name");
	private JLabel email = new JLabel("Email");
	private JLabel address = new JLabel("Address");
	private JLabel cardName = new JLabel("Card Name");
	private JLabel cardNo = new JLabel("Card No");
	private JLabel cardPin = new JLabel("Pin");
	private JLabel exp = new JLabel("Exp");
	JOptionPane jPane;
	
	private JTextField nameF;
	private JTextField emailF;
	private JTextField addressF = new JTextField("");
	private JTextField cardNameF = new JTextField("");
	private JTextField cardNoF = new JTextField("");
	private JTextField cardPinF = new JTextField("");
	private JTextField expF = new JTextField("");
	
	private JButton b1= new JButton("OK");

	private String[] info;
	Info i;

	public Booking(Info i1, String[] s) {
		info = s;
		i = i1;
		

	}

	public void showWindow() {
		 
		GridLayout gl=new GridLayout(15,0);			
		setLayout(gl);
		
		nameF = new JTextField(i.getName());
		emailF = new JTextField(i.getEmail());
		
		
		
		add(name);
		add(nameF);		
		add(email);		
		add(emailF);			
		add(address);		
		add(addressF);		
		add(cardName);		
		add(cardNameF);		
		add(cardNo);		
		add(cardNoF);		
		add(cardPin);		
		add(cardPinF);		
		add(exp);		
		add(expF);		
		add(b1);

		setSize(300, 600);
		setLocation(500, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		b1.addActionListener(this);
		
	}
	
	public void fileWrite(){
		File file=new File(nameF.getText()+".txt");
		
		try{
			
			
			FileWriter fw = new FileWriter(file,false);
			
				
			fw.write("NAME: "+nameF.getText()+"\n");
			fw.write("EMAIL: "+emailF.getText()+"\n");
				
			fw.write("ADDRESS: "+addressF.getText()+"\n");
			fw.write("CARD NAME: "+cardNameF.getText()+"\n");
			fw.write("CARD NUMBER: "+cardNoF.getText()+"\n");
			fw.write("CARD PIN : "+cardPinF.getText()+"\n");
			fw.write("CARD EXP: "+expF.getText()+"\n");
			fw.write("Package Bought:\n" + info[0] + "\n" + info[1] + "\n" + info[2] + "\n" + info[3] + "\n" + info[4] + "\n" + info[5] + "\n");
				
			
			
			fw.close();
		}
			catch(Exception x){
				System.out.println("Problem with writing into file");
			}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== b1){
			fileWrite();
			jPane.showMessageDialog(null, "Booking has been confermed and your paper will be send to your home.");
			System.exit(0);
		}
	}

}
