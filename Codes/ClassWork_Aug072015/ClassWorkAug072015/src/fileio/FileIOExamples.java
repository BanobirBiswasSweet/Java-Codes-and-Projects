package fileio;

import java.io.*;
import java.util.*;

public class FileIOExamples {

	public static void main(String[] args) {
		
		//write2File("C:\\DataFiles\\SampleFile.txt","Welcome to the file i/o class\n");
	
		readFromFile("E:\\DOCS\\sample.txt");
	
	}
	
	public static void readFromFile(String path){
		
		try{
			File f = new File(path);
		
			Scanner input = new Scanner(f);
			
			String line="";
			
			
			while(input.hasNextLine() == true){
				
				line = input.nextLine();
				//System.out.println(line);
				
				int a=Integer.parseInt(line);
				int b=Integer.parseInt(input.nextLine());
				
				System.out.println("("+a+","+b+")");
			
				
			}
			
			
		}
		catch(Exception e){
			
			System.out.println("File error");
		}
		
	}
	
	
	public static void write2File(String path,String data){
		
		try{
			FileWriter fw = new FileWriter(path,true);
			fw.write(data);
			fw.close();
			
			
		}
		catch(Exception e){
			
			System.out.println("File Error");
		}
		
	}
	

}
