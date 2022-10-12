package gui002;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Distance implements ActionListener {
	
	   JFrame window=new JFrame("Distance Calculator");
	   JButton show=new JButton("Show Distance");
	   JButton exit=new JButton("Exit");
	   
	   JTextField start_Point=new JTextField();
	   JTextField end_Point=new JTextField();
	   JTextField show_Path=new JTextField();
	   
	   public void initWindow(){
		   
		   JLabel startPointLabel=new JLabel("Enter Start Point: ");
		   JLabel endPointLabel=new JLabel("Enter Ending Point: ");
		   JLabel showDistanceLabel=new JLabel("Distance: ");
		   
		   show.addActionListener(this);
		   exit.addActionListener(this);
		   
		   GridLayout gl=new GridLayout(4, 2, 5, 5);
		   window.setLayout(gl);
		   
		   
		   window.add(startPointLabel);
		   window.add(start_Point);
		   
		   window.add(endPointLabel);
		   window.add(end_Point);
		   
		   window.add(showDistanceLabel);
		   window.add(show_Path);
		   show_Path.setEditable(false);
		   
		   window.add(show);
		   window.add(exit);
		   
	   }
	   
	   public void showWindow(){
		   
		   initWindow();
		   
		   window.setTitle("Distance Calculator");
		   window.setSize(300, 150);
		   window.setLocation(350, 350);
		   window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   window.setVisible(true);
		   
	   }
	   
	   public void actionPerformed(ActionEvent e){
		   
		   boolean b = e.getSource()==exit;
		if(b){
			   
			   window.dispose();
		   }
		   
		   else if(e.getSource()==show){
			   
			   String start=start_Point.getText();
			   String end=end_Point.getText();
			   double distance=194.0;
			   
			   if((start.equals ("Dhaka") && end.equals ("Faridpur")) || (start.equals ("Faridpur") && end.equals ("Dhaka"))){
			    	
				   show_Path.setText(distance+" kilometer.");
			   }
		
		   }
		   
	   }

}
