package bmi;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class BMI implements ActionListener {
	
	JFrame window = new JFrame();
	JButton calculate = new JButton("Calculate BMI");
	JButton cancel = new JButton("Cancel");
	
	JTextField weight = new JTextField();
	JTextField height = new JTextField();
	JTextField bmi = new JTextField();
	
	
	public void initWindow(){
		
		JLabel weightLabel = new JLabel("Weight in Kgs");
		JLabel heightLabel = new JLabel("Height in Meter");
		JLabel bmiLabel = new JLabel("BMI");
		
		
		calculate.addActionListener(this);
		cancel.addActionListener(this);
		
		GridLayout gl = new GridLayout(4,2,5,5);
		window.setLayout(gl);
		
		window.add(weightLabel);
		window.add(weight);
		
		window.add(heightLabel);
		window.add(height);
		
		window.add(bmiLabel);
		window.add(bmi);
		
		window.add(calculate);
		window.add(cancel);
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("BMI Calculator");
		window.setSize(300,150);
		window.setLocation(500, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		
			if(e.getSource() == cancel){
				window.dispose();
			}
			
			else if(e.getSource() == calculate){
				
				
				double w=Double.parseDouble(weight.getText());
				double h=Double.parseDouble(height.getText());
				double result=(w/(h*h));
				
				bmi.setText(result + "");
				 
			}
		
	}
	

}
