package gui005;

import javax.swing.*;

import java.awt.event.*;

public class Cars implements ItemListener {
	
	JFrame window=new JFrame();
	
	String[] options={"audi", "bently", "bmw", "gmc", "lamborghini", "porsche", "rolls royce"};
	
	String[] picPaths={"images01//audi.jpg", "images01//bently.jpg", "images01//bmw.jpg", "images01//gmc.jpg", "images01//lamborghini.jpg",
			           "images01//porsche.jpg", "images01//rolls royce.jpg"};
	
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
		
		combo.setBounds(0, 0, 985, 50);
		window.add(combo);
		
		imageHolder.setBounds(0, 20, 1000, 500);
		window.add(imageHolder);
	}
	
	public void showWindow(){
		
		initWindow();
		window.setSize(1000, 500);
		window.setTitle("Cars");
		window.setLocation(200, 150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
}

