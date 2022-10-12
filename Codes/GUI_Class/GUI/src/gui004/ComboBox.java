package gui004;

import javax.swing.*;

import java.awt.event.*;

public class ComboBox implements ItemListener {
	
	JFrame window=new JFrame();
	
	String[] options={"Anup", "Maung Kaw Wang", "Nea Jaw", "Panjab", "Sweet"};
	
	String[] picPaths={"images//Anup.jpg", "images//Maung Kaw Wang.jpg", 
			          "images//Nea Jaw.jpg", "images//Panjab.jpg", "images//Sweet.jpg"};
	
	JComboBox combo=new JComboBox(options);
	JLabel imageHolder=new JLabel();
	
	
	public void itemStateChanged(ItemEvent e){
		
		int selectedIndex=combo.getSelectedIndex();
		String selectedPaths=picPaths[selectedIndex];
		ImageIcon icon=new ImageIcon(selectedPaths);
		imageHolder.setIcon(icon);	
		
	}
	
	
	
	public void initWindow(){
		
		combo.addItemListener(this);
		window.setLayout(null);
		
		combo.setBounds(0, 0, 500, 50);
		window.add(combo);
		
		imageHolder.setBounds(0, 50, 500, 250);
		window.add(imageHolder);
		
		
	}
	
	public void showWindow(){
		
		initWindow();
		
		window.setSize(500, 300);
		window.setTitle("Combo Box");
		window.setLocation(300, 250);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}

}
