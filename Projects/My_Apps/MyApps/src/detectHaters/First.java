package detectHaters;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class First implements ActionListener {
	
	JFrame window = new JFrame();
	JButton dt = new JButton("Detect");
	JButton ex = new JButton("Exit");
	
	JTextField y_name = new JTextField();
	JTextField f_name = new JTextField();
	JTextField ntr = new JTextField();
	
	
	public void initWindow(){
		
		JLabel ynameLabel = new JLabel("Your Name: ");
		JLabel fnameLabel = new JLabel("Friend's Name: ");
		JLabel ntrLabel = new JLabel("Nature: ");
		
		
		dt.addActionListener(this);
		ex.addActionListener(this);
		
		GridLayout gl = new GridLayout(4,2,5,5);
		window.setLayout(gl);
		
		window.add(ynameLabel);
		window.add(y_name);
		
		window.add(fnameLabel);
		window.add(f_name);
		
		window.add(ntrLabel);
		window.add(ntr);
		ntr.setEditable(false);
		
		window.add(dt);
		window.add(ex);
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Know Your Friends");
		window.setSize(300,150);
		window.setLocation(500, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
public void actionPerformed(ActionEvent e){
		
		String fname=f_name.getText();
		
		if(e.getSource()==dt){
		
		if(fname.equals("mimi")){
			
			ntr.setText("Selfie Queen!");
		}
		
		else if(fname.equals("dishan")){
			
			ntr.setText("Dost, Amake java shikha!");
		}
		
        else if(fname.equals("sojol")){
			
			ntr.setText("Dost, Amito Sesh!");
		}
		
        else if(fname.equals("aankhi")){
			
			ntr.setText("Col Selfie Tuli!");
		}
		
        else if(fname.equals("mitu")){
			
			ntr.setText("Jhograte!");
		}
		
        else if(fname.equals("asha")){
			
			ntr.setText("Ami Selfie Tulbona!");
		}
		
       else if(fname.equals("arfan")){
			
			ntr.setText("Haters Detected!!!");
		}
		
       else if(fname.equals("shuvro")){
			
			ntr.setText("Desparate programmer!");
		}
	}
		
       else if(e.getSource()==ex){
    	   
    	   System.exit(0);
       }
	}
	

}
