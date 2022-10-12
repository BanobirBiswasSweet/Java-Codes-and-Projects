package notepad;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Notepad implements ActionListener {

	JFrame window = new JFrame();
	JTextArea pad = new JTextArea();
	
	
	JMenuItem newItem = new JMenuItem("New");
	JMenuItem openItem = new JMenuItem("Open");
	JMenuItem saveItem = new JMenuItem("Save");
	
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == newItem){
			pad.setText(null);
		}
		else if(e.getSource() == saveItem){
			
			JFileChooser jfc = new JFileChooser("C:\\");
			jfc.showSaveDialog(null);
			File f = jfc.getSelectedFile();
			
			try{
				FileWriter fw = new FileWriter(f,false);
				String data = pad.getText();
				fw.write(data);
				fw.close();
			}
			catch(Exception ex){
				
			}
			
			
		}
		
		
		else if(e.getSource() == openItem){
			
			pad.setText(null);
			
			JFileChooser jfc = new JFileChooser("C:\\");
			jfc.showOpenDialog(null);
			File f = jfc.getSelectedFile();
			
			
			try{
				
				Scanner input = new Scanner(f);
				
				while(input.hasNextLine() == true){
					
					String line = input.nextLine();
					pad.append(line + "\n");
					
				}
				
				input.close();
			}
			catch(Exception ex){
				
			}
			
			
		}
		
		
		
		
	}
	
	
	public void initWindow(){
		
		
		newItem.addActionListener(this);
		openItem.addActionListener(this);
		saveItem.addActionListener(this);
		
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		
		
		
		window.setJMenuBar(bar);
		bar.add(fileMenu);
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		
		
		window.add(pad);
	}
	
	
	public void showWindow(){
		
		initWindow();
		
		window.setSize(500,500);
		window.setTitle("Notepad");
		window.setLocation(250,250);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	
	
}
