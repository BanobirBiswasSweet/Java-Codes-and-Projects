package combobox;

import javax.swing.*;
import java.awt.event.*;

public class ComboBoxExample implements ItemListener{

	JFrame window = new JFrame();
	
	String[] options = {"flower","city","desert"};
	String[] picPaths = {"images//flower.jpg","images//city.jpg","images//desert.jpg"};
	
	JComboBox combo = new JComboBox(options);
	JLabel imageHolder = new JLabel();
	
	
	public void itemStateChanged(ItemEvent e){
		
		int selectedIndex = combo.getSelectedIndex();
		String selectedPath = picPaths[selectedIndex];
		ImageIcon icon = new ImageIcon(selectedPath);
		imageHolder.setIcon(icon);
	}
	
	
	
	
	
	public void initWindow(){
		
		
		combo.addItemListener(this);
		window.setLayout(null);
		
		combo.setBounds(0,0,500,50);
		window.add(combo);
		imageHolder.setBounds(0,50,500,250);
		window.add(imageHolder);
		
	}
	
	
	
	
	public void showWindow(){
		
		initWindow();
		window.setSize(500,300);
		window.setTitle("ComboBox Example");
		window.setLocation(250,250);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	
}
