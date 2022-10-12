package gui006;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Flags implements ItemListener{
	
	private JFrame window=new JFrame();
	
	private String[] flag={"Bangladesh", "USA", "UK", "Iceland"};
	private String[] picPaths={"images02//bangladesh.jpg", "images02//usa.jpg", "images02//uk.jpg", "images02//iceland.jpg"};
	
	private JComboBox flags=new JComboBox(flag);
	private JLabel imageHolder=new JLabel();
	
	public void itemStateChanged(ItemEvent e){
		
		int selectedIndex=flags.getSelectedIndex();
		String selectedPaths=picPaths[selectedIndex];
		ImageIcon icon=new ImageIcon(selectedPaths);
		imageHolder.setIcon(icon);
		
	}
	
	public void initWindow(){
		
		flags.addItemListener(this);
		window.setLayout(null);
		
		flags.setBounds(0, 0, 1000, 50);
		window.add(flags);
		
		imageHolder.setBounds(0, 20, 1000, 500);
		window.add(imageHolder);
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Flags");
		window.setSize(1000, 500);
		window.setLocation(200, 150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
