package codes;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.*;

public class Info implements ActionListener{

	private JFrame frame;
	private JTextField id;
	private JTextField name;
	private JComboBox department;
	private JButton save;
	private JButton clear;
	private JButton load;
	private int pos;
	
	public Info(){
		frame = new JFrame();
		id = new JTextField();
		name = new JTextField();
		department = new JComboBox(new String [] {"ECE", "ECO", "BBA"});
		save = new JButton("Save");
		clear = new JButton("Clear");
		load = new JButton("Load");
		
		frame.setLayout(new GridLayout(6, 2));
		frame.add(new JLabel("ID"));
		frame.add(id);
		frame.add(new JLabel("Name"));
		frame.add(name);
		frame.add(new JLabel("Department"));
		frame.add(department);
		frame.add(new JLabel());
		frame.add(save);
		frame.add(new JLabel());
		frame.add(clear);
		frame.add(new JLabel());
		frame.add(load);
		
		save.addActionListener(this);
		clear.addActionListener(this);
		load.addActionListener(this);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		pos = 0;
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == save){
			try {
				FileWriter fw = new FileWriter("students.txt", true);
				
				fw.write(id.getText() + "\n");
				fw.write(name.getText() + "\n");
				fw.write(department.getSelectedItem().toString() + "\n");
				
				fw.close();
				
				pos++;
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		
		if(e.getSource() == clear){
			id.setText("");
			name.setText("");
			department.setSelectedIndex(0);
		}
		
		if(e.getSource() == load){
			Student [] students = new Student [pos];
			Student found = null;
			
			try {
				File f = new File("students.txt");
				Scanner scan = new Scanner(f);
				int index = 0;
				
				while(scan.hasNextLine()){
					students[index] = new Student(scan.nextLine(), scan.nextLine(), scan.nextLine());
					index++;
				}
				
				scan.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
			
			for(int i = 0; i < students.length; i++){
				if(students[i] != null && students[i].getId().equals(id.getText())){
					found = students[i];
				}
			}
			
			if(found != null){
				id.setText(found.getId());
				name.setText(found.getName());
				department.setSelectedItem(found.getDepartment());
			}
		}
	}
}