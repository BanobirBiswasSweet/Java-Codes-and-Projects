package exceptions;

import java.io.*;
import java.util.*;

public class Example002 {

	public static void main(String[] args) {
		
		File f = new File("C:\\DataFiles\\random.txt");
		
		System.out.println("Size of File :: " + f.length());
		System.out.println("Last Modified :: " + f.lastModified());
		Date dateLastModified = new Date(f.lastModified());

		System.out.println("Last Modified :: " + dateLastModified.toString());
		System.out.println("Is this a file? " + f.isFile());
		System.out.println("Is this a folder? " + f.isDirectory());
		
		System.out.println("Do we have read permissions? " + f.canRead());
		
		f.delete();
		
	}

}
